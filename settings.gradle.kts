rootProject.name = "KMP-App-Template"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        maven {
            name = "kotzilla"
            url = uri("https://repository.kotzilla.io/repository/kotzilla-platform/")
        }
//        mavenLocal()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        maven {
            name = "kotzilla"
            url = uri("https://repository.kotzilla.io/repository/kotzilla-platform/")
        }
//        mavenLocal()
        mavenCentral()
    }
}

include(":composeApp")
