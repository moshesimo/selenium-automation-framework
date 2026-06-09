package com.moshe.tests;

import com.moshe.base.BaseTest;
import org.testng.annotations.Test;

public class OpenGoogleTest extends BaseTest {

    @Test
    public void openGoogle() throws InterruptedException {
        driver.get("https://www.haaretz.co.il/riddles/2026-04-26/ty-article-static/.premium/0000019a-20bc-daf2-a7fb-3cbf2d680000");
        Thread.sleep(2000);
    }
}