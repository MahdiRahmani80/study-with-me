package ir.m3.rahmani.studywithme.login.register;

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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public RegisterViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new RegisterViewModel_Factory(userRepositoryProvider);
  }

  public static RegisterViewModel newInstance(UserRepository userRepository) {
    return new RegisterViewModel(userRepository);
  }
}
