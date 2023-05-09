package applications.demoworkshop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {
    private By loginBtn = By.xpath("//input[@value='Log in']");
    private By usernameField = By.id("Email");
    private By passwordField = By.id("Password");
    public LoginPage(WebDriver driver) {
        super(driver);

    }
    //Validating if Login button is displayed
    //Boolean=true or false
    public boolean ValidateLoginButton(){

        boolean result = validateElementDisplayed(loginBtn);
        return result;

    }
    public void Login(String email,String password){
        //add username and password
        sendKeys(usernameField,email);
        sendKeys(passwordField,password);

        //click loginBtn
        click(loginBtn);

    }




}
