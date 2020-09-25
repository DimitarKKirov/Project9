package steps.REST;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import mastePageManager.MasterManager;
import org.json.simple.JSONObject;
import pageObjects.REST.DummyRestApiExample;

import static io.restassured.RestAssured.*;

public class CreatingEmployeesStep {
    private DummyRestApiExample rest;

    @Given("user have access to {string}")
    public void user_have_access_to(String url) {
      rest =  MasterManager.getMasterManager().dummyRestApiExample();
      rest.checkAccess(url);
    }

    @When("user enter {string},{string},{string}")
    public void user_enter_and_not_necessarily(String name, String salary, String age) {
        rest.createEmployee(name, salary, age);
    }

    @Then("the user will create new entry in DB")
    public void the_user_will_create_new_entry_in_db() {
    rest.getAllEmployees();
    }

}
