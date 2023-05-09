package applications.demoworkshop;
import applications.demoworkshop.pages.HomePage;
import applications.demoworkshop.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Tricentis {

    public HomePage homePage;
    public LoginPage loginPage;


    public Tricentis(WebDriver driver) {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);



    }
}
