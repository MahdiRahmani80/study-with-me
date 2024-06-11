package ir.m3.rahmani.studywithme.login.register;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lir/m3/rahmani/studywithme/login/register/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lir/m3/rahmani/user_data/UserRepository;", "(Lir/m3/rahmani/user_data/UserRepository;)V", "_isAddUserSuccessful", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isAddUserSuccessful", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_isAddUserSuccessful$delegate", "Lkotlin/Lazy;", "isAddUserSuccessful", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "addUser", "", "username", "", "phone", "app_myketDebug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.user_data.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _isAddUserSuccessful$delegate = null;
    
    @javax.inject.Inject()
    public RegisterViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.user_data.UserRepository userRepository) {
        super();
    }
    
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> get_isAddUserSuccessful() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAddUserSuccessful() {
        return null;
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
}