package ir.m3.rahmani.studywithme.home.pomo

import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_LONG_BREAK_TIME_BY_MINUTES
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SESSION_COUNT
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SHORT_BREAK_TIME_BY_MINUTES
import ir.m3.rahmani.home_datastore.local.model.PomodoroState


enum class TimerState {
    NOT_STARTED, IN_PROGRESS, PAUSE, DONE
}

fun pomodoroSetTime(state: PomodoroState = PomodoroState.WORK): Int {
    return when(state){
        PomodoroState.WORK -> POMODORO_SESSION_COUNT
        PomodoroState.SHORT_BREAK -> POMODORO_SHORT_BREAK_TIME_BY_MINUTES
        PomodoroState.LONG_BREAK -> POMODORO_LONG_BREAK_TIME_BY_MINUTES
    }
}