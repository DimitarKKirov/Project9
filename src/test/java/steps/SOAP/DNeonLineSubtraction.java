package steps.SOAP;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import mastePageManager.MasterManager;
import pageObjects.SOAP.SoapTestingDneonLine;


public class DNeonLineSubtraction {

    SoapTestingDneonLine soapTestingDneonLine;
    Response result;

    @When("user enters integer {int} and {int} that are to be subtracted")
    public void passingValues(Integer int1, Integer int2) {
        soapTestingDneonLine = MasterManager.getMasterManager().soapTestingDneonLine();
        result = soapTestingDneonLine.subtracted(int1, int2);

    }

    @Then("the two numbers are calculated correctly by the function")
    public void printingOutTheResult() {
        result.getBody().prettyPrint();
    }
}
