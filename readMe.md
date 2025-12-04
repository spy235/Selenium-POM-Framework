# Selenium Automation Framework

A modern, modular, and extensible test automation framework built with **Java**, **Selenium**, **Cucumber**, **TestNG**, **Maven**, and an advanced utilities ecosystem. This framework is designed for scalability, parallel execution, clean architecture, and seamless CI/CD integration.

---

## 🚀 Features

- **Modular Framework Architecture** with clear separation of concerns.
- **Custom Annotations** for metadata-driven reporting.
- **Driver Factory** supporting multiple browsers & platforms.
- **Cucumber BDD** with extensible hooks and listeners.
- **Reporting Integrations**
  - Allure Reports
  - Extent Reports
- **Test Data Management**
  - Excel
  - JSON
  - DTO-based structured typing
- **Utility Layers**
  - Logging
  - Faker Data Generation
  - Properties Handling
  - Date, File, JSON utilities
- **Headless + Remote/WebDriver Grid Support**
- **Robust Exception Handling System**
- **Supports Scenario-Level Context Management**

---

## 📁 Project Structure

Below is the main structure of the project:

```
pom.xml
readMe.md
logs/
reports/
src
├── main
│   ├── java
│   │   ├── annotations/                # Custom annotations
│   │   ├── config/                     # Config + Factory
│   │   ├── constants/                  # Framework constants
│   │   ├── driver/                     # WebDriver factory + manager
│   │   ├── dto/                        # Test data transfer objects
│   │   ├── enums/                      # Enum definitions
│   │   ├── exceptions/                 # Custom exceptions
│   │   ├── helpers/                    # Utility helpers
│   │   ├── keywords/                   # WebUI keyword library
│   │   ├── pojo/                        # Plain objects
│   │   ├── report/                      # Report managers
│   │   └── utils/                       # Advanced utilities
│   └── resources
│       ├── log4j2.properties
│       ├── META-INF/services
├── test
│   ├── java
│   │   ├── common/                      # BaseTest, CommonPage
│   │   ├── dataprovider/                # Data provider + Repository
│   │   ├── hooks/                       # Cucumber hooks/listeners
│   │   ├── listeners/                   # TestNG listeners
│   │   ├── pages/                       # Page Objects
│   │   ├── runners/                     # Test Runners
│   │   ├── stepdefinitions/             # Step Definitions
│   │   └── resources
│       ├── cucumber.properties
│       ├── extent.properties
│       ├── pdf-config.yaml
│       └── config/
│           ├── scenario/
│           ├── suites/
│           └── testdata/
target/
```

---

## 🔧 Technology Stack

| Layer      | Technology             |
| ---------- | ---------------------- |
| Language   | Java 17+               |
| Build Tool | Maven                  |
| Testing    | Cucumber + TestNG      |
| Automation | Selenium/WebDriver     |
| Reporting  | Allure, Extent Reports |
| Logging    | Log4j2                 |
| Data       | Excel, JSON, DTO       |

---

## ▶️ How to Run Tests

### **1. Run via Maven**

```
mvn clean test
```

### **2. Run Specific Suite**

```
mvn clean test -Dsuite=Smoke
```

### **3. Run with Browser Override**

```
mvn clean test -Dbrowser=chrome
```

### **4. Run Cucumber Feature**

Use predefined runners in `/runners` package.

---

## 🧪 Reports

### **Allure Report**

Generate and open:

```
mvn allure:serve
```

### **Extent Report**

Available in:

```
/reports/extent-report/
```

---

## 🔐 Configuration

Modify environment configuration here:

```
src/test/resources/config/
```

Or override using:

```
-Denv=qa
```

---

## 📦 Test Data Management

- Excel data via `ExcelHelpers`
- JSON data via `JsonUtils`
- DTO mapping for structured formats

---

## 🧱 Framework Highlights

### **Driver Layer**

- BrowserFactory
- DriverManager
- TargetFactory
- ScenarioManager

### **Exception Handling**

Custom exceptions for clarity and debugging:

- InvalidPath
- FrameworkException
- TargetNotValid

### **Utilities**

- Logging
- Encryption/Decoding
- Local Storage Access
- Zip Utils
- Date Utils
- Faker Data

---

## 🙌 Acknowledgements

Framework built with inspiration from modern test automation best practices and clean architecture principles.
