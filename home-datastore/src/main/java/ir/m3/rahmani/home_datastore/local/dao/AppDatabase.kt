package ir.m3.rahmani.home_datastore.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import ir.m3.rahmani.home_datastore.local.model.PomodoroLocal

@Database(entities = [PomodoroLocal::class,PlayLocal::class], version = 1)
abstract class AppDatabase() : RoomDatabase() {
    abstract fun pomodoroDao(): PomodoroDao
    abstract fun playLocalDao(): PlayLocalDao


}