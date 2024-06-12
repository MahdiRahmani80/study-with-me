buildscript{
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

    dependencies {
        classpath (libs.bugsnag.android.gradle.plugin.v810)
        classpath(libs.kotlin.gradle.plugin)
    }
}
