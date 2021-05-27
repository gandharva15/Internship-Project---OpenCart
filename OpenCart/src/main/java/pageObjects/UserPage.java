package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {

	public WebDriver driver;
	public String expected = "Welcome to OpenCart!";

	By txt = By.xpath("//*[@id=\"account-account\"]/div[1]/div/p");

	public UserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getTxt()
	{
		return driver.findElement(txt);
	}
}
