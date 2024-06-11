package ir.m3.rahmani.studywithme.home.challenge;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010\u001b\u001a\u00020\u001dH\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006#"}, d2 = {"Lir/m3/rahmani/studywithme/home/challenge/ChallengeViewModel;", "Landroidx/lifecycle/ViewModel;", "challengeRepository", "Lir/m3/rahmani/home_datastore/api/ChallengeRepository;", "sharedPreferenceRepository", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "playLocalRepository", "Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;", "userApiServiceRepository", "Lir/m3/rahmani/user_data/api/UserApiServiceRepository;", "(Lir/m3/rahmani/home_datastore/api/ChallengeRepository;Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;Lir/m3/rahmani/user_data/api/UserApiServiceRepository;)V", "_notifyChallenges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lir/m3/rahmani/studywithme/home/challenge/data/NotifyChallenge;", "get_notifyChallenges", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_notifyChallenges$delegate", "Lkotlin/Lazy;", "_userName", "Lir/m3/rahmani/core/shared/model/UserSharedPref;", "get_userName", "_userName$delegate", "challenges", "Landroidx/lifecycle/LiveData;", "getChallenges", "()Landroidx/lifecycle/LiveData;", "userName", "getUserName", "addChallenge", "", "challenge", "Lir/m3/rahmani/home_datastore/model/Challenge;", "getChallengeMode", "removeChallenge", "startChallenge", "app_myketRelease"})
public final class ChallengeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository sharedPreferenceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _notifyChallenges$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.challenge.data.NotifyChallenge> challenges = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _userName$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.core.shared.model.UserSharedPref> userName = null;
    
    @javax.inject.Inject()
    public ChallengeViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository sharedPreferenceRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository) {
        super();
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.studywithme.home.challenge.data.NotifyChallenge> get_notifyChallenges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.challenge.data.NotifyChallenge> getChallenges() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.core.shared.model.UserSharedPref> get_userName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.core.shared.model.UserSharedPref> getUserName() {
        return null;
    }
    
    public final void addChallenge(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.model.Challenge challenge) {
    }
    
    public final void startChallenge(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.model.Challenge challenge) {
    }
    
    private final void getChallengeMode() {
    }
    
    private final void getUserName() {
    }
    
    public final void removeChallenge(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.model.Challenge challenge) {
    }
}