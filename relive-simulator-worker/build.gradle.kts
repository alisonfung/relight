val project_version: String by project
val ktor_version: String by project

plugins {
  kotlin("js")
  id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}

group = "xyz.qwewqa.relive.simulator"

version = project_version

repositories {
  maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven") }
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-js"))
  implementation(project(":relive-simulator-core"))
}

kotlin {
  sourceSets.all {
    languageSettings {
      languageVersion = "1.9"
    }
  }
  js(IR) {
    browser {
      distribution {
        directory = File("${project(":relive-simulator-browser").projectDir}/src/main/resources")
      }

      webpackTask { cssSupport { enabled.set(true) } }

      runTask { cssSupport { enabled.set(true) } }

      testTask {
        useKarma {
          useChromeHeadless()
          webpackConfig.cssSupport { enabled.set(true) }
        }
      }
    }
    binaries.executable()
  }
  sourceSets.all { languageSettings { optIn("kotlin.RequiresOptIn") } }
}
