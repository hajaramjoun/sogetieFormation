package Carrefour.myHooks;

import Carrefour.context.TestContext;
import factory.DriverFactory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;
    private final TestContext context;


    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void before(Scenario scenario) {
        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = DriverFactory.init();
        context.driver = driver;
    }



    @After
    public void after(Scenario scenario) {
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver.quit();

    }
}
