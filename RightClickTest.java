package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTest {
  @Test
  public void MouseRightClick() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions action = new Actions(driver);
	  
	  action.contextClick(ele).perform();
	  
	  driver.close();
  }
}
