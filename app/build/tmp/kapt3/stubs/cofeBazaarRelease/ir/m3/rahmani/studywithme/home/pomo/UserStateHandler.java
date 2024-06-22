package ir.m3.rahmani.studywithme.home.pomo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lir/m3/rahmani/studywithme/home/pomo/UserStateHandler;", "", "()V", "getTimeByState", "", "state", "newStateUser", "leftToLongBreak", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLastState", "sharedPref", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "(Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_cofeBazaarRelease"})
public final class UserStateHandler {
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.home.pomo.UserStateHandler INSTANCE = null;
    
    private UserStateHandler() {
        super();
    }
    
    /**
     * 0 -> WORK
     * 1 -> SHORT BREAK
     * 2-> LONG BREAK
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userLastState(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository sharedPref, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object newStateUser(int state, int leftToLongBreak, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    public final int getTimeByState(int state) {
        return 0;
    }
}