package ir.m3.rahmani.home_datastore.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ChallengeApiServiceModule {

    @Provides
    fun provideChallengeApiService(retrofit: Retrofit): ChallengeApiService {
        return retrofit.create(ChallengeApiService::class.java)
    }

}