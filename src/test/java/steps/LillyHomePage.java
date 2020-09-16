package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LillyHomePage {


    @Given("user is on {string}")
    public void userIsOn(String homePage) {
    //start driver and go to webpage

    }

    @When("user click on Вход button")
    public void clickEnterButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user is redirected to the login page of Lilly website")
    public void the_user_is_redirected_to_the_login_page_of_lilly_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
