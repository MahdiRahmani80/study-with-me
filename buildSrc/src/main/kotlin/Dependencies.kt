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
    const val retrofit_version = "2.9.0"
    const val coroutine_version = "1.5.2"
    const val room_version = "2.6.1"
    const val compose_activity_version = "1.9.0"
    const val compose_version = "1.6.6"
    const val compose_material3_version = "1.2.1"


    // dependencies
    const val kotlinCompilerExtensionVersion = "1.5.14"
    const val compose_ui = "androidx.compose.ui:ui:$compose_version"
    const val compose_material = "androidx.compose.material:material:$compose_version"
    const val compose_material3 = "androidx.compose.material3:material3-android:$compose_material3_version"
    const val compose_preview = "androidx.compose.ui:ui-tooling-preview:$compose_version"
    const val compose_activity = "androidx.activity:activity-ktx:$compose_activity_version"
    const val room_kapt = "androidx.room:room-compiler:$room_version"
    const val room_ktx = "androidx.room:room-ktx:$room_version"
    const val room_test_helper = "androidx.room:room-testing:$room_version"
    const val room_pageing3_iml = "androidx.room:room-paging:$room_version"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version"
    const val collection_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:$retrofit_version"
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofit_version"
    const val lottie = "com.airbnb.android:lottie:$lottieVersion"
    const val dagger = "com.google.dagger:dagger:$dagger_version"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:$dagger_version"
    const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    const val preferences_dataStore =
        "androidx.datastore:datastore-preferences:$preferences_dataStore_version"

}

fun DependencyHandler.compose(){
    implementation(Dependencies.compose_ui)
    implementation(Dependencies.compose_material)
    implementation(Dependencies.compose_material3)
    implementation(Dependencies.compose_preview)
    implementation(Dependencies.compose_activity)
}

fun DependencyHandler.room(){
    kapt(Dependencies.room_kapt)
    implementation(Dependencies.room_ktx)
    testImplementation(Dependencies.room_test_helper)
    implementation(Dependencies.room_pageing3_iml)
}

fun DependencyHandler.retrofit(){
    implementation(Dependencies.coroutine)
    implementation(Dependencies.collection_android)
    implementation(Dependencies.converter_gson)
    implementation(Dependencies.retrofit)
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
fun DependencyHandler.userData() {
    implementation(project(":user-data"))
}


