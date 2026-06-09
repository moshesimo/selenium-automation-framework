    package com.moshe.pages;

    import com.moshe.base.BaseTest;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class CheckoutCompletePage {

        private final WebDriver driver;

        public CheckoutCompletePage(WebDriver driver) {
            this.driver = driver;
        }


        public static By BACK_HOME = By.id("back-to-products");

        public void backHomeButtonClick(){
            driver.findElement(BACK_HOME).click();
        }
    }
