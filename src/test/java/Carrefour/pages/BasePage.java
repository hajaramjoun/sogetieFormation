package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;


public class BasePage {

    protected WebDriverWait wait;
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void load(String endPoint){
        driver.get(ConfigLoader.getPropritiesFile("src/main/resources/baseUrlconfig.properties","baseUrl")+ endPoint);
    }
    public void clickElementFluentWait(WebElement webElement, WebDriver driver) {
        WebElement linkBoutton = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        linkBoutton.click();

    }

    protected void sendKeyElementFluentWait(WebElement webElement, WebDriver driver, String input) throws InterruptedException {
        WebElement linkBoutton = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        linkBoutton.click();
        linkBoutton.clear();
        for (int i = 0; i < input.length(); i++) {
            linkBoutton.sendKeys(String.valueOf(input.charAt(i)));
            Thread.sleep(10);
        }
    }


}
