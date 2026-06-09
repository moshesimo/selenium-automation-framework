package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.CheckoutCompletePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutCompleteTest extends BaseTest {

    @Test
    public void BackHomeButtonClick(){
        openCompletePage();
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.backHomeButtonClick();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
    }
}
