package stepCarrito;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class GivenCarrito {
	public static WebDriver driver;
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("User Opens the Browser");
	    //throw new cucumber.api.PendingException();
	}

	@Given("User navigate to the following page {string}")
	public void user_navigate_to_the_following_page_http_automationpractice_com_index_php(String mainPage) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(mainPage);
		System.out.println(mainPage);
	}
	
	@Given("User selects tshirt")
	public void user_selects_tshirt() {
		Actions someAction = new Actions(driver);
		WebElement someElement = driver.findElement(By.xpath("//a[@title = 'Women']"));
		someAction.moveToElement(someElement).moveToElement(driver.findElement(By.xpath("//a[@title = 'T-shirts']"))).click();
	}

}
