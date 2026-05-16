# Suraksha Setu

Suraksha Setu is an Android safety companion app built with Kotlin and Jetpack Compose. The project focuses on quick access to emergency contacts, safety alert actions, and simple safety guidance for users who need help fast.

## Problem Statement

In urgent situations, users need emergency numbers and trusted-contact actions to be easy to find. Suraksha Setu provides a clean mobile interface for safety support and can be extended with location sharing, contact management, and alert delivery features.

## Features

- Safety dashboard with a clear emergency alert section.
- Quick access cards for police, ambulance, and women helpline numbers.
- Safety checklist for basic preparedness.
- Jetpack Compose UI using Material 3 components.
- Android project structure ready for future feature expansion.

## Tech Stack

- Kotlin
- Android Jetpack Compose
- Material 3
- Gradle Kotlin DSL
- Android SDK 36

## App Module

- Package: `com.example.myapplication`
- Minimum SDK: 24
- Target SDK: 36
- Version: 1.0

## Project Structure

```text
app/
  src/main/
    java/com/example/myapplication/
    res/
gradle/
build.gradle.kts
settings.gradle.kts
```

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/Vardhanreddy8/Suraksha-Setu.git
```

2. Open the project in Android Studio.
3. Let Android Studio sync the Gradle files.
4. Run the app on an emulator or a connected Android device.

## Run from Android Studio

1. Open Android Studio.
2. Select **Open** and choose this project folder.
3. Wait for Gradle sync to complete.
4. Select an emulator or connected device.
5. Click **Run**.

## Build

From the project root, run:

```bash
./gradlew build
```

On Windows, run:

```powershell
.\gradlew.bat build
```

## Screenshots

Screenshots can be added after running the app on an emulator or Android device.

## Future Improvements

- Add trusted contact management.
- Add live location sharing.
- Add SMS/call intent integration for emergency actions.
- Store user safety preferences locally.
- Add screenshots and demo video after UI testing.

## Notes

- `local.properties` is intentionally ignored because it contains machine-specific Android SDK paths.
- Build outputs and Gradle cache files are not committed.
- The repository should remain public until project evaluation is complete.
