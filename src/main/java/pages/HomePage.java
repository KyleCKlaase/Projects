package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
       this.driver = driver;

    }

    //click on login button
    public void clickLoginButton(){
       driver.findElement(By.xpath("//input[@value='Log in']")).click();

    }





}
