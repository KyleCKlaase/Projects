package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void login(){

        WebElement usernamefield = driver.findElement(By.id("Email"));
        WebElement userpasswordfield = driver.findElement(By.id("Password"));
        usernamefield.sendKeys("kylecalvinklaase@outlook.com");
        userpasswordfield.sendKeys("Password123");

        //click login button
        WebElement loginBtn = driver.findElement(By.className("button-1 login-button"));
        loginBtn.click();


    }









}





