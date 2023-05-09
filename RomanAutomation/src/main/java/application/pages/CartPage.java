package application.pages;

import Roman.Roman;
import org.bson.assertions.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.AbstractPage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CartPage extends AbstractPage {
    private By removeBtn = By.xpath("//button[text()='Remove']");
    private By logoutBtn = By.xpath("//a[@id='logout_sidebar_link']");
    private By cartDisQ = By.xpath("//div[@id='shopping_cart_container']");
    private By dropDwnMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    private By firstRemoveBtn = By.xpath("(//button[text()='Remove'])[1]");

    public CartPage(Roman roman) {
        super(roman);
    }

    //clicks all the remove buttons until there is none left
    public void removeItems(){
        int total = find(removeBtn).size();
        for (int k=0;k<total;k++){
            click(firstRemoveBtn);
        }
    }


    public boolean cartQuantity(){
        System.out.println("Cart is empty!");
        boolean status = validateElement_Displayed(cartDisQ);
        System.out.println(status);
        return status;
    }


    public void logout(){
        click(dropDwnMenu);
        waitForDisplayed(logoutBtn);
        click(logoutBtn);
        System.out.println("Enjoy the rest of your day :)");
    }

    private void waitForDisplayed(By logoutBtn) {

    }


    @Override
    protected String get_uri() {
        return "https://www.saucedemo.com/cart.html";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

}


