package ir.m3.rahmani.studywithme.home.pomo

interface TimerSetup {

    fun pauseTimer(timerState: TimerState)
    fun resumeTimer(timerState: TimerState)
    fun nextPomodoro(timerState: TimerState)
    fun stopTimer(timerState: TimerState)
    fun startTimer(timerState: TimerState)
}