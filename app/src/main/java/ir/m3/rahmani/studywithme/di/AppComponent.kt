package ir.m3.rahmani.studywithme.di


import dagger.Component
import ir.m3.rahmani.core.di.CoreComponent
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [CoreComponent::class],
)
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(app: StudyWithMeApplication)

}