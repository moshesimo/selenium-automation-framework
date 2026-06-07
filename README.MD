# Selenium Automation Framework

Automation testing framework for SauceDemo built with Java, Selenium WebDriver, TestNG, Maven and the Page Object Model (POM) design pattern.

## Technologies

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

## Project Structure

src
├── main
├── test
│ ├── pages
│ ├── tests
│ └── base

## Test Coverage

### Login Tests
- Valid login
- Invalid password
- Locked user
- Empty fields validation

### Products Tests
- Add product to cart
- Remove product from cart

### Checkout Tests
- Complete checkout flow
- First name validation
- Last name validation
- Postal code validation

## Design Pattern

This project follows the Page Object Model (POM) design pattern to improve maintainability, readability and reusability.

## Running Tests

Run all tests using Maven:

```bash
mvn test