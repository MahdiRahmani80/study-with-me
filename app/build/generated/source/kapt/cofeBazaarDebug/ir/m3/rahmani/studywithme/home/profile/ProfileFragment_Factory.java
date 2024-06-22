package ir.m3.rahmani.studywithme.home.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class ProfileFragment_Factory implements Factory<ProfileFragment> {
  private final Provider<ProfileViewModel> viewModelProvider;

  public ProfileFragment_Factory(Provider<ProfileViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ProfileFragment get() {
    ProfileFragment instance = newInstance();
    ProfileFragment_MembersInjector.injectViewModel(instance, viewModelProvider.get());
    return instance;
  }

  public static ProfileFragment_Factory create(Provider<ProfileViewModel> viewModelProvider) {
    return new ProfileFragment_Factory(viewModelProvider);
  }

  public static ProfileFragment newInstance() {
    return new ProfileFragment();
  }
}
