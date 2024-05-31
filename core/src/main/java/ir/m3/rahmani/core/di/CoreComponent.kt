package ir.m3.rahmani.core.di

import android.app.Application
import dagger.Component
import ir.m3.rahmani.core.retrofit.RetrofitModule
import retrofit2.Retrofit

@Component(
    modules = [setApplicationModule::class, RetrofitModule::class]
)
interface CoreComponent {

    fun provideApplication(): Application
    fun provideRetrofit(): Retrofit
}
