package ir.m3.rahmani.studywithme.home.profile;

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
public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<ProfileViewModel> viewModelProvider;

  public ProfileFragment_MembersInjector(Provider<ProfileViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<ProfileViewModel> viewModelProvider) {
    return new ProfileFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.profile.ProfileFragment.viewModel")
  public static void injectViewModel(ProfileFragment instance, ProfileViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
