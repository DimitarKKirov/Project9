package steps.webShopEmag;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.pageObjectsEmag.LoginToEmag;
import pageObjects.pageObjectsEmag.SearchInEmag;

import java.util.Set;

public class EmagSearchForItems {

    LoginToEmag emagLoginPage;

    @Given("the user is on in {string}")
    public void the_user_is_logged_in_emag(String link) {
        emagLoginPage = MasterManager.getMasterManager().emagPageManager().loginToEmag();
        emagLoginPage.startBrowser(link, "headless");
        WebElement logo = emagLoginPage.getMsg();
        Assert.assertTrue(logo.isDisplayed());
    }

    @When("user enters search criteria {string}")
    public void userEntersSearchCriteria(String name) {
    SearchInEmag searchEmag = MasterManager.getMasterManager().emagPageManager().searchInEmag();
    searchEmag.enterInSearchField(name);
    searchEmag.clickSearch();
    }

    @Then("the user can see the results")
    public void the_user_can_see_the_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
