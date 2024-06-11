package ir.m3.rahmani.studywithme.home.pomo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lir/m3/rahmani/studywithme/home/pomo/TimerSetup;", "", "nextPomodoro", "", "timerState", "Lir/m3/rahmani/studywithme/home/pomo/TimerState;", "pauseTimer", "resumeTimer", "startTimer", "stopTimer", "app_myketRelease"})
public abstract interface TimerSetup {
    
    public abstract void pauseTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState);
    
    public abstract void resumeTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState);
    
    public abstract void nextPomodoro(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState);
    
    public abstract void stopTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState);
    
    public abstract void startTimer(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.TimerState timerState);
}