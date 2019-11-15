package apiStepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetUpClass {
	public static RequestSpecification request;
	public static Response resp;
	@Before()
	public void setUP() {
		RestAssured.baseURI = "https://reqres.in/";
		request = RestAssured.given();
		
	}
	@After()
	public void teardown() {
		
	}

}
