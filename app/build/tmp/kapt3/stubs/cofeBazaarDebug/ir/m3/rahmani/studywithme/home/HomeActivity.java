package ir.m3.rahmani.studywithme.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0012\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006/"}, d2 = {"Lir/m3/rahmani/studywithme/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lir/m3/rahmani/studywithme/databinding/ActivityHomeBinding;", "challengeFragment", "Lir/m3/rahmani/studywithme/home/challenge/ChallengeFragment;", "getChallengeFragment", "()Lir/m3/rahmani/studywithme/home/challenge/ChallengeFragment;", "setChallengeFragment", "(Lir/m3/rahmani/studywithme/home/challenge/ChallengeFragment;)V", "homeViewModel", "Lir/m3/rahmani/studywithme/home/HomeViewModel;", "getHomeViewModel", "()Lir/m3/rahmani/studywithme/home/HomeViewModel;", "setHomeViewModel", "(Lir/m3/rahmani/studywithme/home/HomeViewModel;)V", "navListener", "Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;", "pomodoroFragment", "Lir/m3/rahmani/studywithme/home/pomo/PomodoroFragment;", "getPomodoroFragment", "()Lir/m3/rahmani/studywithme/home/pomo/PomodoroFragment;", "setPomodoroFragment", "(Lir/m3/rahmani/studywithme/home/pomo/PomodoroFragment;)V", "profileFragment", "Lir/m3/rahmani/studywithme/home/profile/ProfileFragment;", "getProfileFragment", "()Lir/m3/rahmani/studywithme/home/profile/ProfileFragment;", "setProfileFragment", "(Lir/m3/rahmani/studywithme/home/profile/ProfileFragment;)V", "statsFragment", "Lir/m3/rahmani/studywithme/home/stats/StatsFragment;", "getStatsFragment", "()Lir/m3/rahmani/studywithme/home/stats/StatsFragment;", "setStatsFragment", "(Lir/m3/rahmani/studywithme/home/stats/StatsFragment;)V", "getChallengeStatus", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setHomeFragments", "setUserData", "showSanckbar", "text", "", "app_cofeBazaarDebug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.HomeViewModel homeViewModel;
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment pomodoroFragment;
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment challengeFragment;
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.stats.StatsFragment statsFragment;
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.profile.ProfileFragment profileFragment;
    private ir.m3.rahmani.studywithme.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener navListener = null;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final void setHomeViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment getPomodoroFragment() {
        return null;
    }
    
    public final void setPomodoroFragment(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment getChallengeFragment() {
        return null;
    }
    
    public final void setChallengeFragment(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.stats.StatsFragment getStatsFragment() {
        return null;
    }
    
    public final void setStatsFragment(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.stats.StatsFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.profile.ProfileFragment getProfileFragment() {
        return null;
    }
    
    public final void setProfileFragment(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.profile.ProfileFragment p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getChallengeStatus() {
    }
    
    private final void setUserData() {
    }
    
    private final void setHomeFragments() {
    }
    
    private final void showSanckbar(java.lang.String text) {
    }
}