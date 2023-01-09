package pageobjectCarrefour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HommeCarrefourPage extends BasePage {
    public HommeCarrefourPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#data-accountt")
    WebElement elementbonnehomme;
    @FindBy(css = "#data-mes-listes")
       WebElement elementProduit;
    @FindBy(css = "[href='/mon-compte/inscription']")
    WebElement elementMonCompte;
    @FindBy(css = "#data-help")
    WebElement elementHelp;
    @FindBy(css = "#onetrust-reject-all-handler")
    WebElement elementRefuseCookies;
        public HommeCarrefourPage clickBonnehomme() {
        clickElementFluentWait(elementbonnehomme,driver);


            return this;

        }

    public IncriptionPage clickMycompte() {
        clickElementFluentWait(elementMonCompte,driver);
        return null;
    }

    public void clickContact() {
        clickElementFluentWait(elementHelp,driver);
    }

    public void clickProduit() {

        clickElementFluentWait(elementProduit,driver);
    }

    public void clickRefuseCokies() {
            clickElementFluentWait(elementRefuseCookies,driver);
    }
}
