package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basket<HomePage> {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 20;


    public Basket(WebDriver driver) {
        this.driver = driver;

    }
     public  Basket verifierElementDetail(){
         driver.getPageSource().contains("Product");
         driver.getPageSource().contains("Price");
         driver.getPageSource().contains("Quantity");
         driver.getPageSource().contains("Total");
         driver.quit();
         return new Basket(driver);

     }






}