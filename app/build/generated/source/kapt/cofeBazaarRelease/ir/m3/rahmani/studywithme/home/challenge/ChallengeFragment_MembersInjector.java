package ir.m3.rahmani.studywithme.home.challenge;

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
public final class ChallengeFragment_MembersInjector implements MembersInjector<ChallengeFragment> {
  private final Provider<ChallengeViewModel> viewModelProvider;

  public ChallengeFragment_MembersInjector(Provider<ChallengeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ChallengeFragment> create(
      Provider<ChallengeViewModel> viewModelProvider) {
    return new ChallengeFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ChallengeFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment.viewModel")
  public static void injectViewModel(ChallengeFragment instance, ChallengeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
