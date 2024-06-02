package ir.m3.rahmani.home_datastore.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PomodoroLocal(
    @PrimaryKey val id: String,
    val startTime: Long,
    val endTime: Long,
    val state: PomodoroState
)

enum class PomodoroState {
    SHORT_BREAK, LONG_BREAK, WORK
}