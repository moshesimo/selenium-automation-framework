package com.moshe.tests;

import com.moshe.base.BaseTest;
import com.moshe.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {




    @Test
    public void loginWithValidUser() {



        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(
                actualUrl,
                "https://www.saucedemo.com/inventory.html"
        );
    }

    @Test
    public void loginWithInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "wrong_password"
        );

        String actualErrorMessage = loginPage.getErrorMessage();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,"Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void loginWithEmptyPassword() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                ""
        );

        String actualErrorMessage = loginPage.getErrorMessage();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,"Epic sadface: Password is required");
    }

    @Test
    public void loginWithEmptyFields() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(
                "",
                ""
        );

        String actualErrorMessage = loginPage.getErrorMessage();
        System.out.println(actualErrorMessage);
        Assert.assertTrue(
                actualErrorMessage.equals("Epic sadface: Username is required")
        );

    }

    @Test
    public void loginWithInValidUsername() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "moshe123",
                "secret_sauce"
        );

        String actualErrorMessage = loginPage.getErrorMessage();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,"Epic sadface: Username and password do not match any user in this service");


    }
    /*
    @Test
    public void doubleClickLogin()  {

        Actions actions = new Actions(driver);

        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        actions.doubleClick(
                driver.findElement(By.id("login-button"))
        ).perform();
        System.out.println(driver.getCurrentUrl());
    }
*/

    @Test
    public void loginWithLockedUser(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "locked_out_user",
                "secret_sauce"
        );
        String actualErrorMessage =  loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,"Epic sadface: Sorry, this user has been locked out.");


    }

}