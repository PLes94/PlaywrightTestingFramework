plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    implementation("com.microsoft.playwright:playwright:1.31.0")
}

tasks.test {
    useJUnitPlatform()
}