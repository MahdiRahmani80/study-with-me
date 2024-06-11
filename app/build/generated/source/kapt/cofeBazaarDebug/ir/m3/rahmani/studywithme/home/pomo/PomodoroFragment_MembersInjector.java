package ir.m3.rahmani.studywithme.home.pomo;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
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
public final class PomodoroFragment_MembersInjector implements MembersInjector<PomodoroFragment> {
  private final Provider<PomodoroViewModel> pomodoroViewModelProvider;

  public PomodoroFragment_MembersInjector(Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    this.pomodoroViewModelProvider = pomodoroViewModelProvider;
  }

  public static MembersInjector<PomodoroFragment> create(
      Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    return new PomodoroFragment_MembersInjector(pomodoroViewModelProvider);
  }

  @Override
  public void injectMembers(PomodoroFragment instance) {
    injectPomodoroViewModel(instance, pomodoroViewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment.pomodoroViewModel")
  public static void injectPomodoroViewModel(PomodoroFragment instance,
      PomodoroViewModel pomodoroViewModel) {
    instance.pomodoroViewModel = pomodoroViewModel;
  }
}
