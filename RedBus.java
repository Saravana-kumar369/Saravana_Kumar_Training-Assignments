package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String expResult = "Bus Booking Online and Train Tickets at Lowest Price - redBus";
		String actResult = driver.getTitle();
		if( expResult.equals(actResult)) {
			System.out.print("Test Passed");
		}
		else
		{
			System.out.print("Test Passed");
		}
		
		driver.close();

	}

}
