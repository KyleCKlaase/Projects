package applications.demoworkshop.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.SeleniumWrapper;



import static org.openqa.selenium.By.xpath;

public class HomePage extends SeleniumWrapper {

    //chatgpt said so

    private By logout = xpath("//a[text()='Log out']");
    private By login = xpath("//a[@href='/login']");
    private By displayedEmail(String email) {

        return By.xpath("//a[text()='"+email+"']");
    }


    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void clickLogin() {

        click(login);
    }

    public void navigateTo() {

       navigateTo("https://demowebshop.tricentis.com/");

    }

    public boolean user(String email) {

        System.out.println("validating email is displayed ");

        boolean status = validateElementDisplayed(displayedEmail(email));
        System.out.println(status);
        return status;

    }
    public void clickLogout(){

        click(logout);
    }

    public void addToCart(String item){
       click(getBy(item));


    }
    public By getBy(String item){
        return  By.xpath("//h2//a[contains(text(),'"+item+"')]/ancestor::div[@class='details']//input[@value='Add to cart']");

}

}
