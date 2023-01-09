package Carrefour.steps;

import Carrefour.context.TestContext;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjectCarrefour.ContactPage;
import pageobjectCarrefour.PageFactoryManager;


public class ContactStep {
    private ContactPage contactPage;
    private  TestContext context;


    public ContactStep( TestContext context) {
        System.out.println("constructeur Contact");
        this.contactPage =context.pageFactoryManager.getContactPage(context.driver);
    }

    @And("verifier  l apparition  de la page Contact")
    public void verifierLApparitionDeLaPageContact() {
        contactPage.verifierLaPageContact();


    }
}
