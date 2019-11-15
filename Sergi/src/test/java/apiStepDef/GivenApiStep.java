package apiStepDef;

import io.cucumber.java.en.Given;
import io.restassured.specification.RequestSpecification;

public class GivenApiStep {
	static String parameterName;
	@Given("User sends a parameter name {string}")
	public void user_sends_parameter_name(String param) {
		parameterName = param;
	}
	@Given("User sends a parameter value {int}")
	public void user_sends_parameter_value(int param) {
		RequestSpecification request = SetUpClass.request;
		request.pathParam(parameterName, param);
	}

}
