rootProject.name = "design-patterns-test-ground"

pluginManagement {
    val kotlinVersion: String by settings

    repositories {
        mavenCentral()
    }

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}
