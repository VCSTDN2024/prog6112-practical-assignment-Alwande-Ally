# TV Series Manager - 2025

## Overview
**TV Series Manager** is a console-based Java application designed to manage TV series information efficiently.  
It allows users to perform CRUD operations (Create, Read, Update, Delete) and generate series reports.  

This project demonstrates Java concepts including:

- Classes and objects  
- Encapsulation and data hiding  
- Arrays and ArrayLists  
- Loops and conditional statements  
- Methods and constructors  
- Unit testing with JUnit 5  

---

## Features

1. **Capture a New Series**  
   - Enter series ID, name, age restriction, and number of episodes.  
   - Adds the series to the in-memory database.

2. **Search for a Series**  
   - Search by series ID.  
   - Displays series details if found, or an informative message if not.

3. **Update Series Information**  
   - Update name, age restriction, and number of episodes for a specific series.  

4. **Delete a Series**  
   - Remove a series from memory using its series ID.  
   - Provides feedback if the series is not found.

5. **Generate Series Report**  
   - Display a formatted list of all series currently stored in memory.  

6. **Unit Tests**  
   - `SeriesModelTest.java` ensures all functionalities work as intended.  
   - Tests cover searching, updating, deleting, and age restriction validation.

---

## Requirements

- Java JDK 15 or higher  
- NetBeans IDE (recommended)  
- JUnit 5 for unit testing  

---

## Project Structure

TVSeriesManager/
├─ build/
├─ dist/
├─ nbproject/
├─ src/
│  └─ tvseriesmanager/
│     ├─ MainApp.java
│     ├─ Series.java
│     └─ SeriesModel.java
├─ test/
│  └─ tvseriesmanager/
│     └─ SeriesModelTest.java
├─ README.md
├─ build.xml
└─ manifest.mf


---

## Usage Instructions

1. **Run the application**  
   - Open `MainApp.java` and run the project in NetBeans.  
   - Alternatively, use `F6` to run the main project.

2. **Navigate the Menu**  
   - Launch the menu by entering `1`.  
   - Follow the prompts to perform operations (1-6).  

3. **Example Interaction**

LATEST SERIES - 2025
Enter (1) to launch menu or any other key to exit
1

Please select one of the following menu items:
(1) Capture a new series
(2) Search for a series
(3) Update series age restriction
(4) Delete a series
(5) Print series report - 2025
(6) Exit Application
Enter your choice: 1

CAPTURE A NEW SERIES
Enter the series id: 106
Enter the series name: Adventure Time
Enter the series age restriction: 10
Enter the number of episodes for Adventure Time: 15
Series processed successfully!


---

## Author
**Alwande Ally**  
Version: 2025.08.30  

---

## License
This project is for educational purposes. 

