package steps.webShopLilly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pManagers.shopLilly.LillyRegularsElements;
import pageObjects.pageObjectLillyShop.LillyHomePage;
import pageObjects.pageObjectLillyShop.LillyLoginPage;

public class LillyLoginPageSteps {

    private WebDriver driver1;
    private LillyLoginPage lillyLoginPage;

    @Given("the user is on the {string} page")
    public void loginPage(String pageLink) {
        lillyLoginPage = MasterManager.getMasterManager().lillyPageManager().lillyLoginPage();
        lillyLoginPage.startBrowser(pageLink,"chrome");
        String title = lillyLoginPage.getPageTitle();
        Assert.assertEquals("Вход | Лили Дрогерие", title);
    }

    @When("user enters the correct {string} and {string}")
    public void FiledFilling(String username, String password) {
        lillyLoginPage.emailField(username);
        lillyLoginPage.passField(password);

    }

    @When("clicks on button Вход")
    public void clicksButtonLogin() {
        lillyLoginPage.clickLogin();
    }

    @Then("user is successfully logged in")
    public void successfullyLoggedIn() {
        String title = lillyLoginPage.getPageTitle();
        Assert.assertEquals("Лили Дрогерие онлайн магазин | Лили Дрогерие", title);
        lillyLoginPage.quitBrowser();
    }
}
