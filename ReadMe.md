# 🧪 Selenium POM Framework

**A robust and scalable automation framework** demonstrating modern test automation practices using Selenium with Page Object Model design pattern.

## 🚀 Key Features

- **Page Object Model (POM) Design** - Clean separation between test logic and page specifics
- **Multi-Browser Support** - Chrome, Firefox, Edge compatibility
- **TestNG Integration** - Parallel execution, data-driven testing, and comprehensive reporting
- **Reusable Components** - Utility classes for common operations (screenshots, waits, assertions)
- **Configuration Management** - Externalized properties for easy environment switching
- **Logging** - Detailed execution logs using Log4j2

## 🏗️ Framework Structure

```
src/
├── main/java/com/automation/
│   ├── pages/          # Page Object classes
│   ├── base/           # Base test and driver setup
│   ├── utils/          # Helper classes and utilities
│   └── constants/      # Application constants
│
├── test/java/
│   └── tests/          # Test cases using TestNG
│
└── resources/
    ├── config/         # Configuration properties
    └── testdata/       # Test data files
```

## 🛠️ Technical Stack

- **Java 8+** - Core programming language
- **Selenium WebDriver** - Browser automation
- **TestNG** - Test framework and parallel execution
- **Maven** - Dependency management and build tool
- **Log4j2** - Logging framework
- **WebDriverManager** - Automated driver management

## 📦 Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA / Eclipse)

### Installation
```bash
# Clone the repository
git clone [repository-url]

# Navigate to project directory
cd selenium-pom-framework

# Download dependencies
mvn clean install
```

### Running Tests
```bash
# Run all tests
mvn test

# Run specific test suite
mvn test -Dsuite=smoke-tests.xml

# Run with different browser
mvn test -Dbrowser=firefox
```

## 🎯 Skills Demonstrated

- **Design Patterns**: Page Object Model, Singleton, Factory
- **Framework Architecture**: Modular, scalable, and maintainable design
- **Automation Best Practices**: Explicit waits, meaningful assertions, proper synchronization
- **CI/CD Ready**: Maven integration for seamless pipeline implementation
- **Cross-Browser Testing**: Multi-browser support with parallel execution
- **Reporting**: Detailed test execution reports and logging

## 📊 Test Execution & Reports

- **TestNG Reports**: Comprehensive HTML reports in `target/surefire-reports`
- **Screenshots**: Automatic capture on test failure
- **Logs**: Detailed step-by-step execution logs

## 🔧 Configuration

Modify `src/main/resources/config/config.properties` for:
- Application URL
- Browser settings
- Timeout configurations
- Environment-specific variables

## 📈 Scaling & Extensibility

The framework is designed to be easily extended with:
- API testing integration
- Database validation support
- Mobile testing capabilities
- Cloud testing platforms (BrowserStack, Sauce Labs)

---

*Built with focus on clean code, reusability, and industry standards.*