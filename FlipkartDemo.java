package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartDemo {
	
	@Test
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String expTitle = "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
		if(driver.getTitle().equals(expTitle))
		{
			System.out.println("Found flipkart page");
		}
		else
		{
			System.out.println("Page does not match");
		}
		
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/div/input"));
		searchBar.sendKeys("Laptops");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button"));
		search.click();
		
		String ratings = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/span[2]/span/span[1]")).getText();
		System.out.println(ratings);
//		driver.close();
	}
}
