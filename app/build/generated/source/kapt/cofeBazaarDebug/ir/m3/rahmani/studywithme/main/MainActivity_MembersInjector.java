package ir.m3.rahmani.studywithme.main;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<MainViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<MainViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.main.MainActivity.viewModel")
  public static void injectViewModel(MainActivity instance, MainViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
