package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest {
  @Test
  public void frames() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://docs.oracle.com/javase/7/docs/api/");
	  System.out.println("Total No of frames: "+ driver.findElements(By.tagName("frame")).size());
	  System.out.println("current frame: "+driver.findElement(By.tagName("frame")).getDomAttribute("src"));
	  driver.close();
  }
}
