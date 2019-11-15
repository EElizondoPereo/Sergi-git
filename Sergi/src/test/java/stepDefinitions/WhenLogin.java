package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import pageObject.LogIn;
import pageObject.MyPage;
import pageObject.WomenArticles;

public class WhenLogin {
	public static WebDriver driver = SetUpClass.driver;
	LogIn lg;
	MyPage mp;
	WomenArticles wa;
	
	@When("User enter valid email address {string}")
	public void user_enter_valid_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		lg = new LogIn(driver);
		lg.sendEmail(email);
		
		System.out.println("User enters valid email address");
	    //throw new cucumber.api.PendingException();
	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		lg.sendPass(password);
		System.out.println("User enter valid password");

	    //throw new cucumber.api.PendingException();
	}

	@When("Useer clicks sign in button")
	public void useer_clicks_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		lg.clickSignIn();
		System.out.println("User clicks sign in button");

	    //throw new cucumber.api.PendingException();
	}
	
	@When ("User clicks on Women button")
	public void user_clicks_women() {
		mp = new MyPage(driver);
		mp.clickWomen();
	}
	@When("User clicks on product")
	public void user_clicks_product() {
		wa = new WomenArticles(driver);
		wa.addProductFromList();
	}
	@When("User continues shopping")
	public void continue_shopping() {
		wa.contShoppint();
	}
	
}
