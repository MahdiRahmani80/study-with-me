package ir.m3.rahmani.studywithme.home.profile;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lir/m3/rahmani/studywithme/home/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lir/m3/rahmani/user_data/api/UserApiServiceRepository;", "preferenceRepository", "Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;", "(Lir/m3/rahmani/user_data/api/UserApiServiceRepository;Lir/m3/rahmani/core/shared/UserSharedPreferenceRepository;)V", "saveNewUsername", "", "newUsername", "", "app_cofeBazaarRelease"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.user_data.api.UserApiServiceRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final ir.m3.rahmani.core.shared.UserSharedPreferenceRepository preferenceRepository = null;
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.user_data.api.UserApiServiceRepository repository, @org.jetbrains.annotations.NotNull()
    ir.m3.rahmani.core.shared.UserSharedPreferenceRepository preferenceRepository) {
        super();
    }
    
    public final void saveNewUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String newUsername) {
    }
}