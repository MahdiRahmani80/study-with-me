package ir.m3.rahmani.core.di

import android.app.Application
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import javax.inject.Singleton


@Component(modules = [setApplicationModule::class])
interface CoreComponent {

    fun provideApplication(): Application
}
