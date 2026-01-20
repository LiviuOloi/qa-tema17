# QA BDD Test Automation Framework (Cucumber + Java)

This repository contains a basic BDD (Behavior-Driven Development) test automation framework built with Java and Cucumber. The project uses Gherkin feature files together with step definitions and a Page Object Model structure to automate simple application flows.

---

## About the Project

This project was created to practice writing automated tests using BDD principles. Test scenarios are written in Gherkin and implemented in Java using Cucumber step definitions. The structure follows a Page Object Model approach to keep test logic separated from page-specific actions.

The project focuses on understanding how BDD tests are organized and executed rather than on complex business logic.

---

## What Is Covered

The framework includes automated scenarios for the following flows:
- Login functionality
- Creating a post
- Accessing a profile page

Each flow is described using Gherkin feature files and implemented through step definitions that interact with page classes.

---

## Technologies and Tools Used

- Java
- Cucumber (BDD / Gherkin)
- Maven
- JUnit
- IntelliJ IDEA
- Git and GitHub

---

## Project Structure

src/main/java  
Contains the main entry point of the project.

src/test/java/pages  
Contains Page Object classes such as LoginPage, PostPage, and ProfilePage. These classes encapsulate page-specific actions and logic.

src/test/java/stepdefinitions  
Contains step definition classes that implement the steps described in the Gherkin feature files. Hooks are also defined here for setup and teardown logic.

src/test/java/runners  
Contains the Cucumber test runner used to execute the feature files.

src/test/resources/features  
Contains Gherkin feature files describing the test scenarios for login, post, and profile flows.

---

## How to Run the Tests

Clone the repository:
git clone https://github.com/LiviuOloi/qa-tema17.git

Navigate into the project directory:
cd qa-tema17

Run the tests using Maven:
mvn clean test

---

## Key Learnings

Through this project I practiced:
- Writing BDD test scenarios using Gherkin
- Implementing step definitions in Java
- Structuring tests using Page Object Model
- Separating test logic from page logic
- Running automated tests with Maven and Cucumber

---

## How This Fits Into a Bigger QA Automation Project

This repository represents the BDD and test-structure layer of a larger QA automation learning path. The concepts practiced here can be extended to include API testing, data-driven testing, and CI integration in more advanced projects.

---

## Author

Liviu Oloi  
Junior QA Engineer | BDD (Cucumber) | Java | Test Automation
