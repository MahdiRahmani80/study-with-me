package ir.m3.rahmani.studywithme.home.pomo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class PomodoroFragment_Factory implements Factory<PomodoroFragment> {
  private final Provider<PomodoroViewModel> pomodoroViewModelProvider;

  public PomodoroFragment_Factory(Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    this.pomodoroViewModelProvider = pomodoroViewModelProvider;
  }

  @Override
  public PomodoroFragment get() {
    PomodoroFragment instance = newInstance();
    PomodoroFragment_MembersInjector.injectPomodoroViewModel(instance, pomodoroViewModelProvider.get());
    return instance;
  }

  public static PomodoroFragment_Factory create(
      Provider<PomodoroViewModel> pomodoroViewModelProvider) {
    return new PomodoroFragment_Factory(pomodoroViewModelProvider);
  }

  public static PomodoroFragment newInstance() {
    return new PomodoroFragment();
  }
}
