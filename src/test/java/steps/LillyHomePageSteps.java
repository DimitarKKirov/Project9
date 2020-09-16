package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.Drivers;
import pageObjects.pageObjectLillyShop.LillyHomePage;

public class LillyHomePageSteps {
    WebDriver driver;
    LillyHomePage lillyHomePage;

    @Given("user is on Home Page {string}")
    public void userIsOn(String homePage) {
        driver = Drivers.startBrowser(homePage, "chroem");
        lillyHomePage = MasterManager.getMasterManager().lillyMasterPage(driver).lillyHomePage();
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
        lillyHomePage.closeBrowser();
    }


}
