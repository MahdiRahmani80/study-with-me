package ir.m3.rahmani.studywithme.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository;
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<UserSharedPreferenceRepository> userSharedPrefProvider;

  private final Provider<ChallengeRepository> challengeRepositoryProvider;

  private final Provider<PlayLocalRepository> playLocalRepositoryProvider;

  private final Provider<UserApiServiceRepository> userApiServiceRepositoryProvider;

  private final Provider<PomodoroViewModel> pomodoroViewModelProvider;

  public HomeViewModel_Factory(Provider<UserSharedPreferenceRepository> userSharedPrefProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider,
      Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    this.userSharedPrefProvider = userSharedPrefProvider;
    this.challengeRepositoryProvider = challengeRepositoryProvider;
    this.playLocalRepositoryProvider = playLocalRepositoryProvider;
    this.userApiServiceRepositoryProvider = userApiServiceRepositoryProvider;
    this.pomodoroViewModelProvider = pomodoroViewModelProvider;
  }

  @Override
  public HomeViewModel get() {
    HomeViewModel instance = newInstance(userSharedPrefProvider.get(), challengeRepositoryProvider.get(), playLocalRepositoryProvider.get(), userApiServiceRepositoryProvider.get());
    HomeViewModel_MembersInjector.injectPomodoroViewModel(instance, pomodoroViewModelProvider.get());
    return instance;
  }

  public static HomeViewModel_Factory create(
      Provider<UserSharedPreferenceRepository> userSharedPrefProvider,
      Provider<ChallengeRepository> challengeRepositoryProvider,
      Provider<PlayLocalRepository> playLocalRepositoryProvider,
      Provider<UserApiServiceRepository> userApiServiceRepositoryProvider,
      Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    return new HomeViewModel_Factory(userSharedPrefProvider, challengeRepositoryProvider, playLocalRepositoryProvider, userApiServiceRepositoryProvider, pomodoroViewModelProvider);
  }

  public static HomeViewModel newInstance(UserSharedPreferenceRepository userSharedPref,
      ChallengeRepository challengeRepository, PlayLocalRepository playLocalRepository,
      UserApiServiceRepository userApiServiceRepository) {
    return new HomeViewModel(userSharedPref, challengeRepository, playLocalRepository, userApiServiceRepository);
  }
}
