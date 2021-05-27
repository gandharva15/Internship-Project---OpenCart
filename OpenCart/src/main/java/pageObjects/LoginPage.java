package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By loginbtn = By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[2]");
	By emailid = By.id("input-email");
	By password = By.id("input-password");
	By pin = By.id("input-pin");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLoginbtn()
	{
		return driver.findElement(loginbtn);
	}

	public WebElement getemailid()
	{
		return driver.findElement(emailid);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}

	public WebElement getPin()
	{
		return driver.findElement(pin);
	}
}
