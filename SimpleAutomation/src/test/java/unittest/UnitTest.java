package unittest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.sql.PooledConnection;


public class UnitTest {
    private WebDriver driver;
    @Test
    public void testOne(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        //Validating if Login button is displayed
        //Boolean=true and false
        //Declaring a variable "result"
       boolean result = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
       Assertions.assertTrue(result);
        System.out.println(result);


        driver.close();
        driver.quit();


    }
    @Test
    public void testtwo(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.inspiredtesting.com/contact-us-edinburgh-2023");




        //This is called declaring a variable
        boolean result;
        result = true;

        result =false;
        System.out.println(result);






    }




}
