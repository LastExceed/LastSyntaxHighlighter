import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.intellij.tasks.PatchPluginXmlTask

plugins {
	id("org.jetbrains.intellij") version "0.4.18"
	kotlin("jvm") version "1.3.71"
}

group = "com.github.lastexceed"
version = "2.9.0"

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
	//version = "2020.2"
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
tasks.getByName<PatchPluginXmlTask>("patchPluginXml") {
	changeNotes("""Reimplemented in Kotlin""")
}