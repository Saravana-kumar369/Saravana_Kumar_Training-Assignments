package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandlingDemoTest {
	@Test
	public void f() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement openWindowBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("openwindow")));
		openWindowBtn.click();
		driver.findElement(By.id("opentab")).click();

	}
}
