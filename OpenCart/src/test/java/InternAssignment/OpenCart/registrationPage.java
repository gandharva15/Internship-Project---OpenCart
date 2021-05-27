package InternAssignment.OpenCart;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.Base;

public class registrationPage extends Base{
	
	@Test
	public void registration() throws IOException {
		
		driver = InitializeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
	}

}
