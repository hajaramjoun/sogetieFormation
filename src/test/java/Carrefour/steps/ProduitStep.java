package Carrefour.steps;

import Carrefour.context.TestContext;
import io.cucumber.java.en.And;
import pageobjectCarrefour.PageFactoryManager;
import pageobjectCarrefour.ProduitPage;

public class ProduitStep {
    private  TestContext context;

    private  ProduitPage produitPage;

    public ProduitStep(TestContext context) {
        this.context = context;
        this.produitPage =context.pageFactoryManager.getProduitPage(context.driver);
    }


    @And("verifier  l apparition  de la page des produits")
    public void verifierLApparitionDeLaPageDesProduits() {
        produitPage.verifierLaPageProduit();

    }

}
