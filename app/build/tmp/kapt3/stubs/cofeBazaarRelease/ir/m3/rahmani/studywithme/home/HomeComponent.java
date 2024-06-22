package ir.m3.rahmani.studywithme.home;

@dagger.Subcomponent(modules = {ir.m3.rahmani.home_datastore.local.RoomModule.class, ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lir/m3/rahmani/studywithme/home/HomeComponent;", "", "inject", "", "challengeFragment", "Lir/m3/rahmani/studywithme/home/challenge/ChallengeFragment;", "pomodoroFragment", "Lir/m3/rahmani/studywithme/home/pomo/PomodoroFragment;", "profileFragment", "Lir/m3/rahmani/studywithme/home/profile/ProfileFragment;", "statsFragment", "Lir/m3/rahmani/studywithme/home/stats/StatsFragment;", "Factory", "app_cofeBazaarRelease"})
public abstract interface HomeComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment pomodoroFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment challengeFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.stats.StatsFragment statsFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.profile.ProfileFragment profileFragment);
    
    @dagger.Subcomponent.Factory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lir/m3/rahmani/studywithme/home/HomeComponent$Factory;", "", "create", "Lir/m3/rahmani/studywithme/home/HomeComponent;", "app_cofeBazaarRelease"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ir.m3.rahmani.studywithme.home.HomeComponent create();
    }
}