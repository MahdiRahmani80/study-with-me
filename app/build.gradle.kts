plugins {
    id(libs.plugins.android.application.get().pluginId)
    kotlin("kapt")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ir.m3.rahmani.studywithme"
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = ProjectConfig.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }

    buildFeatures {
        viewBinding = true
    }

    buildFeatures { compose = true }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.kotlinCompilerExtensionVersion
    }

    flavorDimensions += "default"
    productFlavors {
        create("googlePlay") {

        }
        create("cofeBazaar") {
            dimension = "default"
        }
        create("myket") {
            dimension = "default"
            val marketApplicationId = "ir.mservices.market"
            val marketBindAddress = "ir.mservices.market.InAppBillingService.BIND"
            manifestPlaceholders.putAll(
                mapOf(
                    "marketApplicationId" to marketApplicationId,
                    "marketBindAddress" to marketBindAddress,
                    "marketPermission" to "$marketApplicationId.BILLING"
                )
            )
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    "myketImplementation"("com.github.myketstore:myket-billing-client:1.7")

    dagger()
    lifecycle()
    retrofit()
    compose()


    // modules
    core()
    homeDatastore()
    userData()

}