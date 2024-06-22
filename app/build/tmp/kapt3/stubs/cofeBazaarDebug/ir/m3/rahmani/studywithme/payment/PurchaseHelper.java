package ir.m3.rahmani.studywithme.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lir/m3/rahmani/studywithme/payment/PurchaseHelper;", "", "purchaseListener", "Lir/m3/rahmani/studywithme/payment/PurchaseHelper$PurchaseListener;", "(Lir/m3/rahmani/studywithme/payment/PurchaseHelper$PurchaseListener;)V", "paymentRepository", "Lir/m3/rahmani/studywithme/payment/PaymentRepository;", "userPayload", "", "getUserPayload", "()Ljava/lang/String;", "userPayload$delegate", "Lkotlin/Lazy;", "consumePurchaseInSDK", "", "purchase", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "result", "Lkotlin/Function1;", "Lkotlin/Result;", "consumePurchaseInServer", "launchPurchaseFlow", "sku", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "startIAP", "activity", "Landroid/app/Activity;", "stopService", "verifyDeveloperPayload", "", "PurchaseListener", "app_cofeBazaarDebug"})
public final class PurchaseHelper {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.studywithme.payment.PurchaseHelper.PurchaseListener purchaseListener = null;
    @org.jetbrains.annotations.Nullable()
    private ir.m3.rahmani.studywithme.payment.PaymentRepository paymentRepository;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userPayload$delegate = null;
    
    public PurchaseHelper(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.PurchaseHelper.PurchaseListener purchaseListener) {
        super();
    }
    
    private final java.lang.String getUserPayload() {
        return null;
    }
    
    public final void launchPurchaseFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultRegistry activityResultRegistry) {
    }
    
    public final void startIAP(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void consumePurchaseInServer(ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase) {
    }
    
    public final void consumePurchaseInSDK(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>, kotlin.Unit> result) {
    }
    
    private final boolean verifyDeveloperPayload(ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase) {
        return false;
    }
    
    public final void stopService() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lir/m3/rahmani/studywithme/payment/PurchaseHelper$PurchaseListener;", "", "onConsumeFinished", "", "purchase", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "onErrorInPayment", "error", "", "app_cofeBazaarDebug"})
    public static abstract interface PurchaseListener {
        
        public abstract void onConsumeFinished(@org.jetbrains.annotations.NotNull()
        ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase);
        
        public abstract void onErrorInPayment(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
    }
}