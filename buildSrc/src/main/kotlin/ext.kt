import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun RepositoryHandler.google_cn() {
    google {
        setUrl("https://maven.aliyun.com/repository/google")
    }
}

fun RepositoryHandler.jcenter_cn() {
    @Suppress("JcenterRepositoryObsolete")
    jcenter {
        setUrl("https://maven.aliyun.com/repository/public")
    }
}


fun RepositoryHandler.mavenCentral_cn() {
    mavenCentral {
        setUrl("https://maven.aliyun.com/repository/central")
    }
}

fun RepositoryHandler.gradlePlugin_cn() {
    google {
        setUrl("https://maven.aliyun.com/repository/gradle-plugin")
    }
}

