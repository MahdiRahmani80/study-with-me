package ir.m3.rahmani.studywithme.login.register;

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
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<RegisterViewModel> viewModelProvider;

  public RegisterActivity_MembersInjector(Provider<RegisterViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<RegisterViewModel> viewModelProvider) {
    return new RegisterActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.login.register.RegisterActivity.viewModel")
  public static void injectViewModel(RegisterActivity instance, RegisterViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
