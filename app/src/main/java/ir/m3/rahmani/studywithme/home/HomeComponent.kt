package ir.m3.rahmani.studywithme.home

import dagger.Subcomponent
import ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule
import ir.m3.rahmani.home_datastore.local.RoomModule
import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao
import ir.m3.rahmani.home_datastore.local.repository.PomodoroDatastore
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment
import ir.m3.rahmani.studywithme.home.stats.StatsFragment
import javax.inject.Singleton

@Subcomponent(modules = [RoomModule::class,ChallengeApiServiceModule::class])
interface HomeComponent {

    fun inject(pomodoroFragment: PomodoroFragment)
    fun inject(challengeFragment: ChallengeFragment)
    fun inject(statsFragment: StatsFragment)
    fun inject(profileFragment: ProfileFragment)


    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeComponent
    }

}