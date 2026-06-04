#  Student Management System

A full-stack web application built with **Spring Boot**, **Thymeleaf**, and **MySQL** that allows you to add, view, and delete student records through a clean, responsive UI.

![Student Management System](https://img.shields.io/badge/Spring%20Boot-3.5.14-brightgreen) ![Java](https://img.shields.io/badge/Java-17-orange) ![MySQL](https://img.shields.io/badge/MySQL-Database-blue) ![Maven](https://img.shields.io/badge/Build-Maven-red)

---
## Live Demo
Frontend - https://munjasangeetha51.github.io/Student-Management-System/

Backend - http://localhost:8081/api/students

## Screenshots

Frontend
<img width="1046" height="993" alt="Screenshot (1344)" src="https://github.com/user-attachments/assets/16f16607-3820-40af-a9cd-62825e6e5428" />

Backend 
<img width="1916" height="1022" alt="Screenshot (1350)" src="https://github.com/user-attachments/assets/79ced010-b940-4c53-ae4e-c4b0c9b17e02" />

##  Preview

> A student dashboard showing live records with stats — total students, average marks, and top score.

| Field | Details |
|-------|---------|
| Students | 4 |
| Average Marks | 88 |
| Top Score | 95 |

---

##  Features

-  Add new student records (Name, Email, Course, Marks)
-  View all students in a tabular format
-  Delete student records
-  Live statistics — Total Students, Average Marks, Top Score
-  Server-side rendered UI with Thymeleaf

---

##  Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Spring Boot 3.5.14 |
| Frontend | Thymeleaf, HTML, CSS |
| Database | MySQL |
| ORM | Spring Data JPA (Hibernate) |
| Build Tool | Maven |
| Language | Java 17 |

---

##  Project Structure

```
src/main/java
└── com.example.studentmanagement
    ├── controller
    │   └── StudentController.java
    ├── entity
    │   └── Student.java
    ├── repository
    │   └── StudentRepository.java
    ├── service
    │   ├── StudentService.java
    │   └── StudentServiceImpl.java
    └── StudentManagementApplication.java
```

---

##  Architecture

```
Client Browser
      │
      ▼
StudentController   ← Handles HTTP Requests
      │
      ▼
StudentService      ← Business Logic
      │
      ▼
StudentRepository   ← Database Access (JPA)
      │
      ▼
MySQL Database
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL Server

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

### 2. Configure the Database

Create a MySQL database:

```sql
CREATE DATABASE studentdb;
```

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

### 4. Open in Browser

```
http://localhost:8080/
```

---

##  API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/` | View all students |
| POST | `/save` | Add a new student |
| GET | `/delete/{id}` | Delete a student by ID |

---

##  Student Entity

```java
@Entity
public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private int marks;
}
```

---

##  Sample Data

| ID | Name | Email | Course | Marks |
|----|------|-------|--------|-------|
| 1 | Sangeetha | sangeetha@gmail.com | Java | 95 |
| 11 | Janu | janu@gmail.com | Java Full Stack | 88 |
| 12 | Ram | ram@gmail.com | Data Science | 92 |
| 13 | Sita | sita@gmail.com | Cyber Security | 78 |

---

##  Learning Outcomes

This project covers:

-  Spring Boot MVC Architecture
-  Spring Data JPA & Repository Pattern
-  MySQL Database Integration
-  Thymeleaf Template Engine
-  Service Layer Pattern
-  Layered / Clean Architecture
-  Full Stack Web Development Fundamentals

---

##  Author

**Sangeetha**
CSE(AI&ML) , SR University
- Final year — Spring Boot Project

---

##  License

This project is for educational purposes.
