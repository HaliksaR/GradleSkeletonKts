import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.impl(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation.toString())

fun DependencyHandler.impl(dependencyNotation: ProjectDependency): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.api(dependencyNotation: Any): Dependency? =
    add("api", dependencyNotation.toString())

fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation.toString())

fun DependencyHandler.testImpl(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation.toString())

fun DependencyHandler.testApi(dependencyNotation: Any): Dependency? =
    add("testApi", dependencyNotation.toString())

fun DependencyHandler.androidTestImpl(dependencyNotation: Any): Dependency? =
    add("androidTestImplementation", dependencyNotation.toString())

fun DependencyHandler.androidTestApi(dependencyNotation: Any): Dependency? =
    add("androidTestApi", dependencyNotation.toString())

fun DependencyHandler.kaptTest(dependencyNotation: Any): Dependency? =
    add("kaptTest", dependencyNotation.toString())

fun DependencyHandler.debugImpl(dependencyNotation: Any): Dependency? =
    add("debugImplementation", dependencyNotation.toString())
