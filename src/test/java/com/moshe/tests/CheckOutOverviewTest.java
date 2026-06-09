package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.CartPage;
import com.moshe.pages.CheckOutOverviewPage;
import com.moshe.pages.CheckoutInformationDetailsPage;
import com.moshe.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutOverviewTest extends BaseTest {

    @Test
    public void finishButtonClick(){
        openOverviewPage();
        CheckOutOverviewPage  checkOutOverviewPage = new CheckOutOverviewPage(driver);
        checkOutOverviewPage.clickFinishButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.saucedemo.com/checkout-complete.html");
    }

    @Test
    public void cancelButtonClick(){
        openOverviewPage();
        CheckOutOverviewPage  checkOutOverviewPage = new CheckOutOverviewPage(driver);
        checkOutOverviewPage.clickCancelButton();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void ClickOnItemLink(){
        openOverviewPage();
        CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver);
        checkOutOverviewPage.clickBackpackLink();
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://www.saucedemo.com/inventory-item.html?id=4");
    }


}
