plugins {
    kotlin("jvm") version "1.4.10"
}

group = "me.soo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testApi("org.junit.jupiter:junit-jupiter:5.6.1")
    testApi("org.amshove.kluent:kluent:1.61")
}
