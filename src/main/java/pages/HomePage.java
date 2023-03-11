package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        driver = driver;

    }

    //click on login button
    public void clickLoginButton(){
        driver.findElement(By.id("<a href=\"/login\" class=\"ico-login\">Log in</a>")).click();

    }





}