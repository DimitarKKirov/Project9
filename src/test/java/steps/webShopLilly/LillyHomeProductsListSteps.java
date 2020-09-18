package steps.webShopLilly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.pageObjectLillyShop.LillyHomePage;
import pageObjects.pageObjectLillyShop.LillyHomeProductsListsPage;
import pageObjects.pageObjectLillyShop.LillyLoginPage;

public class LillyHomeProductsListSteps {

    LillyHomeProductsListsPage lillyHomeProducts;

    @Given("the user is on the {string}")
    public void homePage(String homePage) {
        lillyHomeProducts = MasterManager.getMasterManager().lillyPageManager().lillyHomeProductsListsPage();
        lillyHomeProducts.startBrowser(homePage, "chrome");
        String title = lillyHomeProducts.getPageTitle();
        Assert.assertEquals("Лили Дрогерие онлайн магазин | Лили Дрогерие", title);
    }

    @Given("the user is logged in with {string} and {string}")
    public void loggedIn(String email, String pass) {
        LillyHomePage home = MasterManager.getMasterManager().lillyPageManager().lillyHomePage();
        LillyLoginPage lillyLogIn = MasterManager.getMasterManager().lillyPageManager().lillyLoginPage();
        home.clickLogin();
        lillyLogIn.emailField(email);
        lillyLogIn.passField(pass);
        lillyLogIn.clickLogin();
    }

    @When("the user clicks Home products from the left had menu")
    public void goToHomeProducts() {

        lillyHomeProducts.selectAllProductSubMenuElement("Продукти за дома");
    }

    @Then("the user is redirected to the shop list with the corresponding items")
    public void enterShopListHomeItemsPage() {
        String title = lillyHomeProducts.getPageTitle();
        Assert.assertEquals("Продукти за дома | Лили Дрогерие", title);
        lillyHomeProducts.createWait(5000);
        lillyHomeProducts.quitBrowser();
    }

    @Given("user is in Home products {string}")
    public void productsShoppingList(String shoppingListLink) {
        lillyHomeProducts = MasterManager.getMasterManager().lillyPageManager().lillyHomeProductsListsPage();
        lillyHomeProducts.startBrowser(shoppingListLink, "chrome");
        String title = lillyHomeProducts.getPageTitle();
        Assert.assertEquals("Продукти за дома | Лили Дрогерие", title);
    }

    @Given("add items to the basket")
    public void addItemsToBasket() {
        try {
            lillyHomeProducts.clickFirstItemOfList();
        Thread.sleep(2000);

        lillyHomeProducts.clickSecondItemOfList();
    }catch (InterruptedException e){
        e.printStackTrace();
        }
    }

    @Given("the total price is calculated correctly for the items in the basket")
    public void basketTotalPriceIsCorrect() {
        lillyHomeProducts.createWait(5).until(ExpectedConditions.textToBePresentInElement(lillyHomeProducts.getPriceOfCart(), "7,58 лв."));


    }

    @When("the user clicks the basket")
    public void enterBasket() {
        lillyHomeProducts.openCart();
    }

    @Then("the user is redirected to the shopping cart")
    public void redirectedToShoppingCart() {
        lillyHomeProducts.createWait(5).until(ExpectedConditions.textToBePresentInElement(lillyHomeProducts.getPageTitleElement(),"Вашата количка | Лили Дрогерие"));
        lillyHomeProducts.quitBrowser();
    }
}
