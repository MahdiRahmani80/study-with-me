package ir.m3.rahmani.studywithme.di;

@javax.inject.Singleton()
@dagger.Component(dependencies = {ir.m3.rahmani.core.di.CoreComponent.class}, modules = {ir.m3.rahmani.user_data.di.UserModule.class, ir.m3.rahmani.user_data.di.ApiServiceModule.class, ir.m3.rahmani.studywithme.di.HomeModule.class, ir.m3.rahmani.home_datastore.local.RoomModule.class, ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lir/m3/rahmani/studywithme/di/AppComponent;", "", "inject", "", "app", "Lir/m3/rahmani/studywithme/StudyWithMeApplication;", "homeActivity", "Lir/m3/rahmani/studywithme/home/HomeActivity;", "challengeFragment", "Lir/m3/rahmani/studywithme/home/challenge/ChallengeFragment;", "profileFragment", "Lir/m3/rahmani/studywithme/home/profile/ProfileFragment;", "onboardingActivity", "Lir/m3/rahmani/studywithme/login/onboarding/OnboardingActivity;", "registerActivity", "Lir/m3/rahmani/studywithme/login/register/RegisterActivity;", "mainActivity", "Lir/m3/rahmani/studywithme/main/MainActivity;", "provideHome", "Lir/m3/rahmani/studywithme/home/HomeComponent$Factory;", "provideRetrofit", "Lretrofit2/Retrofit;", "app_cofeBazaarDebug"})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.main.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.StudyWithMeApplication app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity onboardingActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.login.register.RegisterActivity registerActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.HomeActivity homeActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment challengeFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.profile.ProfileFragment profileFragment);
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit provideRetrofit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ir.m3.rahmani.studywithme.home.HomeComponent.Factory provideHome();
}