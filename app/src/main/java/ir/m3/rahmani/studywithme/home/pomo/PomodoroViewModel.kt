package ir.m3.rahmani.studywithme.home.pomo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.core.shared.model.UserSharedPref
import ir.m3.rahmani.core.utils.timerText
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.ONE_SECOND
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SESSION_COUNT
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_STUDY_TIME_BY_MINUTES
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_WHEN_POMODORO_DONE_PRIZE
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.toSecond
import ir.m3.rahmani.home_datastore.api.ChallengeRepository
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.home_datastore.model.Pomodoro
import ir.m3.rahmani.home_datastore.model.toPlay
import ir.m3.rahmani.studywithme.home.pomo.data.NotifyTime
import ir.m3.rahmani.studywithme.home.pomo.data.NotifyUserInfo
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.toExternal
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import java.util.Date
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.min

@Singleton
class PomodoroViewModel @Inject constructor(
    private val pomodoroLocalRepository: PomodoroLocalRepository,
    private val userSharedPref: UserSharedPreferenceRepository,
    private val userApiServiceRepository: UserApiServiceRepository,
    private val playLocalRepository: PlayLocalRepository,
    private val challengeRepository: ChallengeRepository
) : ViewModel(), TimerSetup {


    private var startPomodoroTime: Long? = null
    private var endPomodoroTime: Long? = null
    private val _notifyTimerData: MutableStateFlow<NotifyTime> by lazy {
        MutableStateFlow(NotifyTime())
    }
    val notifyTimerData get() = _notifyTimerData.asLiveData()
    private val _state: MutableStateFlow<TimerState> by lazy {
        MutableStateFlow(TimerState.NOT_STARTED)
    }
    val state = _state.asLiveData()
    private var savePauseTime: Int = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()

    private val _notifyUserInfo: MutableStateFlow<NotifyUserInfo> by lazy {
        MutableStateFlow(NotifyUserInfo())
    }
    val notifyUserInfo = _notifyUserInfo.asLiveData()
    private val _userLastState: MutableStateFlow<Int> by lazy {
        MutableStateFlow(0)
    }
    val userState = _userLastState.asLiveData()
    private val _play: MutableStateFlow<PlayLocal?> by lazy {
        MutableStateFlow(null)
    }
    private val _isLose: MutableStateFlow<Boolean> by lazy {
        MutableStateFlow(false)
    }
    val isLose = _isLose.asLiveData()

    init {
        getTodayPomodoros()
        viewModelScope.launch {
            _userLastState.value = UserStateHandler.userLastState(userSharedPref)
            val time = UserStateHandler.getTimeByState(_userLastState.value)
            _notifyTimerData.value = _notifyTimerData.value.copy(
                second = time,
                time = timerText(time.toSecond())
            )
        }
    }

    fun getChallengeStatus() {
        viewModelScope.launch {
            playLocalRepository.getPlay().collect {
                _play.value = it
                _notifyUserInfo.value = _notifyUserInfo.value.copy(
                    readChallengePomo = _play.value?.readPomo,
                    challengeTarget = _play.value?.target,
                )
            }
        }
    }

    private fun startPomodoroTimer() {
        _state.value = TimerState.IN_PROGRESS
        var time = UserStateHandler.getTimeByState(_userLastState.value).toSecond()
        if (_state.value == TimerState.IN_PROGRESS) {
            val timeToCountDown = if (savePauseTime > 0) min(time, savePauseTime) else time
            counter(timeToCountDown)
        } else if (time == 0) {
            _state.value = TimerState.DONE
        }
    }

    private fun counter(timeToCountDown: Int) {
        viewModelScope.launch {
            for (secondsLeft in timeToCountDown.downTo(0)) {
                if (_state.value == TimerState.PAUSE) break
                if (_state.value != TimerState.IN_PROGRESS) {
                    val time = UserStateHandler.getTimeByState(_userLastState.value)
                    _notifyTimerData.value = _notifyTimerData.value.copy(
                        second = time, time = timerText(time)
                    )
                    break
                }
                _notifyTimerData.value = _notifyTimerData.value.copy(
                    second = secondsLeft, time = timerText(secondsLeft)
                )
                savePauseTime = _notifyTimerData.value.second
                delay(ONE_SECOND)
                if (secondsLeft == 0) {
                    loseCheck()
                    onTimerDone()

                }
            }
        }
    }

    private fun loseCheck() {
        viewModelScope.launch {
            challengeRepository.getChallengeById(_play.value?.bet.toString()).collect {
                _notifyUserInfo.value = _notifyUserInfo.value.copy(
                    isFinishedChallenge = it?.status == "1" // status done = "1"
                )
                if (it?.status == "1") {
                    _isLose.value = true
                    _notifyUserInfo.value = _notifyUserInfo.value.copy(challengeTarget = 0)
                    playLocalRepository.getPlay().firstOrNull()?.let {
                        it.isFinished = true
                        it.isWin = false
                        playLocalRepository.updatePlay(it)
                    }
                } else _isLose.value = false
                val user = userSharedPref.getUserSharedData.first()
                val mode = _notifyUserInfo.value.isFinishedChallenge ?: false
                if (user.challengeMode != mode) {
                    user.challengeMode = mode
                    userSharedPref.setUserData(user)
                }
            }
        }
    }

    private suspend fun onTimerDone() {
        savePauseTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        val time = UserStateHandler.getTimeByState(_userLastState.value)
        _notifyTimerData.value =
            _notifyTimerData.value.copy(second = time)
        _state.value = TimerState.DONE
        val user = userSharedPref.getUserSharedData.firstOrNull()
        if (_userLastState.value == 0 && user?.challengeMode == true) { // win challenge
            updateChallengePlay()
            saveUserPrize()
            challengeDoneCheck()
        } else if (_userLastState.value == 0) { // pomodoro done get prize
            saveUserPrize()
        } else {
            saveNewStateUser()
        }
    }

    private suspend fun updateChallengePlay() {
        if (_play.value != null) {
            val read = _play.value!!.readPomo + 1
            _play.value = _play.value?.copy(
                readPomo = read
            )
            if (_play.value != null) {
                playLocalRepository.updatePlay(play = _play.value!!)
                _notifyUserInfo.value = _notifyUserInfo.value.copy(
                    readChallengePomo = read
                )
                challengeRepository.updatePlay(play = _play.value!!, read).firstOrNull()
            }
        }
    }

    private suspend fun challengeDoneCheck() {
        if (challengeDoneCondition()) {
            try {
                // todo notify if we lose
                getRewardChallengeDone()
                finishChallengeLocal()
                finishChallengeApi()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    private fun challengeDoneCondition(): Boolean =
        _notifyUserInfo.value.challengeTarget != null &&
                _notifyUserInfo.value.challengeTarget?.toInt()!! <= _notifyUserInfo.value.readChallengePomo?.toInt()!!

    private suspend fun getRewardChallengeDone() {
        val sharedUser = userSharedPref.getUserSharedData.first()
        val coin = _play.value?.coin ?: 0
        sharedUser.challengeMode = false
        if (_play.value?.bet != null) {
            val count = challengeRepository.getPlays(_play.value?.bet!!).first().size
            if (count > 0) sharedUser.coin += (coin * count)
        }
        userSharedPref.setUserData(sharedUser)
        userApiServiceRepository.updateUser(sharedUser.toExternal())
    }

    private suspend fun finishChallengeLocal() {
        _play.value = _play.value?.copy(
            isFinished = true,
            isWin = true
        )
        if (_play.value != null) {
            userSharedPref.getUserSharedData.first()
            playLocalRepository.updatePlay(_play.value!!)
        }
    }

    private suspend fun finishChallengeApi() {
        val challengeId = _play.value?.bet.toString()
        val ch = Challenge(
            coin = _play.value?.coin.toString(),
            target = _notifyUserInfo.value.challengeTarget.toString(),
            status = "1",
        )
        challengeRepository.updateChallenge(challengeId, ch).firstOrNull()
    }

    private suspend fun saveNewStateUser() {
        val user = userSharedPref.getUserSharedData.first()
        savePomodoro(_userLastState.value)
        val newState = UserStateHandler.newStateUser(
            _userLastState.value,
            _notifyUserInfo.value.leftToLongBreak ?: 0
        )
        _userLastState.value = newState
        saveNewUserSatateToSharedPref(newState, user)
        _notifyTimerData.value = _notifyTimerData.value.copy(
            time = timerText(UserStateHandler.getTimeByState(newState))
        )
    }

    private fun saveNewUserSatateToSharedPref(newState: Int, user: UserSharedPref) {
        viewModelScope.launch {
            user.userLastState = newState
            userSharedPref.setUserData(user)
        }
    }

    private suspend fun saveUserPrize() {
        val user = userSharedPref.getUserSharedData.first().apply {
            this.coin += POMODORO_WHEN_POMODORO_DONE_PRIZE
        }
        userSharedPref.setUserData(user)
        userApiServiceRepository.updateUser(user.toExternal()).firstOrNull()
        saveNewStateUser()
    }

    override fun pauseTimer(timerState: TimerState) {
        _state.value = TimerState.PAUSE
    }

    override fun resumeTimer(timerState: TimerState) {
        _state.value = TimerState.IN_PROGRESS
    }

    override fun nextPomodoro(timerState: TimerState) {
        savePauseTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _state.value = TimerState.NOT_STARTED
    }

    override fun stopTimer(timerState: TimerState) {
        savePauseTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _state.value = TimerState.NOT_STARTED
    }

    override fun startTimer(timerState: TimerState) {
        startPomodoroTime = Date().time
        _state.value = timerState
        startPomodoroTimer()
    }

    private fun savePomodoro(state: Int) {
        endPomodoroTime = Date().time
        val pomodoro = Pomodoro(
            id = UUID.randomUUID().toString(),
            startTime = startPomodoroTime!!,
            endTime = endPomodoroTime!!,
            state = state
        )
        viewModelScope.launch {
            pomodoroLocalRepository.savePomodoro(pomodoro)
        }
    }


    private fun getTodayPomodoros() {
        viewModelScope.launch {
            pomodoroLocalRepository.getTodaysPomodorosCount().collect {
                val leftToLongBreak = howManyLeftToLongBreak(it)
                _notifyUserInfo.value = _notifyUserInfo.value.copy(
                    pomodoroCount = it,
                    leftToLongBreak = leftToLongBreak,
                )
            }
            userSharedPref.getUserSharedData.collect {
                _notifyUserInfo.value = _notifyUserInfo.value.copy(
                    isFinishedChallenge = !it.challengeMode
                )
            }
        }
    }

    private fun howManyLeftToLongBreak(pomodoroCount: Int): Int {
        val calculate = pomodoroCount % POMODORO_SESSION_COUNT
        return when (calculate) {
            0 -> POMODORO_SESSION_COUNT
            else -> POMODORO_SESSION_COUNT - calculate
        }
    }
}
