[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/E6_lM4MY)
# TVSeriesManager

*Author:* Alwande Ally  
*Student Number:* ST10472171  
*Module:* PROG6112  
*Date:* September 2025  

---

## Project Overview
TVSeriesManager is a Java-based desktop application designed to help users manage a collection of TV series. The application allows users to capture, search, update, delete, and generate reports of series efficiently. This project was developed using Java 15, Ant build system, and JUnit for testing.

---

## Features
- *Capture a new series:* Add new series with title, genre, age restriction, and description.  
- *Search for a series:* Quickly find a series using keywords.  
- *Update series age restriction:* Modify the age rating for an existing series.  
- *Delete a series:* Remove unwanted series from the collection.  
- *Print series report:* Generate a list of all series for review.  
- *Exit application:* Safely close the program.

---

## Technologies Used
- *Java SE 15*  
- *NetBeans IDE*  
- *JUnit 4* for unit testing  
- *Ant Build System*  

---
## Testing
All main functionalities were tested using *JUnit 4*.  
- 7 tests in total  
- All tests passed successfully  
- Tests include series addition, search, update, and deletion  

> *Note:* JUnit 5 caused compatibility issues, so JUnit 4 is recommended for this project.

---
## Project Structure

TVSeriesManager/
│
├─ src/                  # Source code packages
│   └─ tvseriesmanager/  # Main application classes
├─ test/                 # Test packages
│   └─ tvseriesmanager/  # JUnit test classes
├─ build/                # Build artifacts
├─ dist/                 # Distribution jar
├─ nbproject/            # NetBeans project configuration
├─ .gitignore            # Git ignore file
└─ README.md             # Project README
---

## How to Run
1. Open the project in NetBeans.  
2. Build the project using Clean and Build.  
3. Run the TVSeriesManager.jar file from the dist folder.  
4. Follow the console menu to interact with the application.

---

## GitHub Repository
[TVSeriesManager Repository](https://github.com/VCSTDN2024/prog6112-practical-assignment-Alwande-Ally)

---

## Notes
- This project is submitted for educational purposes.  
- Ensure JUnit 4 is used for testing to avoid compatibility issues.  
- The application runs as a console-based program.