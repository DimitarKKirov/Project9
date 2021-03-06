package steps.webShopLilly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.pageObjectLillyShop.LillyHomePage;

public class LillyHomePageSteps {

    LillyHomePage lillyHomePage;

    @Given("user is on Home Page {string}")
    public void userIsOn(String homePage) {
        lillyHomePage = MasterManager.getMasterManager().lillyPageManager().lillyHomePage();
        lillyHomePage.startBrowser(homePage,"chrome");
        String title = lillyHomePage.getPageTitle();
        Assert.assertEquals("Лили Дрогерие онлайн магазин | Лили Дрогерие", title);
    }

    @When("user click on Вход button")
    public void clickEnterButton() {
        lillyHomePage.clickLogin();
    }

    @Then("the user is redirected to the login page of Lilly website")
    public void redirectionToLoginPage() {
        String title = lillyHomePage.getPageTitle();
        Assert.assertEquals("Вход | Лили Дрогерие", title);
        lillyHomePage.quitBrowser();
    }


}
