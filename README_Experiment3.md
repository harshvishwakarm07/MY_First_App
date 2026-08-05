# Experiment 3: Intents and Data Passing with List Interaction

## Overview
This experiment demonstrates the use of **Explicit Intents** in Android to facilitate communication and data transfer between different activities. It specifically focuses on a common mobile UI pattern: selecting an item from a list and navigating to a detail view with context-aware information.

## Concept & Technology
- **Explicit Intent**: An intent that specifies the exact component (Activity class) to start. It is used for internal app navigation.
- **Intent Extras**: A mechanism to attach key-value pairs (using `Bundle`) to an Intent, allowing data (like strings, integers, or objects) to be passed to the target activity.
- **ListView**: A view group that displays a list of scrollable items.
- **ArrayAdapter**: A bridge between the data source (Array) and the `ListView`, responsible for creating views for each item in the list.

## Scenario
The application starts with `MainActivity`, which displays a list of fruits (Apple, Banana, Orange, etc.). 
1. When a user taps a fruit (e.g., "Apple"), an `Explicit Intent` is created.
2. The name of the selected fruit is added to the intent using `putExtra("FRUIT_NAME", "Apple")`.
3. `DetailActivity` is launched.
4. `DetailActivity` retrieves the data using `getStringExtra("FRUIT_NAME")` and displays the message: *"You clicked on the Apple"*.

## Project Structure (Experiment 3)
```text
app_intent/
├── src/
│   ├── main/
│   │   ├── AndroidManifest.xml # Defines Activities and Launcher
│   │   ├── java/com/example/intent/
│   │   │   ├── MainActivity.kt   # Handles List and Intent creation
│   │   │   └── DetailActivity.kt # Retrieves data and displays message
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_main.xml   # UI for the Fruit List
│   │       │   └── activity_detail.xml # UI for the Detail View
│   │       └── values/
│   │           └── strings.xml         # Student details and app strings
└── build.gradle.kts
```

## Output Screenshot
*Main screen showing the list and student details:*

![Output Screenshot](images/exp3/main_list.png)

## Test Cases

### Test Case 1: List Interaction - Apple
- **Action**: Tap on "Apple" in the list.
- **Expected Result**: Navigates to `DetailActivity` showing "You clicked on the Apple".
- **Screenshot**:
  ![TC1: Apple Click](images/exp3/detail_apple.png)

### Test Case 2: List Interaction - Banana
- **Action**: Tap on "Banana" in the list.
- **Expected Result**: Navigates to `DetailActivity` showing "You clicked on the Banana".
- **Screenshot**:
  ![TC2: Banana Click](images/exp3/detail_banana.png)

### Test Case 3: Proper Data Passing
- **Action**: Tap on "Orange".
- **Expected Result**: The second screen correctly identifies "Orange" via Intent Extras.
- **Screenshot**:
  ![TC3: Orange Click](images/exp3/detail_orange.png)

---
**Developed by:** Harsh VIshwakarma  
**USN:** 25MCAR0203
