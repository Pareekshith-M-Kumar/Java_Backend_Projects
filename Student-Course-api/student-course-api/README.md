# Student Course REST API

A backend REST API project built using **Spring Boot**, **MySQL**, and **JPA/Hibernate** for managing students, courses, and enrollments.

This project demonstrates backend development concepts such as:

* RESTful APIs
* Entity Relationships
* Database Integration
* DTO Mapping
* Service Layer Architecture
* Repository Pattern
* Validation & Pagination basics

---

# 🚀 Features

## Student APIs

* Create Student
* Get All Students

## Course APIs

* Create Course
* Get All Courses

## Enrollment APIs

* Enroll Student into Course
* Get Courses Enrolled by Student

---

# 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok
* Thunder Client
* Git & GitHub

---

# 📂 Project Structure

```bash
src/main/java
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── StudentCourseApiApplication
```

---

# 🗄️ Database Setup

## Create Database

```sql
CREATE DATABASE course_management;
```

---

# ⚙️ Configure application.properties

Update your MySQL username and password:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/course_management
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ How to Run the Project

## Clone Repository

```bash
git clone https://github.com/Pareekshith-M-Kumar/Java_Backend_Projects.git
```

---

## Navigate to Project

```bash
cd Java_Backend_Projects/Student-Course-api/student-course-api
```

---

## Run Application

Using Maven:

```bash
mvn spring-boot:run
```

OR run:

```bash
StudentCourseApiApplication.java
```

directly from VS Code / IntelliJ.

---

# 📌 API Endpoints

## Students

### Get All Students

```http
GET /students
```

### Create Student

```http
POST /students
```

---

## Courses

### Get All Courses

```http
GET /courses
```

### Create Course

```http
POST /courses
```

---

## Enrollment

### Enroll Student

```http
POST /enroll
```

Sample Request:

```json
{
  "studentId": 1,
  "courseId": 2
}
```

---

### Get Student Courses

```http
GET /enroll/student/{id}/courses
```

---

# 🧠 Learning Outcomes

Through this project, I learned:

* Building REST APIs using Spring Boot
* JPA Entity Relationships
* DTO & Layered Architecture
* MySQL Integration
* Git & GitHub Workflow
* Maven Dependency Management
* Debugging Spring Boot Issues

---

# 🤝 Acknowledgement

This project was built and understood by me as part of my Java Backend learning journey, with development guidance, debugging support, and architecture suggestions assisted by AI tools (ChatGPT/OpenAI).

AI assistance contributed in:

* debugging support
* project structuring guidance
* troubleshooting Maven/Spring Boot issues
* improving development workflow

The implementation, learning, testing, and understanding of the project were completed by me.

---

# 📌 Future Improvements

* Authentication & Authorization (JWT)
* Swagger Documentation
* Unit Testing
* Docker Deployment
* Role-Based Access
* Pagination & Filtering
* Global Exception Handling

---

# 👨‍💻 Author

Pareekshith M Kumar

Java Backend Developer | Spring Boot Learner
