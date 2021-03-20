import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.intellij.tasks.PatchPluginXmlTask

plugins {
	id("org.jetbrains.intellij") version "0.7.2"
	kotlin("jvm") version "1.4.31"
}

group = "com.github.lastexceed"
version = "3.1.0"

repositories {
	mavenCentral()
}

	// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
	version = "2020.3.3"
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
tasks.getByName<PatchPluginXmlTask>("patchPluginXml") {
	changeNotes("""Reimplemented in Kotlin""")
}