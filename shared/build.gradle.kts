import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    kotlin("plugin.serialization") version "1.8.0"
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "KmpUIComponents"
            isStatic = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(compose.material3)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
            implementation(libs.androidx.activity.compose)
        }

        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(compose.material3)
        }

        iosMain.dependencies {
        }
    }
}

android {
    namespace = "com.kmp.ui.shared.components"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
dependencies {
    debugImplementation(libs.androidx.ui.tooling)
}

tasks.register("assembleDebugXCFramework") {
    dependsOn(
        "linkDebugFrameworkIosX64",
        "linkDebugFrameworkIosArm64",
        "linkDebugFrameworkIosSimulatorArm64"
    )
}

tasks.register<Exec>("createUnifiedXCFramework") {
    dependsOn("assembleDebugXCFramework")
    val baseName = "KmpUIComponents"
    val outputDir = file("$buildDir/XCFrameworks")

    doFirst {
        if (outputDir.exists()) {
            outputDir.deleteRecursively()
        }
        outputDir.mkdirs()
    }

    commandLine(
        "xcodebuild", "-create-xcframework",
        //"-framework", "$buildDir/bin/iosX64/debugFramework/$baseName.framework",
        "-framework", "$buildDir/bin/iosArm64/debugFramework/$baseName.framework",
        "-framework", "$buildDir/bin/iosSimulatorArm64/debugFramework/$baseName.framework",
        "-output", "$outputDir/$baseName.xcframework"
    )
}
