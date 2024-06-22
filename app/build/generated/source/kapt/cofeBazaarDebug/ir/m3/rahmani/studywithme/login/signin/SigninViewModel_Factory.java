package ir.m3.rahmani.studywithme.login.signin;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.m3.rahmani.user_data.UserRepository;
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
public final class SigninViewModel_Factory implements Factory<SigninViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public SigninViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public SigninViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static SigninViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new SigninViewModel_Factory(userRepositoryProvider);
  }

  public static SigninViewModel newInstance(UserRepository userRepository) {
    return new SigninViewModel(userRepository);
  }
}
