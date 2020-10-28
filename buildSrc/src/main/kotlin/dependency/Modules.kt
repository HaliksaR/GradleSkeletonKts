object Modules {
    object App {
        override fun toString() = ":app"
    }

    object Features {
        override fun toString() = ":features"

        object Feature1 {
            override fun toString() = "$Features:feature1"
            val domain = "$Feature1:domain"
        }
    }

    object Libraries {
        override fun toString() = ":libraries"

        object Core {
            override fun toString() = "$Libraries:core"
        }
    }

    object Shared {
        override fun toString() = ":shared"

        object Shared1 {
            override fun toString() = "$Shared:shared1"
        }
    }
}