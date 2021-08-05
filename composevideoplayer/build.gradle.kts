plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 23
        targetSdk = 30
        version = 1

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")

    implementation("androidx.compose.runtime:runtime:${Versions.compose}")
    implementation("androidx.compose.ui:ui:${Versions.compose}")
    implementation("androidx.compose.foundation:foundation-layout:${Versions.compose}")
    implementation("androidx.compose.material:material:${Versions.compose}")
    implementation("androidx.compose.material:material-icons-extended:${Versions.compose}")
    implementation("androidx.compose.foundation:foundation:${Versions.compose}")
    implementation("androidx.compose.animation:animation:${Versions.compose}")
    implementation("androidx.compose.ui:ui-tooling:${Versions.compose}")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.activity:activity-ktx:1.3.0")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1-native-mt")

    implementation("com.google.android.exoplayer:exoplayer:2.13.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}
