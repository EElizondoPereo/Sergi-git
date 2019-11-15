package stepCarrito;

import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhenCarrito {
	WebDriver driver = GivenCarrito.driver;
	@When("User clics add to cart")
	public void user_clics_add_to_cart(){
		driver.findElement(By.xpath("//a[@title = 'Add to cart']")).click();
	}
}
