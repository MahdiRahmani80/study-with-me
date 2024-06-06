package ir.m3.rahmani.home_datastore.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("pomodoro")
data class PomodoroLocal(
    @PrimaryKey val id: String,
    val startTime: Long,
    val endTime: Long,
    val state: Int
)

