package ir.m3.rahmani.studywithme.home.challenge;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository;
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository;
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
public final class ChallengeViewModel_Factory implements Factory<ChallengeViewModel> {
  private final Provider<ChallengeRepository> challengeRepositoryProvider;

  private final Provider<UserSharedPreferenceRepository> sharedPreferenceRepositoryProvider;

  private final Provider<PlayLocalRepository> playLocalRepositoryProvider;

  private final Provider<UserApiServiceRepository> userApiServiceRepositoryProvider;

  public ChallengeViewModel_Factory(Provider<ChallengeRepository> challengeRepositoryProvider,
      Provider<UserSharedPreferenceRepository> sharedPreferenceRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider) {
    this.challengeRepositoryProvider = challengeRepositoryProvider;
    this.sharedPreferenceRepositoryProvider = sharedPreferenceRepositoryProvider;
    this.playLocalRepositoryProvider = playLocalRepositoryProvider;
    this.userApiServiceRepositoryProvider = userApiServiceRepositoryProvider;
  }

  @Override
  public ChallengeViewModel get() {
    return newInstance(challengeRepositoryProvider.get(), sharedPreferenceRepositoryProvider.get(), playLocalRepositoryProvider.get(), userApiServiceRepositoryProvider.get());
  }

  public static ChallengeViewModel_Factory create(
      Provider<ChallengeRepository> challengeRepositoryProvider,
      Provider<UserSharedPreferenceRepository> sharedPreferenceRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider) {
    return new ChallengeViewModel_Factory(challengeRepositoryProvider, sharedPreferenceRepositoryProvider, playLocalRepositoryProvider, userApiServiceRepositoryProvider);
  }

  public static ChallengeViewModel newInstance(ChallengeRepository challengeRepository,
      UserSharedPreferenceRepository sharedPreferenceRepository,
      PlayLocalRepository playLocalRepository, UserApiServiceRepository userApiServiceRepository) {
    return new ChallengeViewModel(challengeRepository, sharedPreferenceRepository, playLocalRepository, userApiServiceRepository);
  }
}
