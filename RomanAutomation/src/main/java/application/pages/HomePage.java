package application.pages;
import Roman.Roman;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class HomePage extends AbstractPage {
    private By swagLabs = By.xpath("//div[text()='Swag Labs']");
    private By cartMt = By.xpath("//div[@id='shopping_cart_container']");
    private By cartBtn = By.xpath("//div[@id='shopping_cart_container']");

    private By cartDisQ = By.xpath("//div[@id='shopping_cart_container']//span");

    private By product(String item){
        return By.xpath("//div[contains(text(),'"+item+"')]//ancestor::div[@class='inventory_item']//button");
    }

    public HomePage(Roman roman) {
        super(roman);
    }

    public void addToCart(String item){
        click(product(item));
    }

    public boolean cartQuantity(){
        System.out.println("Items added to cart");
        return validateElement_Displayed(cartDisQ);
    }

    public boolean cartIsEmpty(){
        System.out.println("Cart is empty");
        return validateElement_Displayed(cartMt);

    }

    public void viewCart(){
        click(cartBtn);
    }

    public boolean logo(By swagLabs){
        System.out.println("SwagLabs is on the HomePage");
        boolean status= validateElement_Displayed(this.swagLabs);
        System.out.println(status);
        return status;
    }

    @Override
    protected String get_uri(){
        return "https://www.saucedemo.com/inventory.html";
    }
    @Override
    public boolean waitForDisplayed(){
        return false;
    }
}
