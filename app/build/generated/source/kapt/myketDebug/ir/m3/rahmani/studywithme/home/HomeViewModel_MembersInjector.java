package ir.m3.rahmani.studywithme.home;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel;
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
public final class HomeViewModel_MembersInjector implements MembersInjector<HomeViewModel> {
  private final Provider<PomodoroViewModel> pomodoroViewModelProvider;

  public HomeViewModel_MembersInjector(Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    this.pomodoroViewModelProvider = pomodoroViewModelProvider;
  }

  public static MembersInjector<HomeViewModel> create(
      Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    return new HomeViewModel_MembersInjector(pomodoroViewModelProvider);
  }

  @Override
  public void injectMembers(HomeViewModel instance) {
    injectPomodoroViewModel(instance, pomodoroViewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.HomeViewModel.pomodoroViewModel")
  public static void injectPomodoroViewModel(HomeViewModel instance,
      PomodoroViewModel pomodoroViewModel) {
    instance.pomodoroViewModel = pomodoroViewModel;
  }
}
