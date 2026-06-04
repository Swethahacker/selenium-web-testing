# selenium-web-testing

Sauce Demo Automation Suite
About This Project
An automated test suite built for SauceDemo — a sample e-commerce web application. This project demonstrates end-to-end login testing using Selenium WebDriver with Cucumber BDD framework in Java.
Tech Stack

Java — core programming language
Selenium WebDriver — browser automation
Cucumber BDD — behaviour driven testing using Gherkin syntax
TestNG/JUnit — test execution via TestRunner
Maven — project build and dependency management
Page Object Model — design pattern for maintainable test code
CSV Data Driven Testing — test data managed via external CSV files
Firefox — browser used for testing

Test Scenarios Covered
Smoke Test

Successful login with standard user credentials

Negative Test

Login attempt with locked out user — verifies correct error message is displayed

CSV Login Test

Login using multiple credentials loaded from external CSV file

Regression Test

Login validation across different user roles — standard, problem user, performance glitch user

Project Structure
src/
├── test/
│   ├── java/
│   │   └── com.sauce/
│   │       ├── drivers/        — WebDriver setup (DriverFactory)
│   │       ├── hooks/          — Before and After test hooks
│   │       ├── pages/          — Page Object Model (LoginPage)
│   │       ├── runners/        — TestRunner configuration
│   │       ├── stepdefs/       — Step definitions for Cucumber
│   │       └── utils/          — Utility classes (CSVUtils)
│   └── resources/
│       ├── data/               — CSV test data files
│       └── features/           — Cucumber feature files
How To Run This Project

Clone this repository

git clone https://github.com/yourusername/sauce-demo-automation

Open in IntelliJ IDEA
Make sure Maven dependencies are installed
Run TestRunner.java to execute all test scenarios

What I Learned

Writing BDD test scenarios using Gherkin syntax
Implementing Page Object Model for clean and reusable code
Data driven testing using CSV files
Setting up WebDriver with DriverFactory pattern
Writing Smoke, Regression and Negative test scenarios

Author
Swetha. B
Fresher QA Engineer | Trichy
https://www.linkedin.com/in/swetha-b-912315243/ | Swetha280904@gmail.com
