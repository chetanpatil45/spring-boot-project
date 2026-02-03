<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/0f8c02a9-14f9-41b5-8e9f-6f3826a2d99a" />

# Demo Spring Boot Application

This is a **Spring Boot** demo application following a layered architecture (Controller → Service → Repository) with **Thymeleaf** for server-side rendering and **CSS** for static styling.

---

## 📁 Project Structure

```
demo
├── .mvn/wrapper
├── src
│   ├── main
│   │   ├── java/com/example
│   │   │   ├── config        # Configuration classes
│   │   │   ├── controller    # Web controllers (MVC layer)
│   │   │   ├── entity        # JPA entities
│   │   │   ├── model         # DTOs / domain models
│   │   │   ├── repository   # Data access layer
│   │   │   ├── service      # Business logic layer
│   │   │   └── FirstApplication.java  # Application entry point
│   │   └── resources
│   │       ├── static
│   │       │   └── style.css # Static CSS files
│   │       ├── templates
│   │       │   └── index.html # Thymeleaf templates
│   │       └── application.properties # App configuration
│   └── test
│       └── java/com/example/entity # Unit tests
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

---

## 🚀 Technologies Used

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Thymeleaf**
* **Maven**
* **HTML / CSS**

---

## ▶️ Getting Started

### Prerequisites

* Java 17+ (or the version defined in `pom.xml`)
* Maven (or use the Maven Wrapper included)

### Running the Application

Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 🧩 Application Layers

* **Controller**
  Handles HTTP requests and returns views or responses.

* **Service**
  Contains business logic and coordinates between controllers and repositories.

* **Repository**
  Manages database interactions using Spring Data JPA.

* **Entity**
  JPA entities mapped to database tables.

* **Model**
  DTOs or helper models used for data transfer.

---

## 🎨 Frontend

* **Thymeleaf templates** are located in:

  ```
  src/main/resources/templates
  ```
* **Static assets (CSS, JS, images)** are located in:

  ```
  src/main/resources/static
  ```

---

## ⚙️ Configuration

Application settings are defined in:

```
src/main/resources/application.properties
```

This includes:

* Server port
* Database configuration
* JPA/Hibernate settings
---

## 📌 Notes

* This project follows standard **Spring Boot conventions**.
* The structure is designed for scalability and maintainability.
* Ideal as a starter template or learning project.

