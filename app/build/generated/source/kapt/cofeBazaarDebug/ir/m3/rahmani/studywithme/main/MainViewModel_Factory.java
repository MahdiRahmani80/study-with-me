package ir.m3.rahmani.studywithme.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<UserSharedPreferenceRepository> sharedPrefProvider;

  private final Provider<ChallengeRepository> challengeRepositoryProvider;

  public MainViewModel_Factory(Provider<UserSharedPreferenceRepository> sharedPrefProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
    this.challengeRepositoryProvider = challengeRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(sharedPrefProvider.get(), challengeRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<UserSharedPreferenceRepository> sharedPrefProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider) {
    return new MainViewModel_Factory(sharedPrefProvider, challengeRepositoryProvider);
  }

  public static MainViewModel newInstance(UserSharedPreferenceRepository sharedPref,
      ChallengeRepository challengeRepository) {
    return new MainViewModel(sharedPref, challengeRepository);
  }
}
