package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnchorTagTest {
	@Test
  public void AnchorTagCount() {

	          WebDriver driver = new ChromeDriver();
	          driver.manage().window().maximize();

	          driver.get("https://lms2.ai.saveetha.in");

	          List<WebElement> anchors = driver.findElements(By.tagName("a"));
	          System.out.println("List of href values:");
	          for (WebElement a : anchors) {
	              System.out.println(a.getAttribute("href"));
	          }

	          System.out.println("Total number of anchor tags: " + anchors.size());

	          driver.close();
	      

  }
}
