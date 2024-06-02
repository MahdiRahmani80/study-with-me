package ir.m3.rahmani.home_datastore.model

import ir.m3.rahmani.home_datastore.local.model.PomodoroLocal
import ir.m3.rahmani.home_datastore.local.model.PomodoroState

data class Pomodoro(
    val id: String ,
    val startTime: Long,
    val endTime: Long,
    val state: PomodoroState
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