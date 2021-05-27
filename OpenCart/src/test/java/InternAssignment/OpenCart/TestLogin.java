package InternAssignment.OpenCart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import pageObjects.UserPage;
import resources.Base;

public class TestLogin extends Base{

	@Test(dataProvider="testdata")
	public void basePageNavigation(String username,String password,String scode) throws IOException, InterruptedException
	{
		driver = InitializeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		l.getemailid().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getPassword().sendKeys(Keys.RETURN);

		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOf(l.getPin()));
		
		l.getPin().sendKeys(scode);
		l.getPin().sendKeys(Keys.RETURN);

		UserPage up = new UserPage(driver);
		d.until(ExpectedConditions.visibilityOf(up.getTxt()));
		String text = up.getTxt().getText();
		//System.out.println(text);

		Assert.assertEquals(up.expected, text);
		driver.quit();
		//m.getLoginbtn().click();
	}

	@DataProvider(name="testdata")
	public Object[][] getData() throws IOException
	{
		TestExcel te = new TestExcel();
		Object data[][] = te.testData();
		return data;
	}

}
