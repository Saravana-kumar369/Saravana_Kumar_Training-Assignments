package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitTest {
	@Test
	public void ImplicitWaitDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://advantageonlineshopping.com/#/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String categoryName = driver.findElement(By.id("speakersTxt")).getText();
		System.out.println("Category : "+categoryName);
		
		driver.close();
	}
}
