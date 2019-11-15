package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/carrito",
		glue = {"stepCarrito"},
		tags = "not @ignore"
		)

public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
