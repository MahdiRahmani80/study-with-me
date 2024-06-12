package ir.m3.rahmani.studywithme

import android.app.Application
import com.bugsnag.android.Bugsnag
import ir.m3.rahmani.core.di.CoreComponent
import ir.m3.rahmani.core.di.setApplicationModule
import ir.m3.rahmani.core.di.DaggerCoreComponent
import ir.m3.rahmani.studywithme.di.AppComponent
import ir.m3.rahmani.studywithme.di.DaggerAppComponent


class StudyWithMeApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        Bugsnag.start(this)
        appComponent = getAppComponent(this)
        appComponent.inject(this)
    }

    private fun getAppComponent(app:Application): AppComponent{

        val coreComponent: CoreComponent by lazy {
            DaggerCoreComponent.builder()
                .setApplicationModule(setApplicationModule(app))
                .build()
        }

        val appComponent: AppComponent by lazy {
            DaggerAppComponent
                .builder()
                .coreComponent(coreComponent)
                .build()
        }

        return appComponent
    }
}