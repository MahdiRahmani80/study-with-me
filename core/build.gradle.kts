plugins {
    `android-library`
    `kotlin-android`
}

apply<AndroidCommonPlugin>()

android {
    namespace = "ir.m3.rahmani.core"
    buildFeatures{ compose = true }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.kotlinCompilerExtensionVersion
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    dagger()
    sharedDataStore()
    retrofit()
    compose()
}