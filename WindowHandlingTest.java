package BasicSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandlingTest {
  @Test
  public void flipkartSearch() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.flipkart.com/");
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	  
	  WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
	  searchBox.sendKeys("Laptops");
	  searchBox.sendKeys(Keys.CONTROL+"a");
	  searchBox.sendKeys("Laptops");
	  searchBox.sendKeys(Keys.ENTER);
	  String parentWindow = driver.getWindowHandle(); 
	  WebElement laptop = driver.findElement(By.xpath("(//div[@class = 'RG5Slk'])[2]"));
	  laptop.click();
	  
	  Set<String> allWindow = driver.getWindowHandles();
	  
	  for( String eachWindow : allWindow)
	  {
		  if(!eachWindow.equals(parentWindow))
		  {
			  driver.switchTo().window(eachWindow);
		  }
	  }
	  WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Available offers']")));
	  System.out.println(ele.getText());
//	  searchBox.click();
	  
  }
}
