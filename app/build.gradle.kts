plugins {
	id(Plugins.application)
	id(Plugins.Kotlin.android)
	id(Plugins.Kotlin.androidExtensions)
	id(Plugins.Kotlin.kapt)
}

dependencies {
	impl(Libs.Material)
}