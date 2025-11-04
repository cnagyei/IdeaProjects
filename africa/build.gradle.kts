plugins {
	java
	id("org.springframework.boot") version "3.5.7"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
description = "Africa Oath International Database"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-freemarker")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.fasterxml.jackson.core:jackson-databind:2.20.0")
	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.modelmapper:modelmapper:3.2.5")

	testImplementation("org.springframework.boot:spring-boot-starter-test")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	runtimeOnly("com.mysql:mysql-connector-j")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
