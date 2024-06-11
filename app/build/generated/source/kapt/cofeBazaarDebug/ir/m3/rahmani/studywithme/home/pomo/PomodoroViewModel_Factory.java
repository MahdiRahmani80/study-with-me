package ir.m3.rahmani.studywithme.home.pomo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository;
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository;
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository;
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
public final class PomodoroViewModel_Factory implements Factory<PomodoroViewModel> {
  private final Provider<PomodoroLocalRepository> pomodoroLocalRepositoryProvider;

  private final Provider<UserSharedPreferenceRepository> userSharedPrefProvider;

  private final Provider<UserApiServiceRepository> userApiServiceRepositoryProvider;

  private final Provider<PlayLocalRepository> playLocalRepositoryProvider;

  private final Provider<ChallengeRepository> challengeRepositoryProvider;

  public PomodoroViewModel_Factory(
      Provider<PomodoroLocalRepository> pomodoroLocalRepositoryProvider,
      Provider<UserSharedPreferenceRepository> userSharedPrefProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider) {
    this.pomodoroLocalRepositoryProvider = pomodoroLocalRepositoryProvider;
    this.userSharedPrefProvider = userSharedPrefProvider;
    this.userApiServiceRepositoryProvider = userApiServiceRepositoryProvider;
    this.playLocalRepositoryProvider = playLocalRepositoryProvider;
    this.challengeRepositoryProvider = challengeRepositoryProvider;
  }

  @Override
  public PomodoroViewModel get() {
    return newInstance(pomodoroLocalRepositoryProvider.get(), userSharedPrefProvider.get(), userApiServiceRepositoryProvider.get(), playLocalRepositoryProvider.get(), challengeRepositoryProvider.get());
  }

  public static PomodoroViewModel_Factory create(
      Provider<PomodoroLocalRepository> pomodoroLocalRepositoryProvider,
      Provider<UserSharedPreferenceRepository> userSharedPrefProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider) {
    return new PomodoroViewModel_Factory(pomodoroLocalRepositoryProvider, userSharedPrefProvider, userApiServiceRepositoryProvider, playLocalRepositoryProvider, challengeRepositoryProvider);
  }

  public static PomodoroViewModel newInstance(PomodoroLocalRepository pomodoroLocalRepository,
      UserSharedPreferenceRepository userSharedPref,
      UserApiServiceRepository userApiServiceRepository, PlayLocalRepository playLocalRepository,
      ChallengeRepository challengeRepository) {
    return new PomodoroViewModel(pomodoroLocalRepository, userSharedPref, userApiServiceRepository, playLocalRepository, challengeRepository);
  }
}
