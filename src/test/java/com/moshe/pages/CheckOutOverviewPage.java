package com.moshe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {

    private final WebDriver driver;

    private static By FINISH_BUTTON = By.id("finish");
    private static By CANCEL_BUTTON = By.id("cancel");
    private static By ITEM_LINK = By.id("item_4_title_link");


    public void clickBackpackLink(){
        driver.findElement(ITEM_LINK).click();
    }

    public void clickCancelButton(){
        driver.findElement(CANCEL_BUTTON).click();
    }

    public void clickFinishButton(){
        driver.findElement(FINISH_BUTTON).click();
    }

    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }


}
