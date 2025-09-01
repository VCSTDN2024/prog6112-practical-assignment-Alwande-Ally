# TVSeriesManager

**Author:** Alwande Ally  
**Student Number:** ST10472171  
**Version:** 2025.08.30  

---

## Project Overview

**TVSeriesManager** is a Java console application that allows users to manage TV series data. Users can capture, search, update, and delete series records. The program also validates age restrictions for series and generates a series report.

This project was developed as part of coursework for educational purposes.

---

## Features

1. **Capture a New Series** – Add a new series with ID, name, age restriction, and number of episodes.  
2. **Search for a Series** – Look up series by their unique ID.  
3. **Update Series Age Restriction** – Modify the age restriction for a specific series.  
4. **Delete a Series** – Remove a series from the system.  
5. **Print Series Report** – Display all series currently stored in the application.  
6. **Exit Application** – Quit the program safely.

---

## Technologies Used

- Java SE (Java Platform, Standard Edition)  
- NetBeans IDE  
- JUnit (Unit Testing Framework)  
  - All tests successfully executed using **JUnit 4** for simplicity. JUnit 5 can also be used but may require additional configuration in NetBeans.  
- Git & GitHub for version control

---

## Installation & Running

1. Clone the repository:  
   ```bash
   git clone https://github.com/VCSTDN2024/prog6112-practical-assignment-Alwande-Ally.git
2.Open the project in NetBeans.
3.Ensure the necessary JUnit libraries are added to your project (JUnit 4 recommended for easy testing).
4.Build the project:
Clean and Build Project in NetBeans.
5.Run the program from NetBeans or via command line:
java -jar dist/TVSeriesManager.jar
6.Follow the on-screen menu to use the application.


---
##Unit Testing

All functionalities have been tested with JUnit 4.

Tests cover:

Searching series

Updating series

Deleting series

Validating age restrictions

Note: If you experience setup issues with JUnit 5 in NetBeans, it is recommended to run the tests using JUnit 4, which is easier to configure and fully supported.

---
##Project Structure

TVSeriesManager/
├── source Packages/
│   └── tvseriesmanager/
│       ├── MainApp.java
│       ├── Series.java
│       └── SeriesModel.java
├──  Test Packages/
│   └── tvseriesmanager/
│       └── SeriesModelTestUpdated.java
├── dist/
│   └── TVSeriesManager.jar
├── README.md
└── .gitignore

---
##.gitignore

The following files and folders are ignored in Git to prevent unnecessary clutter:
/build/
/dist/
/nbproject/private/
/*.class
*.jar
*.log
*.cache

---
##Notes

This project is for educational purposes only.

All data is stored in memory; no database is used.

Tested successfully using JUnit 4.