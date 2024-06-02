package ir.m3.rahmani.home_datastore.local.repository

import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao
import ir.m3.rahmani.home_datastore.local.model.PomodoroLocal
import ir.m3.rahmani.home_datastore.model.Pomodoro
import ir.m3.rahmani.home_datastore.model.toLocal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject

class PomodoroLocalRepository @Inject constructor(
    private val pomodoroDao: PomodoroDao,
) : PomodoroDatastore {

    override suspend fun savePomodoro(pomodoro: Pomodoro) {
        pomodoroDao.insertPomodoro(pomodoro.toLocal())
    }

    override suspend fun getTodaysPomodorosCount(): Flow<Int> = flow{
        val now = Date().time
        val nowDate = SimpleDateFormat("yyyy-MM-dd").format(now)
        val pomoList = pomodoroDao.getPomodoros()
        pomoList.collect {
            var count = 0
            it.map {
                val pomoDate = SimpleDateFormat("yyyy-MM-dd").format(it.endTime)
                if (pomoDate == nowDate) count += 1
            }
            emit(count)

        }

    }

}