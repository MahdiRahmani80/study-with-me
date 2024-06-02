package ir.m3.rahmani.studywithme.di


import dagger.Component
import ir.m3.rahmani.core.di.CoreComponent
import ir.m3.rahmani.home_datastore.di.HomeDatastoreComponent
import ir.m3.rahmani.home_datastore.local.RoomModule
import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository
import ir.m3.rahmani.user_data.di.UserModule
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.home.HomeActivity
import ir.m3.rahmani.studywithme.home.HomeComponent
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity
import ir.m3.rahmani.studywithme.login.register.RegisterActivity
import ir.m3.rahmani.studywithme.main.MainActivity
import ir.m3.rahmani.user_data.di.ApiServiceModule
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [CoreComponent::class],
    modules = [UserModule::class, ApiServiceModule::class, HomeModule::class, RoomModule::class]
)
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(app: StudyWithMeApplication)
    fun inject(onboardingActivity: OnboardingActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(homeActivity: HomeActivity)

    fun provideRetrofit(): Retrofit

    fun provideHome(): HomeComponent.Factory

}