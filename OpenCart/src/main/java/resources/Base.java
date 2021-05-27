package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {


	public static WebDriver driver;
	String projectpath = System.getProperty("user.dir");
	public WebDriver InitializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(projectpath+"\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browser = prop.getProperty("browser");

		if(browser.equals("chrome"))
		{
			//Chrome Browser
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver91.exe");
			driver= new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			//Firefox Browser
			System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
