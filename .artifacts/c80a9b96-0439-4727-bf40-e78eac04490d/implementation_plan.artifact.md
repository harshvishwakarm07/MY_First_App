# Implementation Plan - Fix Gradle Sync Error

The project is experiencing a Gradle sync error: `Cannot add extension with name 'kotlin', as there is an extension already registered with that name`. This error indicates a conflict in how the Kotlin plugin is being applied, likely a double-application or a version mismatch.

## User Review Required

> [!IMPORTANT]
> The project uses a very unusual Android Gradle Plugin (AGP) version `9.3.1` and `compileSdk` version `release(36)`. Stable versions are currently in the `8.x` range. I will attempt to fix the plugin configuration first, but if the issue persists, a downgrade to stable AGP/Kotlin versions may be necessary.

## Proposed Changes

### 1. Version Catalog (`gradle/libs.versions.toml`)
- Ensure Kotlin and AGP versions are defined clearly.
- I will keep the current versions (`agp = "9.3.1"`, `kotlin = "1.9.24"`) but ensure they are correctly referenced.

### 2. Root `build.gradle.kts`
- Ensure both plugins are declared with `apply false` to manage versions centrally.

### 3. Module `build.gradle.kts` (`app` and `app_lifecycle`)
- [MODIFY] [app/build.gradle.kts](file:///C:/Users/Dell/AndroidStudioProjects/MYAPP_1/app/build.gradle.kts)
- [MODIFY] [app_lifecycle/build.gradle.kts](file:///C:/Users/Dell/AndroidStudioProjects/MYAPP_1/app_lifecycle/build.gradle.kts)
- I will explicitly apply the `kotlin-android` plugin in both modules. If the "already registered" error occurs, it means the `android-application` plugin might be applying it automatically, in which case we should NOT apply it explicitly. However, standard practice is to apply both.

## Verification Plan

### Automated Tests
- Run `gradle_sync` to verify the project configuration is valid.
- Run `./gradlew :app:assembleDebug` to ensure the project builds correctly.

### Manual Verification
- Verify that the "Sync" successfully completes in Android Studio without the "Cannot add extension" error.
