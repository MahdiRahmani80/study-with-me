package ir.m3.rahmani.studywithme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0002J*\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J(\u0010\u0015\u001a\u00020\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\"\u0010\u0017\u001a\u00020\r2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J:\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\"\u0010\u001e\u001a\u00020\r2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lir/m3/rahmani/studywithme/PaymentRepositoryImpl;", "Lir/m3/rahmani/studywithme/payment/PaymentRepository;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "payment", "Lir/cafebazaar/poolakey/Payment;", "paymentConnection", "Lir/cafebazaar/poolakey/Connection;", "weakActivity", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "callPurchaseFail", "", "T", "result", "Lkotlin/Function1;", "Lkotlin/Result;", "consumePurchase", "purchaseInfo", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "getPurchasedList", "", "initService", "", "launchPurchase", "SKU", "payload", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "startConnection", "stopConnection", "Companion", "app_cofeBazaarDebug"})
public final class PaymentRepositoryImpl implements ir.m3.rahmani.studywithme.payment.PaymentRepository {
    @org.jetbrains.annotations.Nullable()
    private ir.cafebazaar.poolakey.Connection paymentConnection;
    @org.jetbrains.annotations.Nullable()
    private ir.cafebazaar.poolakey.Payment payment;
    @org.jetbrains.annotations.NotNull()
    private java.lang.ref.WeakReference<android.app.Activity> weakActivity;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TOKEN = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwC2Szbzx6lmo3HRHYvc4o1iKljyW6vQ64MiBR4bk+ZS+BO9cuVZpLQXO4SIBSahnXd3h1Bf25FAbrG9ly5I9VIzYlQYhaKt/0yDbc8a8b5svxM3lgLboRBhsB0f5HGa5/+R+nJazFMYIm+qIQWzc4701+q60qvC1xe2g5/3++w4c7ceQejCNlWeKTqWV5Uaha1ZZaqVg6sKl+KlmvTAB9Kai5H8yr6a20Dxpa8BjEUCAwEAAQ==";
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.PaymentRepositoryImpl.Companion Companion = null;
    
    public PaymentRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @java.lang.Override()
    public void initService(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.String>, kotlin.Unit> result) {
    }
    
    private final void startConnection(kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.String>, kotlin.Unit> result) {
    }
    
    @java.lang.Override()
    public void stopConnection() {
    }
    
    @java.lang.Override()
    public void launchPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String SKU, @org.jetbrains.annotations.NotNull()
    java.lang.String payload, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultRegistry activityResultRegistry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>, kotlin.Unit> result) {
    }
    
    @java.lang.Override()
    public void getPurchasedList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<? extends java.util.List<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>>, kotlin.Unit> result) {
    }
    
    private final <T extends java.lang.Object>void callPurchaseFail(kotlin.jvm.functions.Function1<? super kotlin.Result<? extends T>, kotlin.Unit> result) {
    }
    
    @java.lang.Override()
    public void consumePurchase(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchaseInfo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>, kotlin.Unit> result) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lir/m3/rahmani/studywithme/PaymentRepositoryImpl$Companion;", "", "()V", "TOKEN", "", "app_cofeBazaarDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}