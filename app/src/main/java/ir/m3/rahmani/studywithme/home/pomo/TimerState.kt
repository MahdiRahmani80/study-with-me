package ir.m3.rahmani.studywithme.home.pomo

import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_LONG_BREAK_TIME_BY_MINUTES
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SESSION_COUNT
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_SHORT_BREAK_TIME_BY_MINUTES


enum class TimerState {
    NOT_STARTED, IN_PROGRESS, PAUSE, DONE
}

fun pomodoroSetTime(state: Int = 0): Int {
    return when (state) {
        0 -> POMODORO_SESSION_COUNT
        1 -> POMODORO_SHORT_BREAK_TIME_BY_MINUTES
        2 -> POMODORO_LONG_BREAK_TIME_BY_MINUTES
        else -> POMODORO_SESSION_COUNT
    }
}