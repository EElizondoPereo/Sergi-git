package apiStepDef;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class WhenApiStep {
	String parameterName;
	@When("User sends a get request to {string}")
	public void user_sends_get_request(String req) {
		Response resp;
		//RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = SetUpClass.request;
		
		resp = request.when().get(req);
		SetUpClass.resp = resp;
		System.out.println(resp.body().jsonPath().get("data[0].first_name").toString());
		//request.then().statusCode(200);
		}
	/*@When("User sends a parameter name {string}")
	public void user_sends_parameter_name(String param) {
		parameterName = param;
	}
	@When("User sends a parameter value {int}")
	public void user_sends_parameter_value(int param) {
		RequestSpecification request = SetUpClass.request;
		request.pathParam(parameterName, param);
	}*/
	@When("User sends a get request with param {string}")
	public void user_sends_get_request_with_param(String req) {
		Response resp;
		//RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = SetUpClass.request;
		
		resp = request.when().get(req + "/{" + GivenApiStep.parameterName + "}");
		SetUpClass.resp = resp;
		System.out.println(resp.body().toString());
		//request.then().statusCode(200);
		}
}
