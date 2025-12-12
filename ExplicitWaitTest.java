package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
	@Test
	public void ExplicitWaitDemo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement searchBox = driver.findElement(By.id("FromSector_show"));
		searchBox.click();
		driver.findElement(By.id("a_FromSector_show")).sendKeys("Bengaluru");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement fromCity = driver.findElement(By.xpath("//div[text()='Suggestion Cities']/parent::div/ul/li"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Suggestion Cities']/parent::div/ul/li")));
		
		
		fromCity.click();
//		driver.close();
	}
}
