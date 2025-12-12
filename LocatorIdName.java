package BasicSelenium;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorIdName {

	public static void main(String[] args) {
		Map<String,Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service",false);
		prefs.put("profile.password_manager_leak_detection",false);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String expTitle = "Swag Labs";
		String actTitle = driver.getTitle();
		if( expTitle.equals(actTitle)) {
			System.out.print("Find the Sauce demo page Successfully\n");
		}
		else
		{
			System.out.print("Test Failed.Found the wrong page\n");
			return;
		}
		
		//to find and enter user name
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		WebElement usrName =driver.findElement(By.id("user-name")); 
		usrName.sendKeys("standard_user");
		//to find and enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		// to find and perform click operation on login button
		driver.findElement(By.id("login-button")).click();
		
		
		String actResult = driver.findElement(By.className("title")).getText();
		if(actResult.equals("Products"))
		{
			System.out.println("Logged in Successfully");
		}
		else
		{
			System.out.println("Failed to Log in");
		}
	
		
		
		driver.close();

	}

}
