package ir.m3.rahmani.studywithme.donate;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lir/m3/rahmani/studywithme/donate/DonateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lir/m3/rahmani/studywithme/payment/PurchaseHelper$PurchaseListener;", "()V", "binding", "Lir/m3/rahmani/studywithme/databinding/ActivityDonateBinding;", "getBinding", "()Lir/m3/rahmani/studywithme/databinding/ActivityDonateBinding;", "setBinding", "(Lir/m3/rahmani/studywithme/databinding/ActivityDonateBinding;)V", "purchaseHelper", "Lir/m3/rahmani/studywithme/payment/PurchaseHelper;", "getPurchaseHelper", "()Lir/m3/rahmani/studywithme/payment/PurchaseHelper;", "purchaseHelper$delegate", "Lkotlin/Lazy;", "initPayment", "", "onConsumeFinished", "purchase", "Lir/m3/rahmani/studywithme/payment/MyPurchaseInfo;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onErrorInPayment", "error", "", "startPurchase", "sku", "Companion", "app_myketRelease"})
public final class DonateActivity extends androidx.appcompat.app.AppCompatActivity implements ir.m3.rahmani.studywithme.payment.PurchaseHelper.PurchaseListener {
    public ir.m3.rahmani.studywithme.databinding.ActivityDonateBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DONATE_1000 = "donate_1000";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DONATE_5000 = "donate_5000";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DONATE_20000 = "donate_20";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DONATE_100000 = "donate_100";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy purchaseHelper$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.donate.DonateActivity.Companion Companion = null;
    
    public DonateActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.databinding.ActivityDonateBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.databinding.ActivityDonateBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final ir.m3.rahmani.studywithme.payment.PurchaseHelper getPurchaseHelper() {
        return null;
    }
    
    public final void initPayment() {
    }
    
    public final void startPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String sku) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onConsumeFinished(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.payment.MyPurchaseInfo purchase) {
    }
    
    @java.lang.Override()
    public void onErrorInPayment(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lir/m3/rahmani/studywithme/donate/DonateActivity$Companion;", "", "()V", "DONATE_1000", "", "DONATE_100000", "DONATE_20000", "DONATE_5000", "app_myketRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}