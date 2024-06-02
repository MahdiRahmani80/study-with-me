package ir.m3.rahmani.home_datastore.local.repository

import ir.m3.rahmani.home_datastore.model.Pomodoro
import kotlinx.coroutines.flow.Flow

interface PomodoroDatastore {

    suspend fun savePomodoro(pomodoro: Pomodoro)
    suspend fun getTodaysPomodorosCount():Flow<Int>

}