package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By username = By.id("input-username");
	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By emailid = By.id("input-email");
	By password = By.id("input-password");
	
}
