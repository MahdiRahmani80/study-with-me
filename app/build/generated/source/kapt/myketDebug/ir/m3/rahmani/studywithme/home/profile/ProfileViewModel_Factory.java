package ir.m3.rahmani.studywithme.home.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.user_data.api.UserApiServiceRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<UserApiServiceRepository> repositoryProvider;

  private final Provider<UserSharedPreferenceRepository> preferenceRepositoryProvider;

  public ProfileViewModel_Factory(Provider<UserApiServiceRepository> repositoryProvider,
      Provider<UserSharedPreferenceRepository> preferenceRepositoryProvider) {
    this.repositoryProvider = repositoryProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(repositoryProvider.get(), preferenceRepositoryProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<UserApiServiceRepository> repositoryProvider,
      Provider<UserSharedPreferenceRepository> preferenceRepositoryProvider) {
    return new ProfileViewModel_Factory(repositoryProvider, preferenceRepositoryProvider);
  }

  public static ProfileViewModel newInstance(UserApiServiceRepository repository,
      UserSharedPreferenceRepository preferenceRepository) {
    return new ProfileViewModel(repository, preferenceRepository);
  }
}
