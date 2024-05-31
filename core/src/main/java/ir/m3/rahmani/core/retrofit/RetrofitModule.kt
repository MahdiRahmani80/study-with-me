package ir.m3.rahmani.core.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import ir.m3.rahmani.core.retrofit.RetrofitInstance
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideRetrofit(gson: Gson): Retrofit {
        return RetrofitInstance.mkRetrofit(gson)
    }
}