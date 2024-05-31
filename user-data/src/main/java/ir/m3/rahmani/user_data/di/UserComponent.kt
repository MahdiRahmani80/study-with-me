package ir.m3.rahmani.user_data.di

import dagger.Subcomponent
import retrofit2.Retrofit

@Subcomponent(modules = [ApiServiceModule::class])
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }
}
