package ir.m3.rahmani.home_datastore.di

import dagger.Subcomponent
import ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule
import ir.m3.rahmani.home_datastore.local.RoomModule
import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository

@Subcomponent(modules = [RoomModule::class, ChallengeApiServiceModule::class])
interface HomeDatastoreComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeDatastoreComponent
    }

}