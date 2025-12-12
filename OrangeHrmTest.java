package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest {
  @Test
  public void LoginTest() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String expTitle = "Swag Labs";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(expTitle,actTitle);
  }
}
