package ir.m3.rahmani.studywithme.home;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020!H\u0082@\u00a2\u0006\u0002\u0010$R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lir/m3/rahmani/studywithme/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userSharedPref", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "challengeRepository", "Lir/m3/rahmani/home_datastore/api/ChallengeRepository;", "playLocalRepository", "Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;", "(Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lir/m3/rahmani/home_datastore/api/ChallengeRepository;Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;)V", "_homeData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lir/m3/rahmani/studywithme/home/ChallengeData;", "get_homeData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_homeData$delegate", "Lkotlin/Lazy;", "_lastestChallengeState", "Lir/m3/rahmani/home_datastore/model/Challenge;", "get_lastestChallengeState", "_lastestChallengeState$delegate", "homeData", "Landroidx/lifecycle/LiveData;", "getHomeData", "()Landroidx/lifecycle/LiveData;", "lastestChallengeState", "getLastestChallengeState", "pomodoroViewModel", "Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "getPomodoroViewModel", "()Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "setPomodoroViewModel", "(Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;)V", "checkIsPlayProgress", "", "getPlayData", "getUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_cofeBazaarDebug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository userSharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository = null;
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel pomodoroViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _homeData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.ChallengeData> homeData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _lastestChallengeState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.home_datastore.model.Challenge> lastestChallengeState = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository userSharedPref, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel getPomodoroViewModel() {
        return null;
    }
    
    public final void setPomodoroViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel p0) {
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.studywithme.home.ChallengeData> get_homeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.ChallengeData> getHomeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.home_datastore.model.Challenge> get_lastestChallengeState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.home_datastore.model.Challenge> getLastestChallengeState() {
        return null;
    }
    
    private final java.lang.Object getUserData(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void getPlayData() {
    }
    
    private final void checkIsPlayProgress() {
    }
}