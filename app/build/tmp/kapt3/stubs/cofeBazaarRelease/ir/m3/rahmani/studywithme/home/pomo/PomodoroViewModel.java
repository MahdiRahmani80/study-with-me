package ir.m3.rahmani.studywithme.home.pomo;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u00109\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u0010H\u0002J\u0010\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020&H\u0002J\u000e\u0010?\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\u000e\u0010@\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\u0006\u0010A\u001a\u00020:J\u000e\u0010B\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\b\u0010C\u001a\u00020:H\u0002J\u0010\u0010D\u001a\u00020&2\u0006\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020:H\u0002J\u0010\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020\"H\u0016J\u000e\u0010I\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\u0010\u0010J\u001a\u00020:2\u0006\u0010H\u001a\u00020\"H\u0016J\u0010\u0010K\u001a\u00020:2\u0006\u0010H\u001a\u00020\"H\u0016J\u000e\u0010L\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\u0018\u0010M\u001a\u00020:2\u0006\u0010N\u001a\u00020&2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020:2\u0006\u00105\u001a\u00020&H\u0002J\u000e\u0010R\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;J\b\u0010S\u001a\u00020:H\u0002J\u0010\u0010T\u001a\u00020:2\u0006\u0010H\u001a\u00020\"H\u0016J\u0010\u0010U\u001a\u00020:2\u0006\u0010H\u001a\u00020\"H\u0016J\u000e\u0010V\u001a\u00020:H\u0082@\u00a2\u0006\u0002\u0010;R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012R#\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001f\u0010\u0012R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u0012R!\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0014\u001a\u0004\b\'\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100-\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160-8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0-\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010+R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\"0-\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020&0-\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.\u00a8\u0006W"}, d2 = {"Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "Landroidx/lifecycle/ViewModel;", "Lir/m3/rahmani/studywithme/home/pomo/TimerSetup;", "pomodoroLocalRepository", "Lir/m3/rahmani/home_datastore/local/repository/PomodoroLocalRepository;", "userSharedPref", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "userApiServiceRepository", "Lir/m3/rahmani/user_data/api/UserApiServiceRepository;", "playLocalRepository", "Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;", "challengeRepository", "Lir/m3/rahmani/home_datastore/api/ChallengeRepository;", "(Lir/m3/rahmani/home_datastore/local/repository/PomodoroLocalRepository;Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lir/m3/rahmani/user_data/api/UserApiServiceRepository;Lir/m3/rahmani/home_datastore/local/repository/PlayLocalRepository;Lir/m3/rahmani/home_datastore/api/ChallengeRepository;)V", "_isLose", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isLose", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLose$delegate", "Lkotlin/Lazy;", "_notifyTimerData", "Lir/m3/rahmani/studywithme/home/pomo/data/NotifyTime;", "get_notifyTimerData", "_notifyTimerData$delegate", "_notifyUserInfo", "Lir/m3/rahmani/studywithme/home/pomo/data/NotifyUserInfo;", "get_notifyUserInfo", "_notifyUserInfo$delegate", "_play", "Lir/m3/rahmani/home_datastore/local/model/PlayLocal;", "get_play", "_play$delegate", "_state", "Lir/m3/rahmani/studywithme/home/pomo/TimerState;", "get_state", "_state$delegate", "_userLastState", "", "get_userLastState", "_userLastState$delegate", "endPomodoroTime", "", "Ljava/lang/Long;", "isLose", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "notifyTimerData", "getNotifyTimerData", "notifyUserInfo", "getNotifyUserInfo", "savePauseTime", "startPomodoroTime", "state", "getState", "userState", "getUserState", "challengeDoneCheck", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "challengeDoneCondition", "counter", "timeToCountDown", "finishChallengeApi", "finishChallengeLocal", "getChallengeStatus", "getRewardChallengeDone", "getTodayPomodoros", "howManyLeftToLongBreak", "pomodoroCount", "loseCheck", "nextPomodoro", "timerState", "onTimerDone", "pauseTimer", "resumeTimer", "saveNewStateUser", "saveNewUserSatateToSharedPref", "newState", "user", "Lir/m3/rahmani/core/shared/model/UserSharedPref;", "savePomodoro", "saveUserPrize", "startPomodoroTimer", "startTimer", "stopTimer", "updateChallengePlay", "app_cofeBazaarRelease"})
public final class PomodoroViewModel extends androidx.lifecycle.ViewModel implements ir.m3.rahmani.studywithme.home.pomo.TimerSetup {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository pomodoroLocalRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository userSharedPref = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long startPomodoroTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long endPomodoroTime;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _notifyTimerData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _state$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.pomo.TimerState> state = null;
    private int savePauseTime;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _notifyUserInfo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.pomo.data.NotifyUserInfo> notifyUserInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _userLastState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> userState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _play$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _isLose$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLose = null;
    
    @javax.inject.Inject()
    public PomodoroViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository pomodoroLocalRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository userSharedPref, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.user_data.api.UserApiServiceRepository userApiServiceRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository playLocalRepository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.home_datastore.api.ChallengeRepository challengeRepository) {
        super();
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.studywithme.home.pomo.data.NotifyTime> get_notifyTimerData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.pomo.data.NotifyTime> getNotifyTimerData() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.studywithme.home.pomo.TimerState> get_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.pomo.TimerState> getState() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.studywithme.home.pomo.data.NotifyUserInfo> get_notifyUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.m3.rahmani.studywithme.home.pomo.data.NotifyUserInfo> getNotifyUserInfo() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> get_userLastState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getUserState() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<ir.m3.rahmani.home_datastore.local.model.PlayLocal> get_play() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> get_isLose() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLose() {
        return null;
    }
    
    public final void getChallengeStatus() {
    }
    
    private final void startPomodoroTimer() {
    }
    
    private final void counter(int timeToCountDown) {
    }
    
    private final void loseCheck() {
    }
    
    private final java.lang.Object onTimerDone(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object updateChallengePlay(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object challengeDoneCheck(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final boolean challengeDoneCondition() {
        return false;
    }
    
    private final java.lang.Object getRewardChallengeDone(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object finishChallengeLocal(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object finishChallengeApi(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object saveNewStateUser(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void saveNewUserSatateToSharedPref(int newState, ir.m3.rahmani.core.shared.model.UserSharedPref user) {
    }
    
    private final java.lang.Object saveUserPrize(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void pauseTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState) {
    }
    
    @java.lang.Override()
    public void resumeTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState) {
    }
    
    @java.lang.Override()
    public void nextPomodoro(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState) {
    }
    
    @java.lang.Override()
    public void stopTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState) {
    }
    
    @java.lang.Override()
    public void startTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState) {
    }
    
    private final void savePomodoro(int state) {
    }
    
    private final void getTodayPomodoros() {
    }
    
    private final int howManyLeftToLongBreak(int pomodoroCount) {
        return 0;
    }
}