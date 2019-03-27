package Test.Actions;

import Test.Actions.Selectors.selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class action extends selectors {
    WebDriver driver;

    public void navigateURL(String URL){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 3");
        driver = new ChromeDriver();
        driver.navigate().to(URL);

    }

    public void waitDriverSec(int sec){
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public void login(){
        driver.findElement(By.cssSelector(email)).sendKeys("iamgoingtojob@gmail.com");
        driver.findElement(By.cssSelector(next)).click();

    }

    public void password(){
        driver.findElement(By.cssSelector(password)).sendKeys("3765897wnm");
        driver.findElement(By.cssSelector(enter)).click();
    }

    public void composeEmail() {
        driver.findElement(By.cssSelector(composeButton)).click();
        driver.findElement(By.cssSelector(to)).sendKeys("iamgoingtojob@gmail.com");
        driver.findElement(By.cssSelector(subject)).sendKeys("e-mail");
        driver.findElement(By.cssSelector(message)).sendKeys("I am sending you a test message and have a nice day");
        driver.findElement(By.cssSelector(sendButton)).click();
        //(new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(sendButton)));
        driver.findElement(By.cssSelector(logoutIcon)).click();
        driver.findElement(By.cssSelector(logout)).click();
    }

    public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
