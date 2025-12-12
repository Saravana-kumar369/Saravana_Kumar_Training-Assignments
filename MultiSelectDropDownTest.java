package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultiSelectDropDownTest {
	@Test
	public void selectDropDown() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.mobiscroll.com/select/multiple-select");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("multiple-select-input")));
		WebElement ele = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[contains(@id,'multiple-select-input')]/parent::span")));
		ele.click();
		driver.findElement(By.xpath("//div[text()='Electronics & Computers']")).click();
		driver.findElement(By.xpath("//div[text()='Movies, Music & Games']")).click();
		driver.findElement(By.xpath("//div[text()='Toys, Kids & Baby']")).click();
		driver.findElement(By.xpath("//div[text()='Books']")).click();

		driver.close();

	}
}
