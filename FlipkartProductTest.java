package BasicSelenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductTest {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement searchBar=driver.findElement(By.name("q"));
		String name=sc.nextLine();
		int num=sc.nextInt();
		
		searchBar.sendKeys(name);
		WebElement searchButton=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button"));
		searchButton.click();
		
		WebElement lap=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div["+num+"]/div/div/div/a/div[2]/div[1]/div[2]"));
		sc.close();
		lap.click();
		


	}

}