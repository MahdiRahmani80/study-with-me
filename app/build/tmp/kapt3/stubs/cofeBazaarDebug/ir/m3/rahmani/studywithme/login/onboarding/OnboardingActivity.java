package ir.m3.rahmani.studywithme.login.onboarding;

/**
 * todo: fix bug
 * when user want to change theme light to dark ot dark to light
 * app crashing
 * It might be related to making fragment with constructor parameters when activity is
 * created and remaking fragment (pager)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lir/m3/rahmani/studywithme/login/onboarding/OnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lir/m3/rahmani/studywithme/databinding/ActivityOnboardingBinding;", "getPagerData", "Lir/m3/rahmani/studywithme/login/onboarding/pages/OnboardingPagerData;", "item", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ScreenSlidePagerAdapter", "app_cofeBazaarDebug"})
public final class OnboardingActivity extends androidx.appcompat.app.AppCompatActivity {
    private ir.m3.rahmani.studywithme.databinding.ActivityOnboardingBinding binding;
    public static final int SCREEN_NUMBERS = 3;
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity.Companion Companion = null;
    
    public OnboardingActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final ir.m3.rahmani.studywithme.login.onboarding.pages.OnboardingPagerData getPagerData(int item) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lir/m3/rahmani/studywithme/login/onboarding/OnboardingActivity$Companion;", "", "()V", "SCREEN_NUMBERS", "", "app_cofeBazaarDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lir/m3/rahmani/studywithme/login/onboarding/OnboardingActivity$ScreenSlidePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "(Lir/m3/rahmani/studywithme/login/onboarding/OnboardingActivity;Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_cofeBazaarDebug"})
    final class ScreenSlidePagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public ScreenSlidePagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity fa) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}