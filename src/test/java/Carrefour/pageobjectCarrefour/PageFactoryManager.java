package pageobjectCarrefour;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    WebDriver driver;
    private ProduitPage produitPage;
    private   ContactPage contactPage;
    private  HommeCarrefourPage hommeCarrefourPage;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public  HommeCarrefourPage getHommePage(WebDriver driver) {
        return hommeCarrefourPage== null ? new HommeCarrefourPage(driver) : hommeCarrefourPage;

    }

    public ProduitPage getProduitPage(WebDriver driver) {

        return produitPage== null ? new ProduitPage(driver) : produitPage;  }

    public ContactPage getContactPage(WebDriver driver) {

        return contactPage== null ? new ContactPage(driver) : contactPage;
    }
}
