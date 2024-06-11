package ir.m3.rahmani.studywithme.home.challenge;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lir/m3/rahmani/studywithme/home/challenge/ChallengeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lir/m3/rahmani/studywithme/home/challenge/ChallengeAdapter$ViewHolder;", "challenges", "", "Lir/m3/rahmani/home_datastore/model/Challenge;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_myketRelease"})
public final class ChallengeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ir.m3.rahmani.studywithme.home.challenge.ChallengeAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ir.m3.rahmani.home_datastore.model.Challenge> challenges = null;
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ir.m3.rahmani.home_datastore.model.Challenge, kotlin.Unit> onItemClick;
    
    public ChallengeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<ir.m3.rahmani.home_datastore.model.Challenge> challenges) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<ir.m3.rahmani.home_datastore.model.Challenge, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ir.m3.rahmani.home_datastore.model.Challenge, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ir.m3.rahmani.studywithme.home.challenge.ChallengeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.studywithme.home.challenge.ChallengeAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lir/m3/rahmani/studywithme/home/challenge/ChallengeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lir/m3/rahmani/studywithme/databinding/ItemChallengeBinding;", "(Lir/m3/rahmani/studywithme/home/challenge/ChallengeAdapter;Lir/m3/rahmani/studywithme/databinding/ItemChallengeBinding;)V", "bind", "", "context", "Landroid/content/Context;", "challenge", "Lir/m3/rahmani/home_datastore/model/Challenge;", "mkDescription", "", "showDate", "date", "app_myketRelease"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final ir.m3.rahmani.studywithme.databinding.ItemChallengeBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        ir.m3.rahmani.studywithme.databinding.ItemChallengeBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ir.m3.rahmani.home_datastore.model.Challenge challenge) {
        }
        
        private final java.lang.String showDate(java.lang.String date) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String mkDescription(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        ir.m3.rahmani.home_datastore.model.Challenge challenge) {
            return null;
        }
    }
}