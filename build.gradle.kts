// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        google {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven("https://maven.aliyun.com/repository/public")
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.AGP}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KGP}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories{
        google {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven("https://maven.aliyun.com/repository/public")
        mavenCentral()
    }
}



task<Delete>("clean") {
    delete(rootProject.buildDir)
}