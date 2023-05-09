package unittest;

import Roman.RomanBase;
import application.SwagLabsWebApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SwagLabsWorkShopTest extends RomanBase {
    private String username = "standard_user";
    private String password = "secret_sauce";
    private By swagLabs = By.xpath("//div[text()='Swag Labs']");

    @BeforeEach
    public void setUp() {
        roman()._driver = roman().selenium.getChromeDriver();
        roman()._driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    SwagLabsWebApplication app;
    @Test
    public void login() {
        app = new SwagLabsWebApplication(roman());
        app.homePage.navigateTo();
        app.loginPage.login(username, password);
        app.loginPage.clickLoginBtn();
        //Validating the Logo is in the center of HomePage
        Assertions.assertTrue(app.homePage.logo(swagLabs));
        //Making sure cart is empty before adding items to cart
        Assertions.assertTrue(app.homePage.cartIsEmpty());
        //Adding all items to the cart
        app.homePage.addToCart("Backpack");
        app.homePage.addToCart("Red");
        app.homePage.addToCart("Onesie");
        app.homePage.addToCart("Fleece");
        app.homePage.addToCart("Bolt");
        app.homePage.addToCart("Light");
        //Validating that items have been added to cart
        Assertions.assertTrue(app.homePage.cartQuantity());
        app.homePage.viewCart();
        app.cartPage.removeItems();
        //Validating the cart is completely empty
        Assertions.assertTrue(app.cartPage.cartQuantity());
        app.cartPage.logout();


    }


}
