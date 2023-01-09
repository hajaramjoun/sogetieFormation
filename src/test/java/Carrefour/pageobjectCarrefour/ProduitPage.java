package pageobjectCarrefour;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProduitPage extends BasePage {


    public ProduitPage(WebDriver driver) {
        super(driver);
    }

    public void verifierLaPageProduit() {
        driver.getPageSource().contains("Vous les aimez, vous allez les adorer en promo");
    }
}
