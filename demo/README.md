# Hibernate Car Management Project

##  Overview

This project demonstrates how to use **Hibernate ORM** with a **MySQL database** to perform basic database operations using Java objects instead of SQL queries.

---

## Concepts I Covered

* Hibernate Configuration (`hibernate.cfg.xml`)
* ORM (Object Relational Mapping)
* Entity Mapping using annotations
* Session & SessionFactory
* Transactions
* Insert operation using `persist()`

---

## Database Setup

```sql
USE car_db;

CREATE TABLE car (
    id INT PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(50),
    model VARCHAR(50),
    price DOUBLE
);

INSERT INTO car (brand, model, price) VALUES
('Toyota', 'Camry', 30000),
('Honda', 'Civic', 25000),
('Tesla', 'Model 3', 50000);
```

---

## Technologies Used

* Java
* Hibernate (ORM)
* MySQL
* Maven

---

## Project Structure

```
src/
 └── main/
     ├── java/com/example/
     │     ├── App.java
     │     └── Car.java
     └── resources/
           └── hibernate.cfg.xml
```

---

## Key Files

### 1. Car.java (Entity Class)

* Represents `car` table
* Uses annotations like `@Entity`, `@Table`, `@Id`

---

### 2. hibernate.cfg.xml

* Contains DB connection details
* Configures Hibernate properties
* Maps entity class

---

### 3. App.java

* Creates SessionFactory
* Opens session
* Starts transaction
* Inserts data using `persist()`
* Commits transaction

---

## Hibernate Workflow

```
Java Object → Hibernate → SQL → MySQL → Result
```

---

## How to Run

```bash
mvn compile
mvn exec:java "-Dexec.mainClass=com.example.App"
```

---

## Output

```
Inserted!
Hibernate: insert into car ...
```

---

## Key Learnings

* Hibernate eliminates manual SQL
* Java objects map directly to database tables
* Transactions ensure data consistency
* Session manages DB communication

---

## Author

Learning Java Backend with Hibernate 🚀
