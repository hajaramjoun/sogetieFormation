package Carrefour.steps;

import Carrefour.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HomeStep {

    private  TestContext context;
    private  pageobjectCarrefour.HommeCarrefourPage homePageCarrefour;


    public HomeStep(TestContext context) {
        this.context = context;
        System.out.println("constructeur home");
        this.homePageCarrefour =context.pageFactoryManager.getHommePage(context.driver);

//        homePageCarrefour = new HommeCarrefourPage(context.driver);
    }





    @Given("je suis   à la page de l'acueil de carrefour")
    public void jeSuisÀLaPageDeLAcueilDeCarrefour() {

    }

    @When("click sur  l'inscription")
    public void clickSurLInscription() {
        homePageCarrefour.clickRefuseCokies();

//        homePageCarrefour.clickBonnehomme().clickMycompte();
    }




    @When("click sur  mes contact")
    public void clickSurMesContact() {
        homePageCarrefour.clickRefuseCokies();
        homePageCarrefour.clickContact();
    }





    @When("click sur  mes produits")
    public void clickSurMesProduits() {
        homePageCarrefour.clickRefuseCokies();
        homePageCarrefour.clickProduit();
    }
}
