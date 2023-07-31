
plugins {
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.8.10"
	kotlin("plugin.spring") version "1.8.10"
}

group = "com.example"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17
val jooqVersion = "3.18.2"

repositories {
	mavenCentral()
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("com.github.java-json-tools:json-patch:1.13")
}
