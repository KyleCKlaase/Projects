package unittest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;


public class UnitTest {
    private HomePage homePage;
    private LoginPage loginPage;
    //using variable "email"to hold string value
    private String email = "kylecalvinklaase@outlook.com";
    //using variable "password"to hold string value
    private String password = "Password123";
    private WebDriver driver;
    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

    }
    @Test
    public void testOne(){
        homePage.navigateTo();
        homePage.clickLogin();
        loginPage.ValidateLoginButton();
        //Encapsulation of email and password values(reusing)
        loginPage.Login(email,password);


        driver.findElement(By.xpath("//a[text()='Log in']")).click();







        driver.close();
        driver.quit();


    }


    }





