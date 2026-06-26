CRUD Operation and Validation using Spring Boot REST API
Project Overview

This project demonstrates the implementation of a RESTful CRUD API using Spring Boot. It provides complete Create, Read, Update, and Delete operations for managing user information. The application uses MySQL as the database and validates user input before storing data.

The APIs were tested using Postman, ensuring proper request handling and response generation.

Features

✔ Create User

✔ Get All Users

✔ Get User By ID

✔ Update User

✔ Delete User

✔ Input Validation

✔ Exception Handling

✔ MySQL Database Integration

✔ RESTful API Design

✔ Tested using Postman

Technologies Used
Java 17
Spring Boot
Spring Web
Spring Data JPA
Hibernate
MySQL
Maven
Postman
Lombok
Bean Validation (Jakarta Validation)
Eclipse / IntelliJ IDEA
Project Structure
src
│
├── controller
├── service
├── repository
├── entity
├── exception
├── dto (if used)
└── application.properties
API Endpoints
Method	Endpoint	Description
POST	/users	Create User
GET	/users	Get All Users
GET	/users/{id}	Get User By ID
PUT	/users/{id}	Update User
DELETE	/users/{id}	Delete User
Validation

The project validates user input before saving data.

Example validations:

Name cannot be empty
Email must be valid
Age should be greater than 18
Required fields cannot be null
Exception Handling

Custom exception handling is implemented using:

Global Exception Handler
User Not Found Exception
Validation Exception

This ensures meaningful error responses.

Database

Database: MySQL

User information is stored permanently using Spring Data JPA and Hibernate.

Testing

All REST APIs were tested using Postman.

The following operations were verified:

POST Request
GET Request
PUT Request
DELETE Request
Validation Errors
Future Improvements
Spring Security with JWT
Swagger/OpenAPI Documentation
Docker Containerization
Unit Testing (JUnit)
Pagination & Sorting
Authentication & Authorization
Learning Outcomes

Through this project, I learned:

REST API development
Spring Boot Architecture
CRUD Operations
MySQL Integration
Bean Validation
Exception Handling
Spring Data JPA
API Testing using Postman
3. Technologies Used (For GitHub & Resume)
Java
Spring Boot
Spring Web
Spring Data JPA
Hibernate ORM
MySQL
Maven
Lombok
Jakarta Bean Validation
Postman
REST API
Git
GitHub
4. What You Performed (GitHub Description)
Project Implementation
Developed a RESTful CRUD API using Spring Boot.
Implemented Create, Read, Update, and Delete operations.
Connected the application with MySQL using Spring Data JPA.
Added input validation using Bean Validation annotations.
Implemented Global Exception Handling for better API responses.
Tested all APIs using Postman.
Used Maven for dependency management.
Organized the project using layered architecture (Controller, Service, Repository).
Managed the source code using Git and uploaded it to GitHub.
