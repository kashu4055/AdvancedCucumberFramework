package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends BasePage {
	
	public @FindBy(xpath = "//input[@name = 'first_name']") WebElement textfield_firstName; 
	public @FindBy(xpath = "//input[@name = 'last_name']") WebElement textfield_lastName;
	public @FindBy(xpath = "//input[@name = 'email']") WebElement textfield_emailAddress; 
	public @FindBy(xpath = "//textarea[@name = 'message']") WebElement textfield_Message; 
	public @FindBy(xpath = "//input[@value = 'SUBMIT']") WebElement button_Submit;
	public ContactUs_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		//test git
	}

}
