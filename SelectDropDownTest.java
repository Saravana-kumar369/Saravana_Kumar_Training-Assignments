package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDownTest {
  @Test
  public void selectDropDown() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  Select day = new Select(driver.findElement(By.id("day")));
	  day.selectByIndex(26);
	  
	  Select month = new Select(driver.findElement(By.id("month")));
	  month.selectByValue("7");
	  
	  Select year = new Select(driver.findElement(By.id("year")));
	  year.selectByVisibleText("2002");
  }
  
}
