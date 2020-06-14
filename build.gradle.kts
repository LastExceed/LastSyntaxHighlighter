import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.intellij.tasks.PatchPluginXmlTask

plugins {
	id("org.jetbrains.intellij") version "0.4.21"
	kotlin("jvm") version "1.4-M2"
}

group = "com.github.lastexceed"
version = "3.0.2rb"

repositories {
	mavenCentral()
	maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
	version = "2020.1"
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
tasks.getByName<PatchPluginXmlTask>("patchPluginXml") {
	changeNotes("""Reimplemented in Kotlin""")
}