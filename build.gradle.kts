import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript{
    repositories {
        google()
        mavenCentral()
    }

    dependencies {

        classpath(libs.kotlin.gradle.plugin)
    }
}