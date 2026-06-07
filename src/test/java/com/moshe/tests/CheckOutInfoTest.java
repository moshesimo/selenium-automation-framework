package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.CartPage;
import com.moshe.pages.CheckoutInformationDetailsPage;
import com.moshe.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutInfoTest extends BaseTest{

    private void openCheckInfoPage() {
        openCartWithProductInside();

        CartPage cartPage = new CartPage(driver);

        cartPage.clickCheckout();

        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    @Test
    public void continueWithValidFields(){
        openCheckInfoPage();
        CheckoutInformationDetailsPage checkoutInformationDetailsPage =new CheckoutInformationDetailsPage(driver);
        checkoutInformationDetailsPage.continueClick("moshe","simo","1234567");
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,"https://www.saucedemo.com/checkout-step-two.html");
    }

    @Test
    public void continueWithoutFirstNameField(){
        openCheckInfoPage();
        CheckoutInformationDetailsPage checkoutInformationDetailsPage =new CheckoutInformationDetailsPage(driver);
        checkoutInformationDetailsPage.continueClick("","simo","1234567");
        Assert.assertEquals(checkoutInformationDetailsPage.getErrorMessage(),"Error: First Name is required");
    }


@Test
public void continueWithoutLastNameField(){


    openCheckInfoPage();
    CheckoutInformationDetailsPage checkoutInformationDetailsPage =
            new CheckoutInformationDetailsPage(driver);

    checkoutInformationDetailsPage.continueClick("moshe","","1234567");

    //System.out.println(checkoutInformationDetailsPage.getErrorMessage());
    Assert.assertEquals(checkoutInformationDetailsPage.getErrorMessage(),"Error: Last Name is required");
}


}
