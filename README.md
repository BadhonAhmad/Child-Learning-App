# Child Learning App — JavaFX

> A kid-friendly interactive learning application built with **JavaFX**, designed around Object‑Oriented principles. The app teaches **letters**, **poems**, and includes an engaging **quiz system** and an **interactive dashboard** suitable for young children.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Goals & Target Audience](#goals--target-audience)
3. [Key Features](#key-features)
4. [Architecture & OOP Design](#architecture--oop-design)
5. [Modules and Responsibilities](#modules-and-responsibilities)
6. [UI / UX Flow](#ui--ux-flow)
7. [Data Model & Persistence](#data-model--persistence)
8. [Sample Class Structure (OOP)](#sample-class-structure-oop)
9. [How to Build & Run](#how-to-build--run)
10. [Packaging & Distribution](#packaging--distribution)
11. [Testing](#testing)
12. [Extensibility & Roadmap](#extensibility--roadmap)
13. [Assets & Accessibility](#assets--accessibility)
14. [Contributing](#contributing)
15. [License](#license)

---

## Project Overview

This JavaFX application provides a safe, colorful, and interactive environment where young learners (ages 3–8) can:

* Explore **letters** with audio pronunciations and animations.
* Read and listen to **poems** with highlighted text and optional narrator voices.
* Attempt **quizzes** (visual and audio) that reward correct answers with animations and stars.

The codebase follows OOP best practices (encapsulation, inheritance, polymorphism, single responsibility) to make it maintainable, testable, and easy to extend.

---

## Goals & Target Audience

* Make early literacy fun and interactive.
* Keep interactions simple and forgiving for kids (large buttons, clear feedback).
* Provide an architecture teachers or parents can extend (add new letters, poems, question sets).

---

## Key Features

* **Interactive Dashboard:** Large tiles for Letters, Poems, and Quiz. Progress indicators, profile avatar and a big friendly mascot.
* **Letters Module:** Animated letter cards — each card shows the letter, example words, an object image, and plays audio.
* **Poems Module:** Poems with auto‑scroll, line highlighting, and audio narration with play/pause controls.
* **Quiz Module:** Multiple question types — multiple choice (images/text), audio questions ("which sound is B?"), and drag‑and‑drop matching.
* **Rewards:** Stars, badges, and a simple progress tracker saved per user.
* **Settings & Accessibility:** Volume control, font size large mode, and high‑contrast theme.

---

## Architecture & OOP Design

The app uses a modular MVC (Model–View–Controller) pattern adapted for JavaFX (sometimes called MVVM in JavaFX land). Each major feature is a module with its own model, view (FXML & controllers), and service layer.

High level packages:

```
com.childlearn
├── app                // Main app and bootstrap
├── model              // Domain models (Letter, Poem, Question, UserProgress)
├── view               // FXML, CSS, and small UI helpers
├── controller         // JavaFX controllers for views
├── service            // Business logic (AudioService, QuizService, PersistenceService)
├── util               // Utilities (AudioPlayer, ImageLoader, Validators)
└── assets             // Images, audio, poems, letters data (JSON)
```

Each module uses small, single‑responsibility classes. For example: `LetterCard` handles UI state for a letter; `LetterService` provides letter data and audio playback.

---

## Modules and Responsibilities

### 1. App / Bootstrap

* `MainApp` — JavaFX `Application` implementation. Loads main stage, scene, and initial dashboard.
* Loads user profile and initializes services (audio, persistence).

### 2. Model

* `Letter` — fields: `char symbol`, `String name`, `String exampleWord`, `String imagePath`, `String audioPath`.
* `Poem` — fields: `String title`, `List<String> lines`, `String narrationAudio`.
* `Question` (abstract) — subclasses: `MultipleChoiceQuestion`, `AudioQuestion`, `DragDropQuestion`.
* `UserProgress` — stores stars, badges and per‑module progress.

### 3. Controllers / Views

* `DashboardController` — handles navigation to Letters / Poems / Quiz.
* `LettersController` — shows letter list, detail popup with animation and play audio.
* `PoemsController` — shows poem list and reader view.
* `QuizController` — generates and evaluates quizzes.

### 4. Services

* `AudioService` — play/pause audio, queue audio with simple fade in/out.
* `PersistenceService` — read/write progress to a small embedded DB (SQLite) or local JSON file.
* `QuizService` — create randomized quizzes and score computation.

---

## UI / UX Flow

1. **Launch / Profile Selection**

   * Big friendly avatar selection and a name input (optional). Parent mode for settings.
2. **Dashboard**

   * Large tiles: `Letters`, `Poems`, `Quiz`, `Progress`.
3. **Letters**

   * Gallery of cards. Click/tap a card to open letter detail: animated stroke reveal, example image, and play sound button.
4. **Poems**

   * Select poem, press play to hear narration. Lines highlight as audio plays; user can pause/seek.
5. **Quiz**

   * Choose difficulty and topic (letters/poems/mixed). Each correct answer shows a star animation. After completion, show summary and reward.

---

## Data Model & Persistence

Options for lightweight persistence:

* **Local JSON**: Easy to implement for small datasets (letters, poems). Use `Gson` or `Jackson` to read/write `UserProgress.json`.
* **SQLite** (recommended for progress & multi‑user): Use `org.xerial:sqlite-jdbc` for an embedded DB.

Suggested tables (if using SQLite):

* `users(id, name, avatar)`
* `progress(user_id, module, level, stars, last_played)`
* `badges(id, user_id, badge_name, earned_at)`

Store static content (letters, poems, audio paths) as resource files under `resources/assets` and index them with a small JSON manifest.

---

## Sample Class Structure (OOP)

```java
// model/Letter.java
public class Letter {
    private final char symbol;
    private final String name;
    private final String exampleWord;
    private final String imagePath;
    private final String audioPath;

    public Letter(char symbol, String name, String exampleWord, String imagePath, String audioPath) {
        this.symbol = symbol;
        this.name = name;
        this.exampleWord = exampleWord;
        this.imagePath = imagePath;
        this.audioPath = audioPath;
    }

    // getters only — immutability for models
}

// service/AudioService.java (interface)
public interface AudioService {
    void play(String resourcePath);
    void pause();
    void stop();
}

// service/impl/JavaFXAudioService.java
public class JavaFXAudioService implements AudioService {
    private MediaPlayer player;
    // implement play/pause/stop with Media and MediaPlayer
}
```

Design notes:

* Use dependency injection (manual or via a lightweight DI container) to keep controllers testable.
* Favor immutable models where possible.
* Keep JavaFX specific code inside controllers/services and out of domain models.

---

## How to Build & Run

### Prerequisites

* JDK 11 or newer (JDK 17 recommended)
* JavaFX SDK (or use Maven/Gradle with `org.openjfx:javafx` dependencies)
* (Optional) Gradle or Maven for build automation

### Gradle example (snippet)

`build.gradle` minimal bits:

```gradle
plugins {
    id 'application'
    id 'org.openjfx.javafxplugin' version '0.0.13'
}

repositories { mavenCentral() }

dependencies {
    implementation 'com.google.code.gson:gson:2.10.1'
    implementation 'org.xerial:sqlite-jdbc:3.40.0.0'
}

javafx {
    version = '20'
    modules = [ 'javafx.controls', 'javafx.fxml', 'javafx.media' ]
}

application {
    mainClass = 'com.childlearn.app.MainApp'
}
```

### Run locally

* With Gradle: `./gradlew run`
* Or package a jar and run: `java -jar childlearn.jar` (make sure JavaFX modules are available or use jlink)

---

## Packaging & Distribution

* **Native installer**: Use `jpackage` (available in newer JDKs) to create platform‑specific installers (Windows `.msi`/`.exe`, macOS `.dmg`, Linux `.deb`).
* **Portable Jar**: Bundle dependencies with Gradle `shadowJar` or Maven `assembly` plugin.

---

## Testing

* Unit test services (e.g., `QuizService`) using JUnit 5.
* UI tests (optional) with TestFX for JavaFX UI automation.
* Manual accessibility checks: large text, keyboard navigation, screen reader compatibility for audio controls.

---

## Extensibility & Roadmap

* Add **multilingual support** (audio + text) using resource bundles.
* Add **parent dashboard** with detailed analytics.
* Extend quizzes to include **spelling** and **fill‑in the blank**.
* Add **remote sync** to a cloud backend for cross‑device progress.

---

## Assets & Accessibility

* Keep all audio in `resources/assets/audio/` and images in `resources/assets/img/`.
* Use short, clear audio clips (speak slowly) and provide captions for poems.
* Provide high‑contrast mode and large font toggle for children with visual impairments.

---

## Contributing

1. Fork the repo
2. Create a feature branch `feature/<name>`
3. Follow code style, add tests for new services
4. Submit a pull request with description and screenshots or short GIFs of UI changes

---

## License

This project is released under the **MIT License** — adapt and use it freely for educational purposes.

---

## Contact / Support

If you want sample code files (MainApp.java, one controller + FXML, and a small sample data set of letters and one poem) tell me which files you want and I will include them.

Good luck — make it playful and full of colors! 🎨✨
