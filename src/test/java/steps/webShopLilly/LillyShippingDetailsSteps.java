package steps.webShopLilly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.pageObjectLillyShop.LillyHomeProductsListsPage;
import pageObjects.pageObjectLillyShop.LillyShippingDetailsPage;

public class LillyShippingDetailsSteps {

    LillyShippingDetailsPage shippingDetails;

    @Given("and clicks checkout")
    public void clickCheckOut() {
        LillyHomeProductsListsPage cartPage = MasterManager.getMasterManager().lillyPageManager().lillyHomeProductsListsPage();
        cartPage.clickCheckOut();
    }

    @When("user fill the necessary Data {string},{string},{string},{string},{string} and {string}")
    public void fillNecessaryData(String name, String lastName, String phone, String city, String email, String office) {

        shippingDetails = MasterManager.getMasterManager().lillyPageManager().lillyShippingDetailsPage();
        shippingDetails.createWait(5).until(ExpectedConditions.textToBePresentInElement(shippingDetails.getStepTitle(), "Адрес за доставка"));
        shippingDetails.enterEmailToRegister(email);
        shippingDetails.fieldFirstName(name);
        shippingDetails.fieldLastName(lastName);
        shippingDetails.fieldPhone(phone);
        shippingDetails.enterCity(city);
        WebElement elementCity = shippingDetails.createWait(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-select2-id=\"11\"]")));
        shippingDetails.moveToElement(elementCity);
        shippingDetails.clickElement(elementCity);
        shippingDetails.enterAddressShipmentOffice(office);
        WebElement elementOffice = shippingDetails.createWait(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-select2-id=\"23\"]")));
        shippingDetails.moveToElement(elementOffice);
        shippingDetails.clickElement(elementOffice);


    }

    @When("pres submit button")
    public void pressContinue() {
//        shippingDetails.moveToElement(shippingDetails.getStepTitle());
        WebElement radioShipping = shippingDetails.createWait(5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value=\"extensaspeedy_speedy_505\"]")));
        shippingDetails.clickElement(radioShipping);
        shippingDetails.clickContinue();
    }

    @Then("the user is redirected to the payment page")
    public void redirectedToPaymentPage() {
        shippingDetails.createWait(7).until(ExpectedConditions.textToBePresentInElement(shippingDetails.getPageTitleElement(), "Поръчай | Лили Дрогерие"));
        shippingDetails.quitBrowser();
    }
}
