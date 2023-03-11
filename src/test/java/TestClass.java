import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;


public class TestClass {
    private LoginPage loginPage;
    private HomePage homePage;
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

    }
    @Test
    public void login () {

        homePage.clickLoginButton();
        loginPage.login();



    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();

    }




}
