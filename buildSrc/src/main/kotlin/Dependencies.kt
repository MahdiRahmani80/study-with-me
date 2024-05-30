import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project


fun DependencyHandler.lifecycle() {
    implementation(Dependencies.lifecycleVM)
    implementation(Dependencies.lifecycleLiveData)
}
object Dependencies {
    // versions
    const val dagger_version = "2.51.1"
    const val preferences_dataStore_version = "1.1.1"
    const val lifecycle_version = "2.6.0"
    const val lottieVersion = "5.0.3"

    // dependencies
    const val lottie = "com.airbnb.android:lottie:$lottieVersion"
    const val dagger = "com.google.dagger:dagger:$dagger_version"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:$dagger_version"
    const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    const val preferences_dataStore =
        "androidx.datastore:datastore-preferences:$preferences_dataStore_version"

}

fun DependencyHandler.lottie() {
    implementation(Dependencies.lottie)
}

fun DependencyHandler.sharedDataStore() {
    implementation(Dependencies.preferences_dataStore)
}

fun DependencyHandler.dagger() {
    implementation(Dependencies.dagger)
    kapt(Dependencies.dagger_compiler)
}


fun DependencyHandler.core() {
    implementation(project(":core"))
}

fun DependencyHandler.app() {
    implementation(project(":app"))
}

fun DependencyHandler.homeDatastore() {
    implementation(project(":home-datastore"))
}


