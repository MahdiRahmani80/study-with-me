package ir.m3.rahmani.studywithme.home.stats;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class StatsFragment_Factory implements Factory<StatsFragment> {
  @Override
  public StatsFragment get() {
    return newInstance();
  }

  public static StatsFragment_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StatsFragment newInstance() {
    return new StatsFragment();
  }

  private static final class InstanceHolder {
    private static final StatsFragment_Factory INSTANCE = new StatsFragment_Factory();
  }
}
