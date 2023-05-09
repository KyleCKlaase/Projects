package selenium;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWrapper {
    protected WebDriver driver;

    public SeleniumWrapper(WebDriver driver) {

        this.driver = driver;
    }

    public void click(By by){

        driver.findElement(by).click();

    }
    public void sendKeys(By by,String text,boolean clearText){

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele = driver.findElement(by);
        wait.until(ExpectedConditions.visibilityOf(ele));
        if(clearText){
            ele.clear();
        }
        ele.sendKeys(text);
    }
    public void sendKeys(By by,String text){

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele = driver.findElement(by);
        wait.until(ExpectedConditions.visibilityOf(ele));

            ele.sendKeys(text);
        }
    public void navigateTo(String url){

        driver.get(url);
    }
    public boolean validateElementDisplayed(By by){

        boolean result= driver.findElement(by).isDisplayed();
        return result;
    }


}
