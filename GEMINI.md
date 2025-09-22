# GEMINI.md

## Project Overview

This is a Spring Boot web application that provides a simple REST API for managing students. It uses Java 17, Maven for dependency management, and connects to a MariaDB database. The application follows a layered architecture with controllers, services, and a data access layer.

**Key Technologies:**

*   Java 17
*   Spring Boot
*   Maven
*   MariaDB

## Building and Running

To build and run the project, you can use the following Maven command:

```bash
./mvnw spring-boot:run
```

This will start the application on the default port (usually 8080).

**API Endpoints:**

*   `GET /hello`: Returns a simple "Hello, World!" message.
*   `GET /api/students`: Returns a list of all students from the database.

## Development Conventions

*   The project uses Lombok to reduce boilerplate code.
*   The code is organized into packages for controllers, services, and models.
*   Database connection details are stored in the `application.properties` file.
