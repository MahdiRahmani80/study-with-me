buildscript{
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

    dependencies {

        classpath(libs.kotlin.gradle.plugin)
    }
}
