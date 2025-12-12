package BasicSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Test
	public void LoginTest() {

		WebDriver driver = null;
		Scanner scan = new Scanner(System.in);
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);

		System.out.println("Enter browser Name");
		String browser = scan.nextLine();
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
		} 
		else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.setExperimentalOption("prefs", prefs);
			driver = new EdgeDriver(options);
		}
//		else if (browser.equalsIgnoreCase("firefox")) {
//			FirefoxOptions options = new FirefoxOptions();
//			options = Options();
//					options.profile = prefs;
//			driver = new FirefoxDriver(options);
//
//		}

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		String actResult = driver.getTitle();
		String expResult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actResult, expResult);
		scan.close();
		driver.close();
	}
}
