[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/E6_lM4MY)
# 🎬 TV Series Manager - PROG6112 Practical Assignment 2025

![Java](https://img.shields.io/badge/Java-24-blue)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![Tests](https://img.shields.io/badge/Unit%20Tests-Passing-brightgreen)

*Author:* Alwande Ally  
*Version:* 2025.08.30  

---

## 📋 Overview

The *TV Series Manager* is a console-based Java application that allows users to manage TV series information.  
It provides the following functionality:

- Capture new TV series  
- Search for a series  
- Update series details  
- Delete a series  
- Print series reports  

All series are stored in memory using an ArrayList. The project demonstrates *object-oriented concepts, **unit testing, and **good programming practices*.

---

## ⚙ Features

1. *Capture Series* – Add new series with ID, name, age restriction, and number of episodes.  
2. *Search Series* – Find series by ID and display details.  
3. *Update Series* – Update a series’ name, age restriction, or number of episodes.  
4. *Delete Series* – Remove a series by its ID.  
5. *Series Report* – Display a formatted report of all stored series.  
6. *Unit Tests* – All critical functions have passing unit tests, including search, update, delete, and age restriction validation.  

---

## 📚 References
	•	GitHub Classroom: Java project template
	•	Oracle Java Documentation: https://docs.oracle.com/en/java/
	•	JUnit 4 & 5 documentation for unit testing ( JUnit 4 is recommended for best results) 
	•	ChatGPT AI assistant (for guidance and structuring README)

---

## 🚀 Getting Started

### Clone the Repository

git clone https://github.com/YourUsername/prog6112-practical-assignment-Alwande-Ally.git  

### Requirements

- Java JDK 24  
- NetBeans IDE (or any Java IDE)  

### Running the Program

1. Open the project in your IDE.  
2. Compile the project.  
3. Run MainApp.java to launch the console application.  
4. Follow the menu prompts to perform CRUD operations on TV series.  

---

## ✅ Unit Tests

All unit tests are written in *JUnit* and verify that the application works as intended.  

*Tests included:*

- Search Series – Valid ID returns correct series  
- Search Series Not Found – Invalid ID returns correct message  
- Update Series – Updates series attributes correctly  
- Delete Series – Deletes existing series  
- Delete Series Not Found – Handles non-existent series gracefully  
- Series Age Restriction: Valid – Accepts valid age  
- Series Age Restriction: Invalid – Rejects invalid age  

Screenshot of passing unit tests included in report/video. 
The following screenshot shows all unit tests passing:

![Unit Tests Passing](Unit%20Tests%20Screenshot%20.png)

---

## 💡 Usage Example

```text
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
```
---
 ##   🎉Good Practices
 
	•	Proper encapsulation with the Series class
	•	Clear and commented code for maintainability
	•	Input validation and exception handling considered
	•	Separation of concerns: MainApp.java handles UI, SeriesModel.java handles data logic, Series.java defines the model
---
##     ✅Areas of Improvement

	•	Add persistent storage (e.g., file or database) instead of in-memory storage
	•	Implement sorting and filtering options for reports
	•	Enhance UI/UX with a GUI
	•	Add more advanced unit tests for edge cases
---
##  🎥 Submission Notes


	•	Video demonstration (20 minutes) showing program functionality and passing unit tests
	•	All code committed and pushed to GitHub
	•	README contains instructions, overview, and references
