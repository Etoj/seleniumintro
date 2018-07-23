package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout(){

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LeftMenuPage leftMenuPage =new LeftMenuPage();
        leftMenuPage.clickOnLeftMenuFishLink();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickToProductIdAngelfish();

        AngelfishListPage angelfishListPage = new AngelfishListPage();
        angelfishListPage.clickOnAddToCartSmallAngelfish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickProceedToCheckoutButton();

        LoginPage loginPage = new LoginPage();
        loginPage.getWarningMessage();
        assertEquals(loginPage.getWarningMessage(), "You must sign on before attempting to check out. Please sign on and try checking out again.");

    }
}
