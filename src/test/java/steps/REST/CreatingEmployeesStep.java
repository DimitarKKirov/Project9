package steps.REST;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import pageObjects.REST.DummyRestApiExample;


public class CreatingEmployeesStep {
    private DummyRestApiExample rest;

    @Given("user have access to {string}")
    public void userHaveAccessTo(String url) {
      rest =  MasterManager.getMasterManager().dummyRestApiExample();
      rest.checkAccess(url);
    }

    @When("user enter {string},{string},{string}")
    public void enterData(String name, String salary, String age) {
        rest.createEmployee(name, salary, age);
    }

    @Then("the user will create new entry in DB")
    public void verificationOfCreation() {
    rest.getAllEmployees();
    }

}
