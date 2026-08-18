# Athar (أثر)

Athar is a modern Android application designed for document and folder management. The name "
Athar" (Arabic for "impact" or "trace") reflects the app's goal of helping users leave their mark
through organized notes and documentation.

## Features

- **Document Management**: Create, edit, and organize documents.
- **Folder Organization**: Group related documents into folders for better structure.
- **Rich Editor**: A dedicated editor screen for seamless content creation.
- **Force Update**: Built-in mechanism to ensure users are always on the latest version.
- **Modern UI**: Built entirely with Jetpack Compose for a fluid and responsive experience.
- **Offline Support**: Powered by Room database for local persistence.

## Tech Stack

- **UI**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Architecture**: Clean Architecture (Presentation, Domain, Data)
- **Dependency Injection**: [Koin](https://insert-koin.io/)
- **Database**: [Room](https://developer.android.com/training/data-storage/room)
- **Networking**: [Ktor](https://ktor.io/)
- **Serialization**: [Kotlin Serialization](https://kotlinlang.org/docs/serialization.html)
- **Navigation**: [Compose Navigation](https://developer.android.com/jetpack/compose/navigation)
- **Asynchronous Programming**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)

## Project Structure

The project follows Clean Architecture principles:

- **`data`**: Implements repositories and handles data sources (Room, Ktor).
- **`domain`**: Contains business logic, models, and repository interfaces.
- **`presentation`**: UI components, ViewModels, and navigation logic.
- **`di`**: Dependency injection modules using Koin.
- **`util`**: Helper classes and extension functions.

## Getting Started

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync Gradle and build the project.
4. Run the app on an emulator or physical device (Min SDK: 28).

---

Developed with ❤️ by [Ammar Yasser](https://github.com/AmmarYasserAllaithy).