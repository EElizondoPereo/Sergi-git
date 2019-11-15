package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import stepDefinitions.SetUpClass;

public class WomenArticles {
	public static WebDriver driver = SetUpClass.driver;
	public WomenArticles(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//li[@class = 'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
	//@FindBy(xpath = "//a[@title = 'Faded Short Sleeve T-shirts']")
	WebElement aProduct;
	@FindBy(xpath = "//a[@title='Add to cart']")
	WebElement aButton;
	public void addProduct() {
		Actions someActions = new Actions(driver);
		someActions.moveToElement(aProduct).perform();
		aButton.click();
		
		//someActions.moveToElement(aProduct).moveToElement(driver.findElement(By.linkText("Add to cart"))).click().build().perform();
		
	}
	public void addProductFromList() {
		List<WebElement> aListOfElements = aGridOfElements.findElements(By.xpath("//li/div[@class = 'product-container']"));
		Actions someActions = new Actions(driver);
		//WebElement anotherButton = aListOfElements.get(1).findElement(By.xpath("//div/a[@title = 'Add to cart']"));
		someActions.moveToElement(aListOfElements.get(1)).perform();
		WebElement anotherButton = aListOfElements.get(1).findElements(By.xpath("//a[@title = 'Add to cart']")).get(1);
		anotherButton.click();
	}
	
	@FindBy(xpath = "//span[@title = 'Continue shopping']")
	WebElement continueShopping;
	public void contShoppint() {
		continueShopping.click();
	}
	
	public void assertWAPage() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?id_category=3&controller=category",
				"Algo malo paso");
	}
	
	@FindBy(xpath = "//ul[@class = 'product_list grid row']")
	WebElement aGridOfElements;
	
	
	public void printNumberOfElemntos() { 
	    List<WebElement> aListOfElements = aGridOfElements.findElements(By.xpath("//li/div[@class = 'product-container']"));
		System.out.println(aListOfElements.size());
	}

}
