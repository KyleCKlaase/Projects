package application.pages;
import Roman.Roman;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class LoginPage extends AbstractPage {
    private By loginBtn= By.xpath("//input[@id='login-button']");
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");




    public LoginPage(Roman roman) {
        super(roman);
    }
    public void login(String username,String password){
     sendKeys(usernameField,username);
     sendKeys(passwordField,password);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }

    @Override
    protected String get_uri(){
        return "https://www.saucedemo.com/";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

}
