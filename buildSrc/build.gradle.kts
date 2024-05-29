import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

val agpVersion = "8.4.1"
val kotlinVersion = "1.9.0"

dependencies {
    implementation("com.android.tools.build:gradle:$agpVersion")
    implementation(kotlin("gradle-plugin", kotlinVersion))
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions{
    jvmTarget = "18"
}

