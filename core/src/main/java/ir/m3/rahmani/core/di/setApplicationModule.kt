package ir.m3.rahmani.core.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class setApplicationModule(private val application: Application) {

    @Provides
    fun provideApplication(): Application = application

}