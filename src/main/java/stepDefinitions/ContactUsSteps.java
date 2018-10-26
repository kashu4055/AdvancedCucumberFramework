package stepDefinitions;

//import java.nio.file.Paths;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;*/
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

import org.junit.Assert;

public class ContactUsSteps extends DriverFactory {
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
	
	@Given("^I navigate to google$")
	public void i_navigate_to_google() throws Throwable{
	Thread.sleep(3000);	
	getDriver().get("http://www.google.com");
	Thread.sleep(3000);	
	}
	
	@Given("^I acces webdriveruniversity contact us form$")
	public void i_acces_webdriveruniversity_contact_us_form() throws Throwable {
		Thread.sleep(3000);
		getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		Thread.sleep(3000);
	}

	@When("^I enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws Throwable {
		Thread.sleep(3000);
	    getDriver().findElement(By.cssSelector("input[name = 'first_name']")).sendKeys("Sjakie");;
	}

	@When("^I enter a valed lastname$")
	public void i_enter_a_valed_lastname(DataTable DataTable) throws Throwable {
		Thread.sleep(3000);
	    List<List<String>> data = DataTable.raw();
	    getDriver().findElement(By.cssSelector("input[name = 'last_name']")).sendKeys(data.get(0).get(1));
	}

	@When("^I enter a valid email adress$")
	public void i_enter_a_valid_email_adress() throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("input[name = 'email']")).sendKeys("Sjakie@email.com");
	}

	@When("^I enter comments$")
	public void i_enter_comments(DataTable DataTable) throws Throwable {
		Thread.sleep(3000);
		List<List<String>> data = DataTable.raw();
		getDriver().findElement(By.cssSelector("textarea[name = 'message']")).sendKeys(data.get(0).get(0));
		getDriver().findElement(By.cssSelector("textarea[name = 'message']")).sendKeys(data.get(0).get(1));
	}


	@When("^I click on the sumbit button$")
	public void i_click_on_the_sumbit_button() throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//input[@value = 'SUBMIT']")).click();
	}

	@Then("^the information should succesfully been submitted via the contact us form$")
	public void the_information_should_succesfully_been_submitted_via_the_contact_us_form() throws Throwable {
		WebElement thanksContactusPage = getDriver().findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		Assert.assertEquals("thankyouforyourmessage!", thanksContactusPage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
	}

}
