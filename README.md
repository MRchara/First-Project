Student & Teacher Management System (Java + MySQL)

A console-based Java application built using **Object-Oriented Programming (OOP)**, **JDBC**, and **MySQL** to perform CRUD operations for Students and Teachers.  
This project demonstrates real-world backend development patterns such as DAO, database handling, and modular Java architecture.

---

## 🚀 Features

### 🔹 Student Module
- Add new student
- View all students
- Update student details
- Delete a student

### 🔹 Teacher Module
- Add new teacher
- View all teachers
- Update teacher details
- Delete a teacher

### 🔹 Additional Features
- JDBC-based MySQL connection
- DAO Pattern for clean database operations
- Reusable DBConnection utility class
- Encapsulated Model classes (POJOs)
- Error handling and validations

---

## 🏗️ Project Architecturesrc/main/java/org/example/

├── DAO/
│ ├── StudentDAO.java
│ └── AssignmentDAO.java
│
├── Model/
│ ├── students.java
│ └── assignments.java
│
├── Util/
│ └── DBConnection.java
│
└── Main.java


**Explanation:**
- **DAO Layer** → Handles all SQL operations  
- **Model Layer** → Represents Student & Teacher objects  
- **Util Package** → Database connection utility  
- **Main Class** → Runs the program  

---

## 🛠️ Technologies Used
- **Java**
- **OOP (Encapsulation, Classes, Objects)**
- **JDBC**
- **MySQL**
- **DAO Design Pattern**

---

## 🗄️ Database Setup

Create a database in MySQL:

```sql
CREATE DATABASE student_db;


Create required tables (students & teachers):

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);

CREATE TABLE teachers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    subject VARCHAR(100),
    experience INT
);




