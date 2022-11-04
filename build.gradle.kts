import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    implementation("junit:junit:4.13.1")
    implementation("junit:junit:4.13.1")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.testng:testng:7.1.0")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.7")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform()
}
