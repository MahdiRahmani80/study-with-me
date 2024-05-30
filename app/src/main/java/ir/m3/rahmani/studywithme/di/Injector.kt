package ir.m3.rahmani.studywithme.di

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity
import ir.m3.rahmani.studywithme.login.onboarding.pages.OnboardingFragment
import ir.m3.rahmani.studywithme.main.MainActivity

object Injector {
    // todo: Error handling for not existed activity in di

    fun inject(activity: Activity) {
        when (activity) {
            is MainActivity -> getAppComponent(activity).inject(activity)
            is OnboardingActivity -> getAppComponent(activity).inject(activity)
        }
    }

    fun inject(application: Application, fragment: Fragment) {
        when (fragment) {
            is OnboardingFragment -> getAppComponent(application).inject(fragment)

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