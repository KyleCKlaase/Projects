package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginBtn = By.xpath("//input[@value='Log in']");
    private By usernameField = By.id("Email");
    private By passwordField = By.id("Password");
    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }
    //Validating if Login button is displayed
    //Boolean=true or false
    //Declaring a variable "result" and giving valuing
    public boolean ValidateLoginButton(){
        boolean result = driver.findElement(loginBtn).isDisplayed();
        return result;

    }
    public void Login(String email,String password){
        //add username and password
        driver.findElement(usernameField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);

        //click loginBtn
        driver.findElement(loginBtn).click();

    }



}
