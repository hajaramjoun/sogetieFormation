package Carrefour.context;




import Carrefour.domainObjects.Cookies;
import org.openqa.selenium.WebDriver;
import pageobjectCarrefour.PageFactoryManager;

import java.io.IOException;

public class TestContext {
    public WebDriver driver;
public  PageFactoryManager pageFactoryManager;
//    public TestContext(WebDriver driver, Cookies cookies) {
//        this.driver = driver;
////        this.pageFactoryManager = new PageFactoryManager(this.driver);
//        this.cookies = cookies;
//    }

   public Cookies cookies;
//    public ProductList productList = new ProductList();
//    public Product product;

    public TestContext() throws IOException {
         cookies = new Cookies();
        cookies.set(new io.restassured.http.Cookies());
        this.pageFactoryManager = new PageFactoryManager(this.driver);

    }
}
