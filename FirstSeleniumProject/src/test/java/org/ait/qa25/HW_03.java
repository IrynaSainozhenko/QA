package org.ait.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_03 {

    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("https://demowebshop.tricentis.com");
    }

    @Test
    public void openDemoWebShopTest() {
        System.out.println("This site is opened");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
