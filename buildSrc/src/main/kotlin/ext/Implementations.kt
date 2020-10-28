import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.modules(vararg module: String) {
    module.forEach { impl(project(it)) }
}

fun DependencyHandler.modules(vararg module: Any) {
    module.forEach { impl(project(it.toString())) }
}

fun DependencyHandler.sharedModules(vararg module: Any) {
    module.forEach { impl(project(it.toString())) }
}

fun DependencyHandler.sharedModules(vararg module: String) {
    module.forEach { impl(project(it)) }
}

fun DependencyHandler.coreModules(vararg module: Any) {
    module.forEach { impl(project(it.toString())) }
}

fun DependencyHandler.coreModules(vararg module: String) {
    module.forEach { impl(project(it)) }
}