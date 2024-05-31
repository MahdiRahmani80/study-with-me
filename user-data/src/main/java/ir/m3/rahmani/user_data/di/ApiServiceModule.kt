package ir.m3.rahmani.user_data.di

import dagger.Module
import dagger.Provides
import ir.m3.rahmani.user_data.api.UserApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
class ApiServiceModule {

    @Provides
    fun provideApiService(retrofit: Retrofit): UserApiService {
        return retrofit.create(UserApiService::class.java)
    }
}
