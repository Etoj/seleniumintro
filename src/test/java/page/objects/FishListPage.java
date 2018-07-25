package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FishListPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css="a[href$=\"Id=FI-SW-01\"")
    WebElement productIdAngelfish;

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickToProductIdAngelfish(){
        WaitForElement.waitUntilElementIsClickable(productIdAngelfish);
        productIdAngelfish.click();
        logger.info("Clicked on product ID Angelfish");
    }


}
