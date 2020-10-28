import java.io.File

object Libs {
    object Gradle {
        private const val version = "4.0.2"
        const val androidPlugin = "com.android.tools.build:gradle:$version"
    }

    object Kotlin {
        private const val version = "1.4.10"

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"

        object Coroutine { // https://github.com/Kotlin/kotlinx.coroutines
            private const val versionCoroutines = "1.4.0"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$versionCoroutines"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$versionCoroutines"
        }
    }

    object Koin { //https://github.com/InsertKoinIO/koin
        private const val version = "2.2.0-rc-3"
        const val gradlePlugin = "org.koin:koin-gradle-plugin:$version"
        const val core = "org.koin:koin-core:$version"
        const val coreExt = "org.koin:koin-core-ext:$version"
        const val test = "org.koin:koin-test:$version"

        const val android = "org.koin:koin-android:$version"
        const val androidScope = "org.koin:koin-android-scope:$version"
        const val androidViewModel = "org.koin:koin-android-viewmodel:$version"
        const val androidExt = "org.koin:koin-android-ext:$version"

        object X {
            const val androidScope = "org.koin:koin-androidx-scope:$version"
            const val androidViewModel = "org.koin:koin-androidx-viewmodel:$version"
            const val androidFragment = "org.koin:koin-androidx-fragment:$version"
            const val androidWorkManager = "org.koin:koin-androidx-workmanager:$version"
            const val androidCompose = "org.koin:koin-androidx-compose:$version"
            const val androidExt = "org.koin:koin-androidx-ext:$version"
        }
    }

    object Retrofit { // https://square.github.io/retrofit/
        const val version = "2.9.0"
        override fun toString() = "com.squareup.retrofit2:retrofit:$version"
        const val converterScalars = "com.squareup.retrofit2:converter-scalars:$version"
    }

    object Okhttp3 { //https://github.com/square/okhttp
        private const val version = "4.9.0"
        override fun toString() = "com.squareup.okhttp3:okhttp:$version"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$version"
        const val logging = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Moshi {
        private const val version = "1.9.3"
        override fun toString() = "com.squareup.moshi:moshi:$version"
        const val kt = "com.squareup.moshi:moshi-kotlin:$version"
        const val adapter = "com.squareup.moshi:moshi-adapters:$version"
        const val converter = "com.squareup.retrofit2:converter-moshi:${Retrofit.version}"
    }

    object Gson {
        override fun toString() = "com.google.code.gson:gson:2.8.6"
        const val converter = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object Androidx { // https://developer.android.com/jetpack/androidx/explorer
        object Compose { // https://developer.android.com/jetpack/androidx/releases/compose
            private const val version = "1.0.0-alpha01"
            const val ui = "androidx.compose.ui:ui:$version"
            const val tooling = "androidx.ui:ui-tooling:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsCore = "androidx.compose.material:material-icons-core:$version"
            const val materialIconsExtended =
                "androidx.compose.material:material-icons-extended:$version"
            const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:$version"
            const val runtimeRx = "androidx.compose.runtime:runtime-rxjava2:$version"
            const val uiTest = "androidx.ui:ui-test:$version"
        }

        object Lifecycle { // https://developer.android.com/jetpack/androidx/releases/lifecycle
            private const val lifecycleVersion = "2.2.0"
            private const val archVersion = "2.1.0"
            const val lifecycleViewModel =
                "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
            const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
            const val viewmodelSavedstate =
                "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
            const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
            const val service = "androidx.lifecycle:lifecycle-service:$lifecycleVersion"
            const val process = "androidx.lifecycle:lifecycle-process:$lifecycleVersion"
            const val reactivestreamsKtx =
                "androidx.lifecycle:lifecycle-reactivestreams-ktx:$lifecycleVersion"
            const val testing = "androidx.arch.core:core-testing:$archVersion"
        }

        object Activity { // https://developer.android.com/jetpack/androidx/releases/activity
            private const val version = "1.1.0"
            override fun toString() = "androidx.activity:activity:$version"
            const val ktx = "androidx.activity:activity-ktx:$version"
        }

        object Appcompat { // https://developer.android.com/jetpack/androidx/releases/activity
            private const val version = "1.2.0"
            override fun toString() = "androidx.appcompat:appcompat:$version"
            const val resources = "androidx.appcompat:appcompat-resources:$version"
        }

        object CameraX { // https://developer.android.com/jetpack/androidx/releases/camera
            private const val version = "1.0.0-beta10"
            private const val version2 = "1.0.0-alpha17"
            const val core = "androidx.camera:camera-core:$version"
            const val camera2 = "androidx.camera:camera-camera2:$version"
            const val lifecycle = "androidx.camera:camera-lifecycle:$version"
            const val view = "androidx.camera:camera-view:$version2"
            const val extensions = "androidx.camera:camera-extensions:$version2"
        }

        object Cardview { //https://developer.android.com/jetpack/androidx/releases/cardview
            private const val version = "1.0.0"
            override fun toString() = "androidx.cardview:cardview:$version"
        }

        object Constraintlayout { //https://developer.android.com/jetpack/androidx/releases/constraintlayout
            private const val version = "2.0.0"
            override fun toString() = "androidx.constraintlayout:constraintlayout:$version"
        }

        object Coordinatorlayout { //https://developer.android.com/jetpack/androidx/releases/coordinatorlayout
            private const val version = "1.1.0"
            override fun toString() = "androidx.coordinatorlayout:coordinatorlayout:$version"
        }

        object Core { //https://developer.android.com/jetpack/androidx/releases/core
            private const val version = "1.3.2"
            override fun toString() = "androidx.core:core:$version"
            const val ktx = "androidx.core:core-ktx:$version"
            const val RoleManagerCompat = "androidx.core:core-role:1.0.0-rc01"
            const val Animator = "androidx.core:core-animation:1.0.0-alpha02"
            const val testAnimator = "androidx.core:core-animation-testing:1.0.0-alpha02"
        }

        object Customview { //https://developer.android.com/jetpack/androidx/releases/customview
            private const val version = "1.1.0"
            override fun toString() = "androidx.customview:customview:$version"
        }

        object Fragment { //https://developer.android.com/jetpack/androidx/releases/fragment
            private const val version = "1.2.5"
            override fun toString() = "androidx.fragment:fragment:$version"
            const val ktx = "androidx.fragment:fragment-ktx:$version"
            const val testing = "androidx.fragment:fragment-testing:$version"
        }

        object Navigation { //https://developer.android.com/jetpack/androidx/releases/navigation
            private const val version = "2.3.0"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
            const val testing = "androidx.navigation:navigation-testing:$version"
            const val safeArgsGradlePlugin =
                "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
        }

        object Paging { //https://developer.android.com/jetpack/androidx/releases/paging
            private const val version = "3.0.0-alpha07"
            const val runtime = "androidx.paging:paging-runtime:$version"
            const val common = "androidx.paging:paging-common:$version"
            const val rx = "androidx.paging:paging-rxjava2:$version"
        }

        object Recyclerview { //https://developer.android.com/jetpack/androidx/releases/recyclerview
            private const val version = "1.2.0-alpha06"
            private const val versionSelection = "1.1.0-rc03"
            override fun toString() = "androidx.recyclerview:recyclerview:$version"
            const val selection = "androidx.recyclerview:recyclerview-selection:$versionSelection"
        }

        object Room { //https://developer.android.com/jetpack/androidx/releases/room
            private const val version = "2.2.5"
            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
            const val testing = "androidx.room:room-testing:$version"
            val arguments: (File) -> Map<String, String> = { projectDir ->
                mapOf(
                    "room.schemaLocation" to "$projectDir/schemas",
                    "room.incremental" to "true",
                    "room.expandProjection" to "true"
                )
            }
        }

        object Savedstate { //https://developer.android.com/jetpack/androidx/releases/savedstate
            private const val version = "1.1.0-beta01"
            override fun toString() = "androidx.savedstate:savedstate:$version"
            const val ktx = "androidx.savedstate:savedstate-ktx:$version"
        }

        object Swiperefreshlayout { //https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout
            private const val version = "1.1.0"
            override fun toString() = "androidx.swiperefreshlayout:swiperefreshlayout:$version"
        }

        object ViewPager2 { //https://developer.android.com/jetpack/androidx/releases/viewpager2
            private const val version = "1.0.0"
            override fun toString() = "androidx.viewpager2:viewpager2:$version"
        }

        object WorkManager { //https://developer.android.com/jetpack/androidx/releases/work
            private const val version = "2.4.0"
            const val runtime = "androidx.work:work-runtime:$version"
            const val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
            const val rx = "androidx.work:work-rxjava2:$version"
            const val gcm = "androidx.work:work-gcm:$version"
            const val testing = "androidx.work:work-testing:$version"
        }
    }

    object RxKotlin { // https://github.com/ReactiveX/RxKotlin
        private const val version = "3.0.0"
        override fun toString() = "io.reactivex.rxjava3:rxkotlin:$version"
    }

    object RxJava {
        private const val version = "3.0.0"
        override fun toString() = "io.reactivex.rxjava3:rxjava:$version"
        const val adapter = "com.github.akarnokd:rxjava3-retrofit-adapter:$version"
    }

    object RxAndroid {
        private const val version = "3.0.0"
        override fun toString() = "io.reactivex.rxjava3:rxandroid:$version"
    }

    object Material {
        private const val version = "1.1.0"
        override fun toString() = "com.google.android.material:material:$version"
    }

    object Adapterdelegates4 {
        private const val version = "4.3.0"
        override fun toString() = "com.hannesdorfmann:adapterdelegates4:$version"
    }

    object Coil {
        private const val version = "1.0.0-rc3"
        override fun toString() = "io.coil-kt:coil:$version"
    }
}