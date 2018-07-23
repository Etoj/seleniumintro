package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LeftMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css="#SidebarContent a[href$=\"Id=FISH\"]")
    WebElement leftMenuFishLink;

    public LeftMenuPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }
    public void clickOnLeftMenuFishLink(){
        WaitForElement.waitUntilElementIsClickable(leftMenuFishLink);
        leftMenuFishLink.click();
        logger.info("Click on left menu fish link");
    }
}
