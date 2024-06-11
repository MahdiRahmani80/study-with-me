package ir.m3.rahmani.studywithme.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.home_datastore.model.Play;
import java.util.List;
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
public final class ChallengeStatusBottomSheet_Factory implements Factory<ChallengeStatusBottomSheet> {
  private final Provider<List<Play>> challengeListProvider;

  private final Provider<HomeViewModel> homeViewModelProvider;

  public ChallengeStatusBottomSheet_Factory(Provider<List<Play>> challengeListProvider,
      Provider<HomeViewModel> homeViewModelProvider) {
    this.challengeListProvider = challengeListProvider;
    this.homeViewModelProvider = homeViewModelProvider;
  }

  @Override
  public ChallengeStatusBottomSheet get() {
    return newInstance(challengeListProvider.get(), homeViewModelProvider.get());
  }

  public static ChallengeStatusBottomSheet_Factory create(
      Provider<List<Play>> challengeListProvider, Provider<HomeViewModel> homeViewModelProvider) {
    return new ChallengeStatusBottomSheet_Factory(challengeListProvider, homeViewModelProvider);
  }

  public static ChallengeStatusBottomSheet newInstance(List<Play> challengeList,
      HomeViewModel homeViewModel) {
    return new ChallengeStatusBottomSheet(challengeList, homeViewModel);
  }
}
