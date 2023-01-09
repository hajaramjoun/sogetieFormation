package pageobjectCarrefour;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public void verifierLaPageContact() {
        driver.getPageSource().contains(" Aide & contact");
    }
}
