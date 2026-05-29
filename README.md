# 🎓 Student Database Management System

A simple **Java + MySQL JDBC** console application to manage student records using CRUD operations.

---

## 📌 Project Overview

The **Student Database Management System** is a Java console-based application that connects with a MySQL database using JDBC.

This project allows users to:

- Add student records
- View all students
- Search students by ID
- Update student marks
- Delete student records
- View only student names
- Display students above specific marks
- Count total students
- Sort students by marks

This project demonstrates the implementation of:

- Java JDBC Connectivity
- MySQL Database Operations
- CRUD Operations
- SQL Queries
- PreparedStatement
- ResultSet Handling

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| JDBC | Database Connectivity |
| MySQL | Database Management |
| SQL | Database Queries |
| IntelliJ IDEA  | IDE |

---

## 📂 Project Structure

```text
StudentDatabaseProject/
│
├── src/
│   └── com/
│       └── StudentDataBase/
│           ├── StudentDatabase.java
│           └── ModifyDatabase.java
│
└── README.md
```

---

## 🗄️ Database Setup

### Create Database

```sql
CREATE DATABASE studentdb;
USE studentdb;
```

### Create Table

```sql
CREATE TABLE students(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    mark DECIMAL NOT NULL,
    CONSTRAINT pk_students PRIMARY KEY(id)
);
```

---

## 🔌 JDBC Connection

```java
con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "Root@123"
);
```

---

## 🚀 Features

| Menu Option | Description |
|---|---|
| 1 | Add Student |
| 2 | View All Students |
| 3 | Search Student By ID |
| 4 | Update Student Mark |
| 5 | Delete Student |
| 6 | View Only Names |
| 7 | View Students Above Mark |
| 8 | Count Total Students |
| 9 | Sort Students By Marks |
| 10 | Exit Application |

---

## 📋 Sample Console Output

```text
---STUDENT DATABASE---

1.Add Student
2.View All Students
3.Search Student By ID
4.Update Student Mark
5.Delete Student
6.View Only Names
7.View Students Above Mark
8.Count Total Students
9.Sort Students By Mark
10.Exit

Enter your choice: 1

Enter student ID:
101

Enter Student Name:
Revanth

Enter Student Age:
20

Enter Student Mark:
89

1 rows inserted successfully
```

---

## 📊 Sample Database Records

| ID | Name | Age | Mark |
|---|---|---|---|
| 101 | Revanth | 20 | 89 |
| 102 | Arun | 21 | 75 |
| 103 | Priya | 19 | 92 |

---

## 💡 Concepts Covered

- JDBC Connectivity
- SQL Queries
- PreparedStatement
- CRUD Operations
- ResultSet
- Exception Handling
- Java Packages
- Console-Based Application

---

