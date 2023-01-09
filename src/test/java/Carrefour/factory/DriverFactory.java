package factory;

;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigLoader;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ConfigLoader.getPropritiesFile("src/test/resources/baseUrlconfig.properties","baseUrl"));
        driver.manage().window().maximize();
        return driver;
    }
}
