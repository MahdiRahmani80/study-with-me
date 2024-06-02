plugins {
    `android-library`
    `kotlin-android`
}

apply<AndroidCommonPlugin>()

android {
    namespace = "ir.m3.rahmani.home_datastore"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)

    dagger()
    room()
}