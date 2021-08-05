object Libs {
    val androidx_compose_runtime =
        "androidx.compose.runtime:runtime:${Versions.compose}"
    val androidx_compose_runtime_livedata =
        "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    val androidx_compose_material =
        "androidx.compose.material:material:${Versions.compose}"
    val androidx_compose_foundation =
        "androidx.compose.foundation:foundation:${Versions.compose}"
    val androidx_compose_foundation_layout =
        "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    val androidx_compose_ui_tooling =
        "androidx.compose.ui:ui-tooling:${Versions.compose}"
    val androidx_compose_ui_test_junit4 =
        "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    val androidx_compose_animation =
        "androidx.compose.animation:animation:${Versions.compose}"
    val androidx_compose_lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha03"
    val androidx_compose_activity =
        "androidx.activity:activity-compose:1.3.0-alpha05"
    val androidx_appcompat = "androidx.appcompat:appcompat:1.3.0-beta01"
    val androidx_core = "androidx.core:core-ktx:1.3.1"
    val androidx_viewmodel_lifecycle = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0"

    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val kotlin_android_extensions =
        "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
    val kotlinx_android_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2"
    val kotlinx_coroutines_test = "org.jetbrains.kotlinx:coroutines-test:1.4.2"
}

object Versions {
    const val kotlin = "1.5.10"
    const val KGP = "1.5.10"
    const val ktor = "1.3.2"
    const val AGP = "7.0.0"
    const val HintAGP = "2.37"
    const val compose = "1.0.0"
}