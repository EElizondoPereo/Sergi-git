package apiStepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.restassured.specification.RequestSpecification;

public class ThenApiStep {
	
	@Then("User should get status code {int}")
	public void status_code(int code) {
		RequestSpecification request = SetUpClass.request;
		request.then().statusCode(code);
	}
	@Then("Response data should have an email")
	public void user_has_email() {
		String email = SetUpClass.resp.body().jsonPath().get("data[0].email").toString();
		System.out.println(SetUpClass.resp.body().jsonPath().get("data[0].email").toString());
		Assert.assertTrue(email.contains("@"));
	}

}
