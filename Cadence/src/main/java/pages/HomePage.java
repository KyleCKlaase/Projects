package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class homePage {
    private WebDriver driver;
    private By usernameField = By.id("login-username");
    private By passwordField = By.id("login-password");
    private By btn = By.xpath("//button[@id='btnSignIn']");
    private By btn2 = By.xpath("//div[@aria-describedby='NotificationPopup']//img");
    private String cadenceUrl = "https://cadence.inspiredtesting.com/User/Login";
    private By selectTime = By.xpath("//span[@class='GlyphPro glyphicons-stopwatch']");
    public homePage(WebDriver driver){
        this.driver = driver;
    }
    public void cadence(){
        driver.get(cadenceUrl);

    }
    public void login(String email,String password){
        //add username and password
        driver.findElement(usernameField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }
    public void loginBtn(){
        //click login
        driver.findElement(btn).click();

    }
    public void close(){
        //close notification tab
        driver.findElement(btn2).click();
    }
    public void selectDrpDwn(){
        //click on TimeSheet
        driver.findElement(selectTime).click();
    }



}
