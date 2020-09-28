package pageObjects.SOAP;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


public class SoapTestingDneonLine {


    public void connection(String api, String action) {
        RestAssured.baseURI = api;
        String paperAdd = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
                "  <soap12:Body>" +
                "    <Add xmlns=\"http://tempuri.org/\">" +
                "      <intA>" + 1 + "</intA>" +
                "      <intB>" + 2 + "</intB>" +
                "    </Add>" +
                "  </soap12:Body>" +
                "</soap12:Envelope>";

        Response check = RestAssured.given().request().contentType("text/xml;charset=UTF-8;").body(paperAdd)
                .header(action, action, "Content-Type", "text/xml").when().post();

        Assert.assertEquals(200, check.getStatusCode());
    }


    public Response add(int firstNumber, int secondNumber) {

        RequestSpecification spec = RestAssured.given();
        RestAssured.baseURI = "http://www.dneonline.com/calculator.asmx?WSDL";
        //envelope
        String paperAdd = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
                "  <soap12:Body>" +
                "    <Add xmlns=\"http://tempuri.org/\">" +
                "      <intA>" + firstNumber + "</intA>" +
                "      <intB>" + secondNumber + "</intB>" +
                "    </Add>" +
                "  </soap12:Body>" +
                "</soap12:Envelope>";

        Response xml = spec.request()
                .contentType("text/xml; charset=UTF-8;").body(paperAdd)
                .header("Add", "Add", "Content-Type", "text/xml")
                .when().post();
        Assert.assertNotNull(xml);
        return xml;

    }

    public Response subtracted(int firstNumber, int secondNumber) {

        RequestSpecification spec = RestAssured.given();
        RestAssured.baseURI = "http://www.dneonline.com/calculator.asmx?WSDL";
        //envelope
        String paperAdd = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
                "  <soap12:Body>" +
                "    <Subtract xmlns=\"http://tempuri.org/\">\n" +
                "      <intA>" + firstNumber + "</intA>" +
                "      <intB>" + secondNumber + "</intB>" +
                "    </Subtract>" +
                "  </soap12:Body>" +
                "</soap12:Envelope>>";

        Response xml = spec.request()
                .contentType("text/xml; charset=UTF-8;").body(paperAdd)
                .header("Subtract", "Subtract", "Content-Type", "text/xml")
                .when().post();
        Assert.assertNotNull(xml);
        return xml;

    }

    public Response multiply(int firstNumber, int secondNumber) {

        RequestSpecification spec = RestAssured.given();
        RestAssured.baseURI = "http://www.dneonline.com/calculator.asmx?WSDL";
        //envelope
        String paperAdd = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
                "  <soap12:Body>" +
                "    <Multiply xmlns=\"http://tempuri.org/\">" +
                "      <intA>" + firstNumber + "</intA>" +
                "      <intB>" + secondNumber + "</intB>" +
                "    </Multiply>" +
                "  </soap12:Body>" +
                "</soap12:Envelope>";

        Response xml = spec.request()
                .contentType("text/xml; charset=UTF-8;").body(paperAdd)
                .header("Subtract", "Subtract", "Content-Type", "text/xml")
                .when().post();
        Assert.assertNotNull(xml);
        return xml;

    }
}
