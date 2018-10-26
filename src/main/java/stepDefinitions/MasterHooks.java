package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	
	@Before
	public void setup(){
		driver = getDriver();							//when getting errors after importing DriverFactory, choose alternate JRE in build path
	}
	
	
	@After
	public void TearDown(){
		if (driver != null){ 							//driver is in use
			driver.manage().deleteAllCookies();
			driver.quit();							    //closes browser window when steps have ended
		}
}



}
