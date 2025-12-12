package BasicSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotTest {
  @Test
  public void TakeScreenshot() throws IOException, InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://stackoverflow.com/");
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  Thread.sleep(3000);
	  FileHandler.copy(src, new File("SeleniumPrgrms/src/test/java/screenshot.png"));

	  
	  
  }
}
