package tests;

import driver.manager.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {


    @BeforeMethod
    public void beforeTest() {

        DriverManager.getWebDriver();
        DriverManager.getWebDriver().manage().window().maximize();
        DriverManager.getWebDriver().navigate().to(APPLICATION_URL);

    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}