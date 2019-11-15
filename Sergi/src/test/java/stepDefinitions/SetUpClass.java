package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUpClass {
	
	public static WebDriver driver;
	
	@Before()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After()
	public void teardown() {
		driver.close();
		driver.quit();
		
	}

}