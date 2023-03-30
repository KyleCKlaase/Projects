package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public void clickLogin(){
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
    }
    public void navigateTo(){
        driver.get("https://demowebshop.tricentis.com/");

    }


}
