package ir.m3.rahmani.studywithme.di

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.home.HomeActivity
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment
import ir.m3.rahmani.studywithme.home.stats.StatsFragment
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity
import ir.m3.rahmani.studywithme.login.onboarding.pages.OnboardingFragment
import ir.m3.rahmani.studywithme.login.register.RegisterActivity
import ir.m3.rahmani.studywithme.main.MainActivity

object Injector {
    // todo: Error handling for not existed activity in di

    fun inject(activity: Activity) {
        when (activity) {
            is MainActivity -> getAppComponent(activity).inject(activity)
            is OnboardingActivity -> getAppComponent(activity).inject(activity)
            is RegisterActivity -> getAppComponent(activity).inject(activity)
            is HomeActivity -> getAppComponent(activity).inject(activity)
        }
    }

    fun inject(application: Application, fragment: Fragment) {
        when (fragment) {
            is PomodoroFragment -> {
                getAppComponent(application).provideHome().create().inject(fragment)
            }
            is ChallengeFragment -> {
                getAppComponent(application).provideHome().create().inject(fragment)
            }
            is StatsFragment -> {
                getAppComponent(application).provideHome().create().inject(fragment)
            }
            is ProfileFragment -> {
                getAppComponent(application).provideHome().create().inject(fragment)
            }
        }
    }

    private fun getAppComponent(activity: Activity): AppComponent {
        val application = activity.application
        return (application as StudyWithMeApplication).appComponent
    }

    private fun getAppComponent(application: Application): AppComponent {
        return (application as StudyWithMeApplication).appComponent
    }
}