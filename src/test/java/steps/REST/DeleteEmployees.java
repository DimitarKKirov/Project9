package steps.REST;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mastePageManager.MasterManager;
import pageObjects.REST.DummyRestApiExample;

public class DeleteEmployees {
    private DummyRestApiExample rest;
    @When("user gives {string} of the employees")
    public void deleteEmployee(String id) {

        rest =  MasterManager.getMasterManager().dummyRestApiExample();
        rest.deleteByID(id);

    }

    @Then("the employees who are with this {string} are deleted")
    public void searchAndVerify(String id) {
      rest.getEmployeesById(id);

    }
}
