package ir.m3.rahmani.studywithme.di

import android.app.Activity
import android.app.Application
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.main.MainActivity

object Injector {
    // todo: Error handling for not existed activity in di

    fun inject(activity: Activity) {
        when (activity) {
            is MainActivity -> {
                (activity.application as StudyWithMeApplication)
                    .appComponent
                    .inject(activity as MainActivity)
            }

            // todo -> add rest
        }
    }
}