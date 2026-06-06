package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.CartPage;
import com.moshe.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void backpackAppearsInCart() {


        openCartWithProductInside();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(
                cartPage.getProductName(),
                "Sauce Labs Backpack"
        );
    }


    @Test
    public void continueShoppingButtonReturnsToProductsPage(){
        openCartWithProductInside();
        CartPage cartPage = new CartPage(driver);
        cartPage.continueShoppingButtonClick();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(
                actualUrl,
                "https://www.saucedemo.com/inventory.html"
        );

    }

    @Test
    public void checkoutButtonOpensCheckoutPage() {
        openCartWithProductInside();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://www.saucedemo.com/checkout-step-one.html"
        );
    }

    private void openCartWithProductInside(){
        loginAsValidUser();
        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.addBackpackToCart();
        productsPage.openCart();
    }
@Test
    public void isItemRemoved() throws InterruptedException {
        openCartWithProductInside();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickRemove();
        Assert.assertTrue(cartPage.isCartEmpty());
    }
}