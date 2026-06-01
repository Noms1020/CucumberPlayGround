# Selenium Cucumber Java Automation Framework

A Behaviour-Driven Development (BDD) test automation framework built with **Selenium WebDriver**, **Cucumber**, and **Java** for testing the [Ndosi Simplified Automation](https://ndosisimplifiedautomation.vercel.app) web application.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)
- [Features Covered](#features-covered)
- [Step Definitions](#step-definitions)
- [Best Practices](#best-practices)
- [Troubleshooting](#troubleshooting)

---

## Project Overview

This framework automates end-to-end testing of the Ndosi Simplified Automation web application. It covers key user flows including:

- User Login and Logout
- User Registration
- Admin Panel Navigation
- Date Picker Interactions (Start Date / End Date)
- Group Creation and Validation
- Browser Alert / Popup Handling

---

## Tech Stack

| Tool | Version | Purpose |
|---|---|---|
| Java | 11+ | Programming language |
| Selenium WebDriver | 4.x | Browser automation |
| Cucumber | 7.x | BDD framework |
| JUnit | 4.x | Test runner |
| ChromeDriver | Latest | Chrome browser driver |
| Maven | 3.x | Build and dependency management |

---

## Project Structure

```
project-root/
│
├── src/
│   ├── main/
│   │   ├── java/                        # (reserved for main source code)
│   │   └── resources/
│   │
│   └── test/
│       ├── java/
│       │   ├── Pages/                   # Page Object Model classes
│       │   │   ├── AdminPanelPage.java  # Admin Panel page elements & actions
│       │   │   └── LoginPage.java       # Login page elements & actions
│       │   │
│       │   ├── Steps/                   # Cucumber Step Definitions
│       │   │   ├── Base.java            # Base class (shared driver & hooks)
│       │   │   ├── createGroupStepsDef.java  # Steps for group creation flow
│       │   │   ├── regStepsDef.java     # Steps for registration flow
│       │   │   └── stepsDef.java        # Steps for login & general actions
│       │   │
│       │   └── Utilities/               # Helper/Utility classes
│       │       └── BrowserFactory.java  # WebDriver setup & browser config
│       │
│       └── resources/                   # Feature files (Gherkin scenarios)
│           ├── createGroupAndValidateInSign-up.feature
│           ├── login.feature
│           └── registration.feature
│
├── target/                              # Compiled output (auto-generated)
├── .gitignore
└── pom.xml
```

### Class Responsibilities

| Class | Package | Responsibility |
|---|---|---|
| `AdminPanelPage.java` | Pages | Admin Panel locators and actions |
| `LoginPage.java` | Pages | Login page locators and actions |
| `Base.java` | Steps | Shared WebDriver, @Before and @After hooks |
| `createGroupStepsDef.java` | Steps | Step definitions for group creation and date picker |
| `regStepsDef.java` | Steps | Step definitions for user registration |
| `stepsDef.java` | Steps | Step definitions for login, logout, navigation |
| `BrowserFactory.java` | Utilities | Initializes and configures ChromeDriver |

---

## Prerequisites

Before running the project, ensure you have the following installed:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven 3.x](https://maven.apache.org/download.cgi)
- [Google Chrome Browser](https://www.google.com/chrome/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recommended IDE)
- Cucumber for Java plugin (IntelliJ plugin)

---

## Setup and Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 2. Add Dependencies to `pom.xml`

```xml
<dependencies>

    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.18.1</version>
    </dependency>

    <!-- Cucumber Java -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.15.0</version>
    </dependency>

    <!-- Cucumber JUnit -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.15.0</version>
        <scope>test</scope>
    </dependency>

    <!-- JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>

</dependencies>
```