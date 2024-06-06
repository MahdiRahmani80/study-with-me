package ir.m3.rahmani.home_datastore.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import ir.m3.rahmani.home_datastore.local.model.PomodoroLocal
import kotlinx.coroutines.flow.Flow

@Dao
interface PomodoroDao {

    @Insert
    suspend fun insertPomodoro(pomodoro: PomodoroLocal)

    @Query("SELECT * FROM pomodoro ")
    fun getPomodoros(): Flow<List<PomodoroLocal>>

}