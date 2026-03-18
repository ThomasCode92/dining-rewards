# 🍽️ Dining Rewards Application

A Spring Framework training project that demonstrates the core concepts of the Spring Framework through a dining rewards
system. Customers earn rewards for dining at participating restaurants, with rewards calculated based on restaurant
contribution percentages.

## 📚 About This Project

This project is based on the **[Spring Framework Essentials](https://spring.academy/courses/spring-framework-essentials)
** course from Spring Academy

The application has been modernized with:

- **Java 21** (upgraded from Java 11)
- **Spring Boot 3.5.5** (upgraded from 2.7.5)
- **Maven** build system
- **Jakarta EE** persistence APIs

## 📁 Project Structure

The application consists of three Maven modules:

```
dining-rewards/
├── 00-rewards-common/      # Common domain classes (Money, DateTime utilities)
├── 01-rewards-db/          # Database schemas, JPA entities, web resources
└── dining-rewards/         # Main rewards network application
```

### 🧩 Module Overview

- **00-rewards-common**: Shared domain models and utilities used across modules
- **01-rewards-db**: Database layer with JPA entities, repositories, and SQL schemas
- **dining-rewards**: Core rewards calculation engine and business logic

## ✅ Prerequisites

- **Java 21** or higher
- **Maven 3.6+** (or use the included Maven wrapper)
- An IDE with Spring Boot support (IntelliJ IDEA or VS Code)

## 🚀 Getting Started

### 1. Clone or Navigate to the Project

```bash
cd /path/to/dining-rewards
```

### 2. Build the Project

Using Maven wrapper (recommended):

```bash
./mvnw clean install
```

### 3. Run Tests

All modules include comprehensive tests:

```bash
./mvnw test
```

Expected output: **43 tests passing**

## 🛠️ Technology Stack

| Technology       | Version |
|------------------|---------|
| Java             | 21      |
| Spring Boot      | 3.5.5   |
| Spring Framework | 6.x     |
| Hibernate        | 6.x     |
| HSQLDB           | 2.7.x   |
| JUnit            | 5.x     |
| Maven            | 3.x     |

## 📖 Learning Resources

- **Spring Academy Course**: https://spring.academy/courses/spring-framework-essentials
- **Spring Framework Documentation**: https://docs.spring.io/spring-framework/reference/
- **Spring Boot Documentation**: https://docs.spring.io/spring-boot/docs/current/reference/html/

## 📄 License

This is an educational project based on Spring Academy course materials.

---

**Happy Learning!** Start exploring the Spring Framework by diving into the code and following along with the Spring
Academy course.
