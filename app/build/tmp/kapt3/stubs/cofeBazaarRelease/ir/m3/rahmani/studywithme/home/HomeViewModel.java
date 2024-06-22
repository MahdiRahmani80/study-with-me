package ir.m3.rahmani.studywithme.home;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020#H\u0002J\u0006\u0010\'\u001a\u00020#J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u000e\u0010,\u001a\u00020#H\u0082@\u00a2\u0006\u0002\u0010-R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lir/m3/rahmani/studywithme/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userSharedPref", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "challengeRepository", "Lir/m3/rahmani/home_datastore/api/ChallengeRepository;", "playLocalRepository", "Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;", "userApiServiceRepository", "Lir/m3/rahmani/user_data/api/UserApiServiceRepository;", "(Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lir/m3/rahmani/home_datastore/api/ChallengeRepository;Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;Lir/m3/rahmani/user_data/api/UserApiServiceRepository;)V", "_homeData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lir/m3/rahmani/studywithme/home/ChallengeData;", "get_homeData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_homeData$delegate", "Lkotlin/Lazy;", "_lastestChallengeState", "Lir/m3/rahmani/home_datastore/model/Challenge;", "get_lastestChallengeState", "_lastestChallengeState$delegate", "homeData", "Landroidx/lifecycle/LiveData;", "getHomeData", "()Landroidx/lifecycle/LiveData;", "lastestChallengeState", "getLastestChallengeState", "pomodoroViewModel", "Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "getPomodoroViewModel", "()Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "setPomodoroViewModel", "(Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;)V", "addBuyCoin", "", "purchase", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "checkIsPlayProgress", "getPlayData", "getPriceFromPurchase", "", "purchaseId", "", "getUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_cofeBazaarRelease"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository userSharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository = null;
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
    ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository) {
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
    
    public final void addBuyCoin(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase) {
    }
    
    private final int getPriceFromPurchase(java.lang.String purchaseId) {
        return 0;
    }
}