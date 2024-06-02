package ir.m3.rahmani.studywithme.home.pomo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.core.utils.timerText
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SESSION_COUNT
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_STUDY_TIME_BY_MINUTES
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_WHEN_POMODORO_DONE_PRIZE
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.toSecond
import ir.m3.rahmani.home_datastore.local.model.PomodoroState
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository
import ir.m3.rahmani.home_datastore.model.Pomodoro
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.toExternal
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.util.Date
import java.util.UUID
import javax.inject.Inject
import kotlin.math.min

class PomodoroViewModel @Inject constructor(
    private val pomodoroLocalRepository: PomodoroLocalRepository,
    private val userSharedPref: UserSharedPreferenceRepository,
    private val userApiServiceRepository: UserApiServiceRepository
) : ViewModel(), TimerSetup {

    private var startPomodoroTime: Long? = null
    private var endPomodoroTime: Long? = null
    private val _timeBySec: MutableStateFlow<Int> by lazy {
        MutableStateFlow(POMODORO_STUDY_TIME_BY_MINUTES.toSecond())
    }
    val timeBySec get() = _timeBySec.asLiveData()
    private val _state: MutableStateFlow<TimerState> by lazy {
        MutableStateFlow(TimerState.NOT_STARTED)
    }
    val state = _state.asLiveData()
    private var saveStopTime: Int = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()

    private val _notifyUserInfo: MutableStateFlow<NotifyUserInfo> by lazy {
        MutableStateFlow(NotifyUserInfo())
    }
    val notifyUserInfo = _notifyUserInfo.asLiveData()

    init {
        getTodayPomodoros()
    }

    private fun startPomodoroTimer() {
        _state.value = TimerState.IN_PROGRESS
        var time = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        if (_state.value == TimerState.IN_PROGRESS) {
            val timeToCountDown = min(time, saveStopTime)
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
                    _timeBySec.value = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
                    break
                }
                _timeBySec.value = secondsLeft
                saveStopTime = _timeBySec.value
                delay(1000)
                if (secondsLeft == 0) {
                    onTimerDone()
                }
            }
        }
    }

    private fun onTimerDone() {
        saveStopTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _timeBySec.value = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _state.value = TimerState.DONE
        savePomodoro()
        saveUserPrize()
    }

    private fun saveUserPrize() {
        viewModelScope.launch {
            val user = userSharedPref.getUserSharedData.first()
            val newCoinCount = user.coin + POMODORO_WHEN_POMODORO_DONE_PRIZE
            user.coin = newCoinCount
            userSharedPref.setUserData(user)
            userApiServiceRepository.updateUser(user.toExternal()).firstOrNull()
        }
    }

    override fun pauseTimer(timerState: TimerState) {
        _state.value = TimerState.PAUSE
    }

    override fun resumeTimer(timerState: TimerState) {
        _state.value = TimerState.IN_PROGRESS
    }

    override fun nextPomodoro(timerState: TimerState) {
        saveStopTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _state.value = TimerState.NOT_STARTED
    }

    override fun stopTimer(timerState: TimerState) {
        saveStopTime = POMODORO_STUDY_TIME_BY_MINUTES.toSecond()
        _state.value = TimerState.NOT_STARTED
    }

    override fun startTimer(timerState: TimerState) {
        startPomodoroTime = Date().time
        _state.value = timerState
        startPomodoroTimer()
    }

    fun setTimerText(sec: Int): String {
        val isRunning = _state.value == TimerState.IN_PROGRESS
        return timerText(sec, isRunning)
    }

    private fun savePomodoro() {
        endPomodoroTime = Date().time
        val pomodoro = Pomodoro(
            id = UUID.randomUUID().toString(),
            startTime = startPomodoroTime!!,
            endTime = endPomodoroTime!!,
            state = PomodoroState.WORK
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
