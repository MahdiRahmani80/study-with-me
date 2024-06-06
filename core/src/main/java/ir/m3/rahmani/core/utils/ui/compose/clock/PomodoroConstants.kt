package ir.m3.rahmani.core.utils.ui.compose.clock

object PomodoroConstants {
    const val ONE_SECOND = 10L //1000L
    const val POMODORO_SESSION_COUNT = 4
    const val POMODORO_STUDY_TIME_BY_MINUTES = 25
    const val POMODORO_SHORT_BREAK_TIME_BY_MINUTES = 5
    const val POMODORO_LONG_BREAK_TIME_BY_MINUTES = 15
    const val POMODORO_COUNT_OF_REPETITION = 4
    const val POMODORO_WHEN_POMODORO_DONE_PRIZE = 3
    const val MAX_SWEEP = 280f
    const val POMODORO_TIME_TEXT = "$POMODORO_STUDY_TIME_BY_MINUTES : 00"
    fun Int.toSecond() = this * 60

}