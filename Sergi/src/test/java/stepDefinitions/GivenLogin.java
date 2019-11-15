package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import pageObject.HomePage;
import pageObject.LogIn;

public class GivenLogin {
	public static WebDriver driver = SetUpClass.driver;
	HomePage hp;
	LogIn lg;

	@Given("User click on Sign in")
	public void user_click_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    hp = new HomePage(driver);
		hp.clickSignIn();

	    //throw new cucumber.api.PendingException();
	}
	
	@Given("User logs in")
	public void user_logs_in() {
		lg = new LogIn(driver);
		lg.logInToPage();
	}
	
	@Given("User selects tshirt")
	public void user_selects_tshirt() {
		Actions someAction = new Actions(driver);
		WebElement someElement = driver.findElement(By.xpath("//a[@title = 'Women']"));
		someAction.moveToElement(someElement).moveToElement(driver.findElement(By.xpath("//a[@title = 'T-shirts']"))).click();
	}


}
