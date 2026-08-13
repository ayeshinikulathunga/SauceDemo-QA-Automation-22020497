# SauceDemo QA Automation

## Project Overview

This project is a Selenium WebDriver automation framework developed for the Advanced Software Quality Assurance assignment. The automation framework tests the core functionalities of the SauceDemo web application using Java, Maven, TestNG and the Page Object Model (POM) design pattern.
The project includes manual test case design, automated test implementation, debugging and test execution.

## Technologies Used

- Java 26
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- IntelliJ IDEA

## Framework Design

The project follows the **Page Object Model (POM)** design pattern to improve code reusability and maintainability.

```
SauceDemo-QA-Automation
│── pom.xml
│── README.md
│── AI_usage.md
│
├── src
│   └── test
│       ├── java
│       │   ├── base
│       │   ├── pages
│       │   ├── tests
│       │   └── utils
│       └── resources
│           ├── config.properties
│           └── testng.xml
```

---

## Automated Test Scenarios

The following test scenarios have been automated:

1. Login with valid credentials
2. Sort products by price (Low to High)
3. Add a product to the shopping cart
4. Remove a product from the shopping cart
5. Complete the checkout process

## Prerequisites

Before running the project, ensure that the following software is installed:

- Java JDK 26
- Apache Maven
- IntelliJ IDEA
- Google Chrome
- Internet connection

## Installation

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Allow Maven to download all required dependencies.

4. Ensure that the `config.properties` file contains the correct application URL and login credentials.

## Running the Tests

Run the complete test suite using:

- `testng.xml`

or

Run individual TestNG classes directly from IntelliJ IDEA.

## Configuration

The `config.properties` file contains configurable values such as:

- Browser
- Application URL
- Username
- Password
- Timeout values

## Design Pattern

This project uses the **Page Object Model (POM)** design pattern.

Each page of the application is represented by a separate Java class containing the web element locators and reusable methods. Test classes contain only the test logic, improving readability and maintainability.

## License

This project was developed for academic purposes as part of a university assignment.
