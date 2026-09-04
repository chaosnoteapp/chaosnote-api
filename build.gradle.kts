plugins {
    kotlin("jvm") version "2.2.20"
    `maven-publish`
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

group = "com.github.chaosnoteapp"
version = "0.0.2"

repositories {
    mavenLocal()
    google()
    mavenCentral()
}

dependencies {
    implementation(compose.runtime)
    implementation("org.pf4j:pf4j:3.15.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}