package pages;

import domainObjects.PersonneDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(id = "password") private WebElement idSelectorPasswordLogin;
    @FindBy(id = "username") private WebElement idSelectorUsernameLogin;
    @FindBy(id = "reg_password") private WebElement idSelectorRegistrePassword;
    @FindBy(id = "reg_email") private WebElement idSelectorRegEmail;

    @FindBy(css= "div.woocommerce > nav > ul>li") private WebElement cssSelectorFileAriane;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(1)") private WebElement cssSelectorFileArianeDashbord;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(2)") private WebElement cssSelectorFileArianeOrders;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(3)") private WebElement cssSelectorFileArianeDownloads;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(4)") private WebElement cssSelectorFileArianeAddresses;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(5)") private WebElement cssSelectorFileArianeAccountDetails;
    @FindBy(css= "div.woocommerce > nav > ul>li:nth-child(6)") private WebElement cssSelectorFileArianeAccountLogout;
    @FindBy(css= "[value='Register']") private WebElement regiterWebElement;
    @FindBy(css= "[value='Login']") private WebElement loginWebElement;




    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage remplireformulaireregistre(String email, String psw) throws InterruptedException {

        //// Remplire le champs E-mail
        sendKeyElementFluentWait(idSelectorRegEmail,driver,email);
        sendKeyElementFluentWait(idSelectorRegistrePassword,driver,email);
        clickElementFluentWait(regiterWebElement,driver);
        return this;
    }



    public String verifierCreationDeCompte() {
        return driver.getPageSource();
    }

    public MyAccountPage verifierDashboardLiens(String link, String categorie) {
        WebElement lienElement = driver.findElement(By.cssSelector("li.woocommerce-MyAccount-navigation-link>a[href="+link+"]"));
        System.out.println(lienElement.getText());
        clickElementFluentWait(lienElement,driver);
        return this;

    }


    public MyAccountPage remplirEtValiderLeformulaireLogin(PersonneDetails personneDetails) throws InterruptedException {
        //// Remplire le champs username or email
        sendKeyElementFluentWait(idSelectorUsernameLogin,driver,personneDetails.getLogin());
        sendKeyElementFluentWait(idSelectorPasswordLogin,driver,personneDetails.getPassword());
        clickElementFluentWait(loginWebElement,driver);
        return this;
    }
}
