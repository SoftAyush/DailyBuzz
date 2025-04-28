# DailyBuzz

## Overview
**DailyBuzz** is a personal project I’m building as part of my learning journey with Kotlin Multiplatform (KMP). The goal of this project is to explore state-of-the-art KMP development and create a cross-platform mobile application. The app includes native Android and iOS versions, where most of the business logic and infrastructure is shared in a Kotlin Multiplatform module.

The app fetches, caches, and displays top US business news articles from a public news API. It also includes a screen showing the list of news sources used for fetching articles and another screen displaying information about the user’s device.

## Features

- **Native Android & iOS apps**: Both versions of the app share business logic and core features using KMP.
- **News API Integration**: Fetches and displays the latest US business articles in real-time.
- **News Source List**: Displays the list of sources used for fetching articles.
- **Device Information Screen**: Shows details about the device (e.g., model, OS version, etc.).

## Tech Stack

I’ve used a variety of technologies and design patterns to build this app:

### 1. **Clean Architecture**
   - The app follows Clean Architecture to maintain a separation of concerns, making the code more scalable, testable, and maintainable.

### 2. **MVI (Model-View-Intent)**
   - I’ve adopted the MVI pattern for managing the app’s UI state, which ensures that the UI responds predictably to changes in the app’s data.

### 3. **Ktor**
   - Ktor is the HTTP client I’m using to interact with the news API and fetch articles.

### 4. **SQLDelight**
   - To cache data and store news articles offline, I’m using SQLDelight, which is a Kotlin Multiplatform library for working with SQLite databases.

### 5. **Koin**
   - I’ve integrated Koin for dependency injection, which helps to manage dependencies and makes the codebase more modular and testable.

### 6. **Jetpack Compose** (Android)
   - For Android’s UI, I’m using Jetpack Compose, a modern, declarative way to build user interfaces in Android.

### 7. **SwiftUI** (iOS)
   - On the iOS side, I’m using SwiftUI to build the UI with a declarative syntax, making it easy to create responsive interfaces.

## Setup & Installation

### Android

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/DailyBuzz.git
   ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Run the app on an Android device or emulator.

### iOS

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/DailyBuzz.git
   ```

2. Open the project in Xcode.

3. Install dependencies (via CocoaPods or Swift Package Manager).

4. Run the app on an iOS device or simulator.

## Contributing

Since this is a personal learning project, I’m not expecting contributions, but feel free to reach out if you have any suggestions or ideas for improvement!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.



