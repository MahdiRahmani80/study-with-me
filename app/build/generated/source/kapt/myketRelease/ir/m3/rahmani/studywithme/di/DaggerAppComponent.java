package ir.m3.rahmani.studywithme.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import ir.m3.rahmani.core.di.CoreComponent;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository;
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository_Factory;
import ir.m3.rahmani.home_datastore.api.ChallengeApiService;
import ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule;
import ir.m3.rahmani.home_datastore.api.ChallengeApiServiceModule_ProvideChallengeApiServiceFactory;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository;
import ir.m3.rahmani.home_datastore.api.ChallengeRepository_Factory;
import ir.m3.rahmani.home_datastore.local.RoomModule;
import ir.m3.rahmani.home_datastore.local.RoomModule_ProvideAppDatabaseFactory;
import ir.m3.rahmani.home_datastore.local.RoomModule_ProvidePlayLocalDaoFactory;
import ir.m3.rahmani.home_datastore.local.RoomModule_ProvidepomodoroDaoDaoFactory;
import ir.m3.rahmani.home_datastore.local.dao.AppDatabase;
import ir.m3.rahmani.home_datastore.local.dao.PlayLocalDao;
import ir.m3.rahmani.home_datastore.local.dao.PomodoroDao;
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository;
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository_Factory;
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository;
import ir.m3.rahmani.home_datastore.local.repository.PomodoroLocalRepository_Factory;
import ir.m3.rahmani.studywithme.StudyWithMeApplication;
import ir.m3.rahmani.studywithme.donate.DonateActivity;
import ir.m3.rahmani.studywithme.home.HomeActivity;
import ir.m3.rahmani.studywithme.home.HomeActivity_MembersInjector;
import ir.m3.rahmani.studywithme.home.HomeComponent;
import ir.m3.rahmani.studywithme.home.HomeViewModel;
import ir.m3.rahmani.studywithme.home.HomeViewModel_Factory;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment_Factory;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment_MembersInjector;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel;
import ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel_Factory;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment_Factory;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment_MembersInjector;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel;
import ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel_Factory;
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment;
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment_Factory;
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment_MembersInjector;
import ir.m3.rahmani.studywithme.home.profile.ProfileViewModel;
import ir.m3.rahmani.studywithme.home.profile.ProfileViewModel_Factory;
import ir.m3.rahmani.studywithme.home.stats.StatsFragment;
import ir.m3.rahmani.studywithme.home.stats.StatsFragment_Factory;
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity;
import ir.m3.rahmani.studywithme.login.register.RegisterActivity;
import ir.m3.rahmani.studywithme.login.register.RegisterActivity_MembersInjector;
import ir.m3.rahmani.studywithme.login.register.RegisterViewModel;
import ir.m3.rahmani.studywithme.main.MainActivity;
import ir.m3.rahmani.studywithme.main.MainActivity_MembersInjector;
import ir.m3.rahmani.studywithme.main.MainViewModel;
import ir.m3.rahmani.studywithme.main.MainViewModel_Factory;
import ir.m3.rahmani.user_data.UserRepository;
import ir.m3.rahmani.user_data.api.UserApiService;
import ir.m3.rahmani.user_data.api.UserApiServiceRepository;
import ir.m3.rahmani.user_data.api.UserApiServiceRepository_Factory;
import ir.m3.rahmani.user_data.di.ApiServiceModule;
import ir.m3.rahmani.user_data.di.ApiServiceModule_ProvideApiServiceFactory;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApiServiceModule apiServiceModule;

    private RoomModule roomModule;

    private ChallengeApiServiceModule challengeApiServiceModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder apiServiceModule(ApiServiceModule apiServiceModule) {
      this.apiServiceModule = Preconditions.checkNotNull(apiServiceModule);
      return this;
    }

    public Builder roomModule(RoomModule roomModule) {
      this.roomModule = Preconditions.checkNotNull(roomModule);
      return this;
    }

    public Builder challengeApiServiceModule(ChallengeApiServiceModule challengeApiServiceModule) {
      this.challengeApiServiceModule = Preconditions.checkNotNull(challengeApiServiceModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public AppComponent build() {
      if (apiServiceModule == null) {
        this.apiServiceModule = new ApiServiceModule();
      }
      if (roomModule == null) {
        this.roomModule = new RoomModule();
      }
      if (challengeApiServiceModule == null) {
        this.challengeApiServiceModule = new ChallengeApiServiceModule();
      }
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new AppComponentImpl(apiServiceModule, roomModule, challengeApiServiceModule, coreComponent);
    }
  }

  private static final class HomeComponentFactory implements HomeComponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private HomeComponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public HomeComponent create() {
      return new HomeComponentImpl(appComponentImpl);
    }
  }

  private static final class HomeComponentImpl implements HomeComponent {
    private final AppComponentImpl appComponentImpl;

    private final HomeComponentImpl homeComponentImpl = this;

    private HomeComponentImpl(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(PomodoroFragment pomodoroFragment) {
      injectPomodoroFragment(pomodoroFragment);
    }

    @Override
    public void inject(ChallengeFragment challengeFragment) {
      injectChallengeFragment(challengeFragment);
    }

    @Override
    public void inject(StatsFragment statsFragment) {
    }

    @Override
    public void inject(ProfileFragment profileFragment) {
      injectProfileFragment(profileFragment);
    }

    private PomodoroFragment injectPomodoroFragment(PomodoroFragment instance) {
      PomodoroFragment_MembersInjector.injectPomodoroViewModel(instance, appComponentImpl.pomodoroViewModelProvider.get());
      return instance;
    }

    private ChallengeFragment injectChallengeFragment(ChallengeFragment instance) {
      ChallengeFragment_MembersInjector.injectViewModel(instance, appComponentImpl.challengeViewModelProvider.get());
      return instance;
    }

    private ProfileFragment injectProfileFragment(ProfileFragment instance) {
      ProfileFragment_MembersInjector.injectViewModel(instance, appComponentImpl.profileViewModelProvider.get());
      return instance;
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final ApiServiceModule apiServiceModule;

    private final CoreComponent coreComponent;

    private final AppComponentImpl appComponentImpl = this;

    private Provider<Application> provideApplicationProvider;

    private Provider<UserSharedPreferenceRepository> userSharedPreferenceRepositoryProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<ChallengeApiService> provideChallengeApiServiceProvider;

    private Provider<ChallengeRepository> challengeRepositoryProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<AppDatabase> provideAppDatabaseProvider;

    private Provider<PlayLocalDao> providePlayLocalDaoProvider;

    private Provider<PlayLocalRepository> playLocalRepositoryProvider;

    private Provider<UserApiService> provideApiServiceProvider;

    private Provider<UserApiServiceRepository> userApiServiceRepositoryProvider;

    private Provider<PomodoroDao> providepomodoroDaoDaoProvider;

    private Provider<PomodoroLocalRepository> pomodoroLocalRepositoryProvider;

    private Provider<PomodoroViewModel> pomodoroViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<ChallengeViewModel> challengeViewModelProvider;

    private Provider<StatsFragment> statsFragmentProvider;

    private Provider<ProfileViewModel> profileViewModelProvider;

    private Provider<ProfileFragment> profileFragmentProvider;

    private AppComponentImpl(ApiServiceModule apiServiceModuleParam, RoomModule roomModuleParam,
        ChallengeApiServiceModule challengeApiServiceModuleParam,
        CoreComponent coreComponentParam) {
      this.apiServiceModule = apiServiceModuleParam;
      this.coreComponent = coreComponentParam;
      initialize(apiServiceModuleParam, roomModuleParam, challengeApiServiceModuleParam, coreComponentParam);

    }

    private UserApiService userApiService() {
      return ApiServiceModule_ProvideApiServiceFactory.provideApiService(apiServiceModule, Preconditions.checkNotNullFromComponent(coreComponent.provideRetrofit()));
    }

    private UserApiServiceRepository userApiServiceRepository() {
      return new UserApiServiceRepository(userApiService());
    }

    private UserRepository userRepository() {
      return new UserRepository(userSharedPreferenceRepositoryProvider.get(), userApiServiceRepository());
    }

    private RegisterViewModel registerViewModel() {
      return new RegisterViewModel(userRepository());
    }

    private PomodoroFragment pomodoroFragment() {
      return injectPomodoroFragment(PomodoroFragment_Factory.newInstance());
    }

    private ChallengeFragment challengeFragment() {
      return injectChallengeFragment(ChallengeFragment_Factory.newInstance());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApiServiceModule apiServiceModuleParam,
        final RoomModule roomModuleParam,
        final ChallengeApiServiceModule challengeApiServiceModuleParam,
        final CoreComponent coreComponentParam) {
      this.provideApplicationProvider = new ProvideApplicationProvider(coreComponentParam);
      this.userSharedPreferenceRepositoryProvider = DoubleCheck.provider(UserSharedPreferenceRepository_Factory.create(provideApplicationProvider));
      this.provideRetrofitProvider = new ProvideRetrofitProvider(coreComponentParam);
      this.provideChallengeApiServiceProvider = ChallengeApiServiceModule_ProvideChallengeApiServiceFactory.create(challengeApiServiceModuleParam, provideRetrofitProvider);
      this.challengeRepositoryProvider = ChallengeRepository_Factory.create(provideChallengeApiServiceProvider);
      this.mainViewModelProvider = DoubleCheck.provider(MainViewModel_Factory.create(userSharedPreferenceRepositoryProvider, challengeRepositoryProvider));
      this.provideAppDatabaseProvider = RoomModule_ProvideAppDatabaseFactory.create(roomModuleParam, provideApplicationProvider);
      this.providePlayLocalDaoProvider = RoomModule_ProvidePlayLocalDaoFactory.create(roomModuleParam, provideAppDatabaseProvider);
      this.playLocalRepositoryProvider = PlayLocalRepository_Factory.create(providePlayLocalDaoProvider);
      this.provideApiServiceProvider = ApiServiceModule_ProvideApiServiceFactory.create(apiServiceModuleParam, provideRetrofitProvider);
      this.userApiServiceRepositoryProvider = UserApiServiceRepository_Factory.create(provideApiServiceProvider);
      this.providepomodoroDaoDaoProvider = RoomModule_ProvidepomodoroDaoDaoFactory.create(roomModuleParam, provideAppDatabaseProvider);
      this.pomodoroLocalRepositoryProvider = PomodoroLocalRepository_Factory.create(providepomodoroDaoDaoProvider);
      this.pomodoroViewModelProvider = DoubleCheck.provider(PomodoroViewModel_Factory.create(pomodoroLocalRepositoryProvider, userSharedPreferenceRepositoryProvider, userApiServiceRepositoryProvider, playLocalRepositoryProvider, challengeRepositoryProvider));
      this.homeViewModelProvider = DoubleCheck.provider(HomeViewModel_Factory.create(userSharedPreferenceRepositoryProvider, challengeRepositoryProvider, playLocalRepositoryProvider, userApiServiceRepositoryProvider, pomodoroViewModelProvider));
      this.challengeViewModelProvider = DoubleCheck.provider(ChallengeViewModel_Factory.create(challengeRepositoryProvider, userSharedPreferenceRepositoryProvider, playLocalRepositoryProvider, userApiServiceRepositoryProvider));
      this.statsFragmentProvider = DoubleCheck.provider(StatsFragment_Factory.create());
      this.profileViewModelProvider = DoubleCheck.provider(ProfileViewModel_Factory.create(userApiServiceRepositoryProvider, userSharedPreferenceRepositoryProvider));
      this.profileFragmentProvider = DoubleCheck.provider(ProfileFragment_Factory.create(profileViewModelProvider));
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    @Override
    public void inject(StudyWithMeApplication app) {
    }

    @Override
    public void inject(OnboardingActivity onboardingActivity) {
    }

    @Override
    public void inject(RegisterActivity registerActivity) {
      injectRegisterActivity(registerActivity);
    }

    @Override
    public void inject(HomeActivity homeActivity) {
      injectHomeActivity(homeActivity);
    }

    @Override
    public void inject(ChallengeFragment challengeFragment) {
      injectChallengeFragment(challengeFragment);
    }

    @Override
    public void inject(ProfileFragment profileFragment) {
      injectProfileFragment(profileFragment);
    }

    @Override
    public void inject(DonateActivity donateActivity) {
    }

    @Override
    public Retrofit provideRetrofit() {
      return Preconditions.checkNotNullFromComponent(coreComponent.provideRetrofit());
    }

    @Override
    public HomeComponent.Factory provideHome() {
      return new HomeComponentFactory(appComponentImpl);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectViewModel(instance, mainViewModelProvider.get());
      return instance;
    }

    private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
      RegisterActivity_MembersInjector.injectViewModel(instance, registerViewModel());
      return instance;
    }

    private PomodoroFragment injectPomodoroFragment(PomodoroFragment instance) {
      PomodoroFragment_MembersInjector.injectPomodoroViewModel(instance, pomodoroViewModelProvider.get());
      return instance;
    }

    private ChallengeFragment injectChallengeFragment(ChallengeFragment instance) {
      ChallengeFragment_MembersInjector.injectViewModel(instance, challengeViewModelProvider.get());
      return instance;
    }

    private HomeActivity injectHomeActivity(HomeActivity instance) {
      HomeActivity_MembersInjector.injectHomeViewModel(instance, homeViewModelProvider.get());
      HomeActivity_MembersInjector.injectPomodoroFragment(instance, pomodoroFragment());
      HomeActivity_MembersInjector.injectChallengeFragment(instance, challengeFragment());
      HomeActivity_MembersInjector.injectStatsFragment(instance, statsFragmentProvider.get());
      HomeActivity_MembersInjector.injectProfileFragment(instance, profileFragmentProvider.get());
      return instance;
    }

    private ProfileFragment injectProfileFragment(ProfileFragment instance) {
      ProfileFragment_MembersInjector.injectViewModel(instance, profileViewModelProvider.get());
      return instance;
    }

    private static final class ProvideApplicationProvider implements Provider<Application> {
      private final CoreComponent coreComponent;

      ProvideApplicationProvider(CoreComponent coreComponent) {
        this.coreComponent = coreComponent;
      }

      @Override
      public Application get() {
        return Preconditions.checkNotNullFromComponent(coreComponent.provideApplication());
      }
    }

    private static final class ProvideRetrofitProvider implements Provider<Retrofit> {
      private final CoreComponent coreComponent;

      ProvideRetrofitProvider(CoreComponent coreComponent) {
        this.coreComponent = coreComponent;
      }

      @Override
      public Retrofit get() {
        return Preconditions.checkNotNullFromComponent(coreComponent.provideRetrofit());
      }
    }
  }
}
