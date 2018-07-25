package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        logger.info("Click on SignIn link");
    }

}