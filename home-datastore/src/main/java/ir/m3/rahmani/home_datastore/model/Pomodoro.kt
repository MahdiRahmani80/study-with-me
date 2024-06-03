package ir.m3.rahmani.home_datastore.model

import ir.m3.rahmani.home_datastore.local.model.PomodoroLocal

data class Pomodoro(
    val id: String ,
    val startTime: Long,
    val endTime: Long,
    val state: Int = 0
)

fun Pomodoro.toLocal() = PomodoroLocal(
    id = id,
    startTime = startTime,
    endTime = endTime,
    state = state
)

fun PomodoroLocal.toExternal() = Pomodoro(
    id = id,
    startTime = startTime,
    endTime = endTime,
    state = state
)