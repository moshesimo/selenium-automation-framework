package com.moshe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInformationDetailsPage {

    private final WebDriver driver;

    private static By FIRST_NAME_FIELD = By.id("first-name");
    private static By LAST_NAME_FIELD = By.id("last-name");
    private static By POSTAL_CODE_FIELD = By.id("postal-code");

    private static By CONTINUE_BUTTON = By.id("continue");
    private static By CANCEL_BUTTON = By.id("cancel");

    private static By ERROR_MESSAGE = By.cssSelector("[data-test='error']");

    public CheckoutInformationDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(FIRST_NAME_FIELD))
                .sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
    }
    public void enterPostalCode(String postalCode) {
        driver.findElement(POSTAL_CODE_FIELD).sendKeys(postalCode);
    }


    public void cancelButton(){
        driver.findElement(CANCEL_BUTTON).click();
    }

    public void continueClick(String firstName, String lastName, String postalCode) {

        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        driver.findElement(CONTINUE_BUTTON).click();

    }



}
