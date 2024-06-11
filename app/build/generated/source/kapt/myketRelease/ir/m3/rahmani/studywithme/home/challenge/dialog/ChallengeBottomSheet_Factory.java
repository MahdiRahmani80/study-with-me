package ir.m3.rahmani.studywithme.home.challenge.dialog;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel;
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
public final class ChallengeBottomSheet_Factory implements Factory<ChallengeBottomSheet> {
  private final Provider<ChallengeViewModel> challengeViewModelProvider;

  public ChallengeBottomSheet_Factory(Provider<ChallengeViewModel> challengeViewModelProvider) {
    this.challengeViewModelProvider = challengeViewModelProvider;
  }

  @Override
  public ChallengeBottomSheet get() {
    return newInstance(challengeViewModelProvider.get());
  }

  public static ChallengeBottomSheet_Factory create(
      Provider<ChallengeViewModel> challengeViewModelProvider) {
    return new ChallengeBottomSheet_Factory(challengeViewModelProvider);
  }

  public static ChallengeBottomSheet newInstance(ChallengeViewModel challengeViewModel) {
    return new ChallengeBottomSheet(challengeViewModel);
  }
}
