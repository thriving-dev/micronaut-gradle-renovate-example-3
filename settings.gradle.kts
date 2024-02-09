rootProject.name = "micronaut-gradle-renovate-example-3"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            plugin("johnrengelman-shadow", "com.github.johnrengelman.shadow").version("8.1.1")
            plugin("micronaut-application", "io.micronaut.application").version("4.3.2")
            plugin("micronaut-aot", "io.micronaut.aot").version("4.3.2")

            library("junit", "org.junit.jupiter:junit-jupiter:5.10.2")
            library("assertj", "org.assertj:assertj-core:3.25.3")
            library("testcontainers", "org.testcontainers:testcontainers:1.19.5")
            library("testcontainers-junit5", "org.testcontainers:junit-jupiter:1.19.5")

            bundle("testcontainers-junit", listOf("testcontainers", "testcontainers-junit5"))
        }
    }
}
