package pageObjects.REST;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;


public class DummyRestApiExample {


    public void checkAccess(String url) {

        RequestSpecification request = RestAssured.given();
        Response response = request.request(Method.GET, url);
        Assert.assertEquals(200, response.getStatusCode());
        System.out.println(response.getStatusCode());

    }

    public void getAllEmployees() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        RequestSpecification request = RestAssured.given();

        Response response = request.request(Method.GET, "/employees");

        String body = response.getBody().asString();
        System.out.println(body);
    }

    public void createEmployee(String name, String salary, String age) {

        RestAssured.baseURI = "http://dummy.restapiexample.com/";

        RequestSpecification request = RestAssured.given();

        JSONObject req = new JSONObject();
        //parameters for new entry
        req.put("name",name);
        req.put("salary",salary);
        req.put("age",age);

        request.header("Content-Type", "application/json");

        //putting the parameters in to the request
        request.body(req.toJSONString());
        //response object
        Response response = request.request(Method.POST, "api/v1/create");

        String resBody = response.getBody().asString();
        int statusCode = response.statusCode();
        Assert.assertEquals(200,statusCode);
        System.out.println(resBody);
        Assert.assertTrue(resBody.contains(name));
        Assert.assertTrue(resBody.contains(salary));
        Assert.assertTrue(resBody.contains(age));


    }

    public void deleteByID(String id){
        RestAssured.baseURI = "http://dummy.restapiexample.com/";

        RequestSpecification request = RestAssured.given();

        Response response = request.request(Method.DELETE,"api/v1/delete/"+ id);



        String resBody = response.getBody().asString();
        System.out.println(resBody);
        int statusCode = response.statusCode();
        Assert.assertEquals(200,statusCode);

    }

    public void getEmployeesById(String id) {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/";

        RequestSpecification request = RestAssured.given();

        Response response = request.request(Method.GET, id);

        String body = response.getBody().asString();
        System.out.println(body);

    }
}
