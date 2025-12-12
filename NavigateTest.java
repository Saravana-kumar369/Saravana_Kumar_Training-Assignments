package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
	@Test
	public void NavigatingDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lms2.ai.saveetha.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://training2.saveetha.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://lms2.ai.saveetha.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://lms2.ai.saveetha.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}
