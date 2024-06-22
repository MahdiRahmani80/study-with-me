package ir.m3.rahmani.studywithme.home;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment;
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment;
import ir.m3.rahmani.studywithme.home.stats.StatsFragment;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<HomeViewModel> homeViewModelProvider;

  private final Provider<PomodoroFragment> pomodoroFragmentProvider;

  private final Provider<ChallengeFragment> challengeFragmentProvider;

  private final Provider<StatsFragment> statsFragmentProvider;

  private final Provider<ProfileFragment> profileFragmentProvider;

  public HomeActivity_MembersInjector(Provider<HomeViewModel> homeViewModelProvider,
      Provider<PomodoroFragment> pomodoroFragmentProvider,
      Provider<ChallengeFragment> challengeFragmentProvider,
      Provider<StatsFragment> statsFragmentProvider,
      Provider<ProfileFragment> profileFragmentProvider) {
    this.homeViewModelProvider = homeViewModelProvider;
    this.pomodoroFragmentProvider = pomodoroFragmentProvider;
    this.challengeFragmentProvider = challengeFragmentProvider;
    this.statsFragmentProvider = statsFragmentProvider;
    this.profileFragmentProvider = profileFragmentProvider;
  }

  public static MembersInjector<HomeActivity> create(Provider<HomeViewModel> homeViewModelProvider,
      Provider<PomodoroFragment> pomodoroFragmentProvider,
      Provider<ChallengeFragment> challengeFragmentProvider,
      Provider<StatsFragment> statsFragmentProvider,
      Provider<ProfileFragment> profileFragmentProvider) {
    return new HomeActivity_MembersInjector(homeViewModelProvider, pomodoroFragmentProvider, challengeFragmentProvider, statsFragmentProvider, profileFragmentProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectHomeViewModel(instance, homeViewModelProvider.get());
    injectPomodoroFragment(instance, pomodoroFragmentProvider.get());
    injectChallengeFragment(instance, challengeFragmentProvider.get());
    injectStatsFragment(instance, statsFragmentProvider.get());
    injectProfileFragment(instance, profileFragmentProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeActivity.homeViewModel")
  public static void injectHomeViewModel(HomeActivity instance, HomeViewModel homeViewModel) {
    instance.homeViewModel = homeViewModel;
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeActivity.pomodoroFragment")
  public static void injectPomodoroFragment(HomeActivity instance,
      PomodoroFragment pomodoroFragment) {
    instance.pomodoroFragment = pomodoroFragment;
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeActivity.challengeFragment")
  public static void injectChallengeFragment(HomeActivity instance,
      ChallengeFragment challengeFragment) {
    instance.challengeFragment = challengeFragment;
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeActivity.statsFragment")
  public static void injectStatsFragment(HomeActivity instance, StatsFragment statsFragment) {
    instance.statsFragment = statsFragment;
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeActivity.profileFragment")
  public static void injectProfileFragment(HomeActivity instance, ProfileFragment profileFragment) {
    instance.profileFragment = profileFragment;
  }
}
