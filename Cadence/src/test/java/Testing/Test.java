package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.homePage;
import pages.timeSheet;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Test {
    private WebDriver driver;
    private homePage HomePage;
    private timeSheet TimeSheet;
    private String email = "KKlaase@inspiredtesting.com";
    private String password = "KK6578";

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        HomePage = new homePage(driver);
        TimeSheet = new timeSheet(driver);


        }
    @org.junit.jupiter.api.Test
    public void start(){
        HomePage.cadence();
        HomePage.login(email,password);
        HomePage.loginBtn();
        HomePage.close();
        HomePage.selectDrpDwn();


        //assert if total hours is 40 displayed if not kick message out
        //execute post





    }











    @AfterAll
    public void tearDown(){
        driver.close();
        driver.quit();
        }

    }









