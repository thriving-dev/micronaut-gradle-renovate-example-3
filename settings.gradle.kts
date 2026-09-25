rootProject.name = "micronaut-gradle-renovate-example-3"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            plugin("johnrengelman-shadow", "com.github.johnrengelman.shadow").version("8.1.1")
            plugin("micronaut-application", "io.micronaut.application").version("5.0.2")
            plugin("micronaut-aot", "io.micronaut.aot").version("5.0.2")

            library("junit", "org.junit.jupiter:junit-jupiter:6.1.3")
            library("assertj", "org.assertj:assertj-core:3.27.7")
            library("testcontainers", "org.testcontainers:testcontainers:2.0.5")
            library("testcontainers-junit5", "org.testcontainers:junit-jupiter:1.21.4")

            bundle("testcontainers-junit", listOf("testcontainers", "testcontainers-junit5"))
        }
    }
}
