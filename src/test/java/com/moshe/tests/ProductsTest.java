package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.ProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    private static final By SHOPPING_CART_LINK =
            By.cssSelector("[data-test='shopping-cart-link']");
    @Test
    public void addBackpackToCart() {

        loginAsValidUser();

        ProductsPage productsPage =
                new ProductsPage(driver);

        productsPage.addBackpackToCart();

        Assert.assertEquals(
                productsPage.getCartBadgeText(),
                "1"
        );
    }
    @Test
    public void removeBackpackFromCart() throws InterruptedException {
        loginAsValidUser();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackpackToCart();
        productsPage.RemoveBackpackFromCart();
        Assert.assertTrue(productsPage.isCartEmpty());


    }

    public void openCart() {
        driver.findElement(SHOPPING_CART_LINK).click();
    }

}