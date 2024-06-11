package ir.m3.rahmani.studywithme.home.challenge.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lir/m3/rahmani/studywithme/home/challenge/dialog/ChallengeBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "challengeViewModel", "Lir/m3/rahmani/studywithme/home/challenge/ChallengeViewModel;", "(Lir/m3/rahmani/studywithme/home/challenge/ChallengeViewModel;)V", "binding", "Lir/m3/rahmani/studywithme/databinding/BottomSheetAddChallengeBinding;", "endTime", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveNewChallenge", "startTime", "Companion", "app_cofeBazaarDebug"})
public final class ChallengeBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel challengeViewModel = null;
    private ir.m3.rahmani.studywithme.databinding.BottomSheetAddChallengeBinding binding;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String timeStart = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String timeEnd = "";
    public static final int MIN_TARGET = 4;
    public static final int MAX_TARGET = 200;
    public static final int MIN_COIN = 25;
    public static final int MAX_COIN = 1000;
    @org.jetbrains.annotations.NotNull()
    public static final ir.m3.rahmani.studywithme.home.challenge.dialog.ChallengeBottomSheet.Companion Companion = null;
    
    @javax.inject.Inject()
    public ChallengeBottomSheet(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel challengeViewModel) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveNewChallenge() {
    }
    
    private final void startTime() {
    }
    
    private final void endTime() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lir/m3/rahmani/studywithme/home/challenge/dialog/ChallengeBottomSheet$Companion;", "", "()V", "MAX_COIN", "", "MAX_TARGET", "MIN_COIN", "MIN_TARGET", "timeEnd", "", "getTimeEnd", "()Ljava/lang/String;", "setTimeEnd", "(Ljava/lang/String;)V", "timeStart", "getTimeStart", "setTimeStart", "app_cofeBazaarDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTimeStart() {
            return null;
        }
        
        public final void setTimeStart(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTimeEnd() {
            return null;
        }
        
        public final void setTimeEnd(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}