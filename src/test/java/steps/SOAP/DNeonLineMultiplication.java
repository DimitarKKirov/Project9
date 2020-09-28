package steps.SOAP;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import mastePageManager.MasterManager;
import pageObjects.SOAP.SoapTestingDneonLine;

public class DNeonLineMultiplication {

    SoapTestingDneonLine soapTestingDneonLine;
    Response result;


    @When("user enters integer {int} and {int} that are to be multiplied")
    public void userEntersIntegerValuesTMultiplied(Integer int1, Integer int2) {
        soapTestingDneonLine = MasterManager.getMasterManager().soapTestingDneonLine();
        result = soapTestingDneonLine.multiply(int1, int2);
    }

    @Then("the two numbers are calculated correctly by the multiply function")
    public void result() {
        result.getBody()
                .prettyPrint();
    }
}
