package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void typeIntoUserNameField(String username){
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Username is send");
    }

    public void typeIntoPasswordField(String password){
        WaitForElement.waitUntilElementIsVisible(passwordField);
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Password is send");
    }

    public void clickOnLoginButton(){
        WaitForElement.waitUntilElementIsClickable(signOnButton);
        signOnButton.click();
        logger.info("Click on login button");
    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Warning msg bad login/password is displayed");
        return warningText;
    }

}