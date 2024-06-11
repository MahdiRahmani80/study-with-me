package ir.m3.rahmani.studywithme.home.pomo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J!\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006-"}, d2 = {"Lir/m3/rahmani/studywithme/home/pomo/PomodoroFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lir/m3/rahmani/studywithme/databinding/FragmentPomodoroBinding;", "binding", "getBinding", "()Lir/m3/rahmani/studywithme/databinding/FragmentPomodoroBinding;", "context", "Landroid/content/Context;", "pomodoroViewModel", "Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "getPomodoroViewModel", "()Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;", "setPomodoroViewModel", "(Lir/m3/rahmani/studywithme/home/pomo/PomodoroViewModel;)V", "getTimerTimeCountDown", "", "state", "listener", "", "Lir/m3/rahmani/studywithme/home/pomo/TimerState;", "onAttach", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "playButtonCondition", "readChallengeNullHandler", "", "countPomo", "challengeTarget", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "serviceHandler", "setPomodoroClockCompose", "setUserInfo", "activity", "Landroidx/lifecycle/LifecycleOwner;", "app_myketRelease"})
public final class PomodoroFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel pomodoroViewModel;
    @org.jetbrains.annotations.Nullable()
    private ir.m3.rahmani.studywithme.databinding.FragmentPomodoroBinding _binding;
    private android.content.Context context;
    
    @javax.inject.Inject()
    public PomodoroFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel getPomodoroViewModel() {
        return null;
    }
    
    public final void setPomodoroViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel p0) {
    }
    
    private final ir.m3.rahmani.studywithme.databinding.FragmentPomodoroBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setPomodoroClockCompose() {
    }
    
    private final int getTimerTimeCountDown(int state) {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void serviceHandler(ir.m3.rahmani.studywithme.home.pomo.TimerState state) {
    }
    
    private final void setUserInfo(androidx.lifecycle.LifecycleOwner activity) {
    }
    
    private final java.lang.String readChallengeNullHandler(java.lang.Integer countPomo, java.lang.Integer challengeTarget) {
        return null;
    }
    
    private final void listener(ir.m3.rahmani.studywithme.home.pomo.TimerState state) {
    }
    
    private final void playButtonCondition(ir.m3.rahmani.studywithme.home.pomo.TimerState state) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}