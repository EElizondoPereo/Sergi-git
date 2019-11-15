package restExample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestExample {
	@Test(enabled = false)
	public void Test1() {
		Response resp;
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		resp = request.when().get("/api/users");
		request.then().statusCode(200);
		
		System.out.println(resp.body().jsonPath().get("data[0].first_name").toString());
	}
	
	@Test()
	public void Test2() {
		Response resp;
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		request.pathParam("id", 1);
		resp = request.when().get("/api/users/{id}");
		request.then().statusCode(200);
		System.out.println(resp.body().asString());
	}
}
