# Selenium Automation Framework

Automation testing framework for SauceDemo built with Java, Selenium WebDriver, TestNG, Maven and the Page Object Model (POM) design pattern.

## Technologies

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

## Test Coverage

### Login Tests
- Valid login
- Invalid password
- Locked user validation
- Empty fields validation

### Products Tests
- Add product to cart
- Remove product from cart

### Cart Tests
- Open cart
- Verify product in cart

### Checkout Information Tests
- Valid checkout information
- First name validation
- Last name validation
- Postal code validation

### Checkout Overview Tests
- Finish checkout
- Cancel checkout
- Product link navigation

### Checkout Complete Tests
- Back Home navigation

## Design Pattern

This project follows the Page Object Model (POM) design pattern to improve maintainability, readability and reusability.

## Running Tests

```bash
mvn test
