package ir.m3.rahmani.studywithme.main;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u000e\u001a\u00020\u0012H\u0002R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lir/m3/rahmani/studywithme/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "sharedPref", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "challengeRepository", "Lir/m3/rahmani/home_datastore/api/ChallengeRepository;", "(Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lir/m3/rahmani/home_datastore/api/ChallengeRepository;)V", "_isLogin", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isLogin", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLogin$delegate", "Lkotlin/Lazy;", "isLogin", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "getPlay", "", "app_cofeBazaarRelease"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository sharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _isLogin$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLogin = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository sharedPref, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository) {
        super();
    }
    
    public final void getPlay() {
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> get_isLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLogin() {
        return null;
    }
    
    private final void isLogin() {
    }
}