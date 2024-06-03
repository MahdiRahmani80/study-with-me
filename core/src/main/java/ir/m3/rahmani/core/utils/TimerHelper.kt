package ir.m3.rahmani.core.utils

import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants.POMODORO_TIME_TEXT


fun timerText(sec: Int): String {
    val m = sec / 60
    val s = sec % 60
    return "${m.twoDigit()} : ${s.twoDigit()}"
}

private fun Int.twoDigit(): String {
    val isSingleDigit = this.toString().length == 1
    if (isSingleDigit) return "0$this"

    return when (this) {
        0 -> "00"
        else -> this.toString()
    }
}
