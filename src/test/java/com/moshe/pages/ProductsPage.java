package com.moshe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private final WebDriver driver;

    private static  By ADD_BACKPACK_TO_CART_BUTTON =
            By.id("add-to-cart-sauce-labs-backpack");

    private static By REMOVE_BACKPACK_FROM_CART_BUTTON =
            By.id("remove-sauce-labs-backpack");

    private static By SHOPPING_CART_BADGE =
            By.cssSelector("[data-test='shopping-cart-badge']");

    private static By SHOPPING_CART =
            By.cssSelector("[data-test='shopping-cart-link']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void addBackpackToCart() {
        driver.findElement(ADD_BACKPACK_TO_CART_BUTTON).click();
    }
    public void RemoveBackpackFromCart(){
        driver.findElement(REMOVE_BACKPACK_FROM_CART_BUTTON).click();
    }

    public String getCartBadgeText() {
        return driver.findElement(SHOPPING_CART_BADGE).getText();
    }
    public boolean isCartEmpty() {
        return driver.findElements(
                SHOPPING_CART_BADGE
        ).isEmpty();
    }

    public void openCart() {
        driver.findElement(SHOPPING_CART).click();
    }

}