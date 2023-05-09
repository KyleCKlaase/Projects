package unittest;
import base.BaseTest;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

//inheritance use 'extends' tag to inherit which class
public class UnitTest extends BaseTest {

    //using variable "email"to hold string value
    protected String email = "kylecalvinklaase@outlook.com";
    //using variable "password"to hold string value
    protected String password = "Password123";



    @Test
    public void testOne() {
        app.homePage.navigateTo();
        app.homePage.clickLogin();
        app.loginPage.ValidateLoginButton();
        //Encapsulation of email and password values(reusing)
        app.loginPage.Login(email, password);
        Assertions.assertTrue(app.homePage.user(email));
        //$25 Virtual Gift Card//Simple Computer//14.1-inch Laptop
        app.homePage.addToCart("Laptop");



        app.homePage.clickLogout();



    }


}







