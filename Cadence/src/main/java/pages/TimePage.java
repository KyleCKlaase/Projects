package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class timeSheet {
    private WebDriver driver;
    private By add = By.xpath("//button[@id='btnAdd']");
    private By selectingInput = By.xpath("(//input[@id='ddnProjects'])[2]");
    private By clickingCode = By.xpath("(//input[@id='ddnWorkCodes'])[2]");
    private By selectingCode = By.xpath("//div[@data-val='Intern - Automation']");
    private By selectTraining = By.xpath("//div[text()=' IST080-Inspired Testing - Training']");
    private By times = By.xpath("//div[@class='col-md-1']//span[text()='40.00']");
    private By Monday = By.xpath("//tr[@class='FirstRow'][2]//td[5]//input[@type='text']");
    private By Tuesday = By.xpath("//tr[@class='FirstRow'][2]//td[6]//input[@type='text']");
    private By Wednesday = By.xpath("//tr[@class='FirstRow'][2]//td[7]//input[@type='text']");
    private By Thursday  = By.xpath("//tr[@class='FirstRow'][2]//td[8]//input[@type='text']");
    private By Friday = By.xpath("//tr[@class='FirstRow'][2]//td[9]//input[@type='text']");
    private By Saturday  = By.xpath("//tr[@class='FirstRow'][2]//td[10]//input[@type='text']");
    private By sumMon = By.xpath("//span[contains(@class,'txtMon')]");
    private By sumTues = By.xpath("//span[contains(@class,'txtTue')]");
    private By sumWed = By.xpath("//span[contains(@class,'txtWed')]");
    private By sumThu = By.xpath("//span[contains(@class,'txtThu')]");
    private By sumFri = By.xpath("//span[contains(@class,'txtFri')]");
    private By load = By.xpath("//div[@class='loader']");

    public timeSheet(WebDriver driver) {
        this.driver = driver;

    }

    public void createProjectRow() {
        waitForPageToLoad();
       jsClick(add);
    }
    public void waitForPageToLoad(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement loadBar = driver.findElement(load);
        wait.until(ExpectedConditions.invisibilityOf(loadBar));
    }
    public void selectProjectName(){
       jsClick(selectingInput);
       jsClick(selectTraining);
    }
    public void selectWorkCode(){
        jsClick(clickingCode);
        jsClick(selectingCode);
    }
    public void sendTimes(){
        if(driver.findElement(sumMon).getText().equals("0")){
            driver.findElement(Monday).click();
            driver.findElement(Monday).sendKeys("8");
        }
        if(driver.findElement(sumTues).getText().equals("0")){
            driver.findElement(Tuesday).click();
            driver.findElement(Tuesday).sendKeys("8");
        }
        if(driver.findElement(sumWed).getText().equals("0")){
            driver.findElement(Wednesday).click();
            driver.findElement(Wednesday).sendKeys("8");
        }
        if(driver.findElement(sumThu).getText().equals("0")){
            driver.findElement(Thursday).click();
            driver.findElement(Thursday).sendKeys("8");
        }
        if(driver.findElement(sumFri).getText().equals("0")){
            driver.findElement(Friday).click();
            driver.findElement(Friday).sendKeys("8");
        }

        driver.findElement(Saturday).click();

    }
    public boolean timeCheck(){
        boolean time = driver.findElement(times).isDisplayed();
        System.out.println(time);
        return time;
    }
    private void jsClick(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
    }










}
