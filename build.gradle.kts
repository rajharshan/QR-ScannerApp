plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.qrscannerapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.qrscannerapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Core dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Jetpack Compose dependencies
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    //noinspection UseTomlInstead
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.8")
    implementation(libs.material3)

    // Testing dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v121)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.ui.test.junit4)

    // Debug dependencies
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    // AppCompat and Material (with specific versions)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // QR Code dependencies
    implementation(libs.zxing.android.embedded)
    implementation(libs.junit)
}
