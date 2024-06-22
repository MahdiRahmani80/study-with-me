package ir.m3.rahmani.studywithme.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00030\u0007H&J(\u0010\t\u001a\u00020\u00032\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\"\u0010\u000b\u001a\u00020\u00032\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0004\u0012\u00020\u00030\u0007H&J:\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\u0012\u001a\u00020\u0003H&\u00a8\u0006\u0013"}, d2 = {"Lir/m3/rahmani/studywithme/payment/PaymentRepository;", "", "consumePurchase", "", "purchaseInfo", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "result", "Lkotlin/Function1;", "Lkotlin/Result;", "getPurchasedList", "", "initService", "", "launchPurchase", "SKU", "payload", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "stopConnection", "app_cofeBazaarRelease"})
public abstract interface PaymentRepository {
    
    public abstract void initService(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.String>, kotlin.Unit> result);
    
    public abstract void stopConnection();
    
    public abstract void launchPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String SKU, @org.jetbrains.annotations.NotNull()
    java.lang.String payload, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultRegistry activityResultRegistry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>, kotlin.Unit> result);
    
    public abstract void getPurchasedList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<? extends java.util.List<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>>, kotlin.Unit> result);
    
    public abstract void consumePurchase(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchaseInfo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.Result<ir.m3.rahmani.studywithme.payment.MyPurchaseInfo>, kotlin.Unit> result);
}