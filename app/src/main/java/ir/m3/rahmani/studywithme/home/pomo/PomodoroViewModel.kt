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
import ir.m3.rahmani.home_datastore.model.Pomodoro
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

    init {
        getTodayPomodoros()
        viewModelScope.launch {
            getChallengeStatus()
            _userLastState.value = UserStateHandler.userLastState(userSharedPref)
            val time = UserStateHandler.getTimeByState(_userLastState.value)
            _notifyTimerData.value = _notifyTimerData.value.copy(
                second = time,
                time = timerText(time.toSecond())
            )
        }
    }

    suspend fun getChallengeStatus() {
        playLocalRepository.getPlay().collect {
            _play.value = it
            _notifyUserInfo.value = _notifyUserInfo.value.copy(
                readChallengePomo = _play.value?.readPomo,
                challengeTarget  = _play.value?.target
            )
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
                    onTimerDone()
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
        if (_userLastState.value == 0) {
            updateChallengePlay()
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
                challengeRepository.updatePlay(play = _play.value!!,read).firstOrNull()
            }
        }
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
        val user = userSharedPref.getUserSharedData.first()
        val newCoinCount = user.coin + POMODORO_WHEN_POMODORO_DONE_PRIZE
        user.coin = newCoinCount
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
                    leftToLongBreak = leftToLongBreak
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
