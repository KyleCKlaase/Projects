package application;

import Roman.Roman;
import application.pages.CartPage;
import application.pages.HomePage;
import application.pages.LoginPage;

public class SwagLabsWebApplication {
    public HomePage homePage;
    public LoginPage loginPage;
    public CartPage cartPage;

    public SwagLabsWebApplication(Roman roman) {
        homePage = new HomePage(roman);
        loginPage = new LoginPage(roman);
        cartPage = new CartPage(roman);






    }
}
