package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductSteps extends DriverFactory {
/*	WebDriver driver;
	@Before()
	public void setup() throws IOException{
		System.setProperty("webdriver.gecko.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "\\src\\test\\java\\CucumberFramework\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
	
	@After()
	public void tearDown(){
		driver.manage().deleteAllCookies();
		driver.close();
	}*/
	

	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to_url(String url) throws Throwable {
		Thread.sleep(3000);
		getDriver().get(url);
		Thread.sleep(3000);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String locator) throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector(locator)).click();
		Thread.sleep(3000);
	}

	@Then("^user should be presented with promo alert$")
	public void user_should_be_presented_with_promo_alert() throws Throwable {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();
	}

}

