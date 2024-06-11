package ir.m3.rahmani.studywithme.home.challenge;

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
public final class ChallengeFragment_Factory implements Factory<ChallengeFragment> {
  private final Provider<ChallengeViewModel> viewModelProvider;

  public ChallengeFragment_Factory(Provider<ChallengeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ChallengeFragment get() {
    ChallengeFragment instance = newInstance();
    ChallengeFragment_MembersInjector.injectViewModel(instance, viewModelProvider.get());
    return instance;
  }

  public static ChallengeFragment_Factory create(Provider<ChallengeViewModel> viewModelProvider) {
    return new ChallengeFragment_Factory(viewModelProvider);
  }

  public static ChallengeFragment newInstance() {
    return new ChallengeFragment();
  }
}
