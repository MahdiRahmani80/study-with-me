package ir.m3.rahmani.studywithme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002\u00a8\u0006\u000f"}, d2 = {"Lir/m3/rahmani/studywithme/PomodoroTimerService;", "Landroid/app/Service;", "()V", "createNotificationChannel", "", "getNotification", "Landroid/app/Notification;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "sendTimeUpdate", "Companion", "app_cofeBazaarDebug"})
public final class PomodoroTimerService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TIME = "EXTRA_TIME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_UPDATE = "ACTION_UPDATE";
    public static final long ONE_SECOND_LONG = 1000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "TIMER_SERVICE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.PomodoroTimerService.Companion Companion = null;
    
    public PomodoroTimerService() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void sendTimeUpdate() {
    }
    
    private final android.app.Notification getNotification() {
        return null;
    }
    
    private final void createNotificationChannel() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lir/m3/rahmani/studywithme/PomodoroTimerService$Companion;", "", "()V", "ACTION_UPDATE", "", "CHANNEL_ID", "EXTRA_TIME", "ONE_SECOND_LONG", "", "app_cofeBazaarDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}