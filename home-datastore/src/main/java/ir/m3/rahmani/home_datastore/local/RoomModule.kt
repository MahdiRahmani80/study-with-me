package ir.m3.rahmani.home_datastore.local

import android.app.Application
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import ir.m3.rahmani.home_datastore.local.dao.AppDatabase
import ir.m3.rahmani.home_datastore.local.dao.PlayLocalDao
import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao
import ir.m3.rahmani.home_datastore.local.repository.PomodoroDatastore
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository

@Module
class RoomModule {

    @Provides
    fun providePomodoroDatastore(dao: PomodoroDao): PomodoroDatastore{
        return PomodoroLocalRepository(dao)
    }

    @Provides
    fun providepomodoroDaoDao(db: AppDatabase): PomodoroDao {
        return db.pomodoroDao()
    }

    @Provides
    fun providePlayLocalDao(db: AppDatabase): PlayLocalDao {
        return db.playLocalDao()
    }

    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        val db: AppDatabase = Room.databaseBuilder(
            context = application,
            klass = AppDatabase::class.java,
            name = "app_database"
        ).fallbackToDestructiveMigration().build()

        return db
    }
}