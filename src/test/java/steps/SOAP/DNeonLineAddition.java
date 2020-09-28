package steps.SOAP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import mastePageManager.MasterManager;
import org.junit.Assert;
import pageObjects.SOAP.SoapTestingDneonLine;

public class DNeonLineAddition {

    SoapTestingDneonLine soapTestingDneonLine;
    Response response;


    @Given("user have access to the calculator at {string} and {string}")
    public void userHaveAccessTo(String link, String action) {
        soapTestingDneonLine = MasterManager.getMasterManager().soapTestingDneonLine();
        soapTestingDneonLine.connection(link, action);
    }

    @When("user enters integer {int} and {int} to be added")
    public void userEntersData(Integer int1, Integer int2) {
        response = soapTestingDneonLine.add(int1, int2);

    }

    @Then("the two numbers are calculated correctly")
    public void calculationResult() {
        System.out.println(response.getBody().prettyPrint());
    }
}
