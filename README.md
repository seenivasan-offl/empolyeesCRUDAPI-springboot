# empolyeesCRUDAPI-springboot
springboot 
# Employee Management System with Caching

## Overview
This is a simple Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing employees. It also includes a caching mechanism using **Caffeine** for better performance on GET requests, and a secure endpoint for specific operations like deleting an employee and incrementing the salary.

## Features
- Add a new employee
- Fetch an employee by ID
- Fetch all employees (sorted and paginated)
- Update an employee's details
- Delete an employee
- Increment the salary of all employees by 10% (with multi-threading)
- Add caching for GET API to speed up data retrieval
- Secure endpoints for deleting an employee and incrementing salary
- Unit tests for the functionality

## Technologies Used
- **Spring Boot** (Version 2.5.x or higher, compatible with Java 17)
- **Caffeine Cache** for in-memory caching
- **JUnit 5** for unit tests
- **Spring Security** for secure endpoints
- **Java 17** (for better performance and latest features)

## Prerequisites
Make sure you have the following installed on your system:
- **Java 17** (Use JDK 17)
- **Maven** (or Gradle)
- A compatible IDE (e.g., IntelliJ IDEA, Eclipse)
- A running database (e.g., H2 for development or MySQL/PostgreSQL for production)
