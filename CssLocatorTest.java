package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssLocatorTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      driver.get("https://rahulshettyacademy.com/AutomationPractice/");

      // CSS Selector using ID (#)
      driver.findElement(By.cssSelector("#radio-btn-example input[value='radio2']")).click();

      // CSS Selector using Class (.)
      driver.findElement(By.cssSelector("#checkBoxOption1")).click();

       driver.close();
  }
}
