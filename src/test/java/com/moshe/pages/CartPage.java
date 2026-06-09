package com.moshe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private final WebDriver driver;

    private static By BACKPACK_NAME = By.cssSelector("[data-test='inventory-item-name']");

    private static By CONTINUE_SHOPPING_BUTTON = By.id("continue-shopping");

    private static By CHECKOUT_BUTTON = By.id("checkout");

    private static By CART_ITEMS = By.cssSelector("[data-test='inventory-item']");

    private static By REMOVE_PRODUCT_BUTTON = By.cssSelector("[data-test='remove-sauce-labs-backpack']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(BACKPACK_NAME).getText();
    }
    public void continueShoppingButtonClick(){
        driver.findElement(CONTINUE_SHOPPING_BUTTON).click();
    }

    public void clickCheckout() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }
    public boolean isCartEmpty() {
        return driver.findElements(CART_ITEMS).isEmpty();
    }
    public void clickRemove(){
        driver.findElement(REMOVE_PRODUCT_BUTTON).click();
    }





}