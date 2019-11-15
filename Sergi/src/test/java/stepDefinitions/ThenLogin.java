package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.WomenArticles;

public class ThenLogin {
	public static WebDriver driver = SetUpClass.driver;
	WomenArticles wa;
	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account", "Me la pelas");
		System.out.println("User should be in profile page");
	    //throw new cucumber.api.PendingException();
	}
	
	@Then("User gets an error message {string}")
	public void user_gets_an_error_message(String errorMessage){
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'alert alert-danger']//child::ol//child::li")).getText(), errorMessage , "Me la pelas");
	}
	
	@Then("User should be in Store page")
	public void user_in_store_page() {
		wa = new WomenArticles(driver);
		//wa.printNumberOfElemntos();
		wa.assertWAPage();
	}
}
