package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragAndDropTest {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/p[text()='Drag me to my target']")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
//		act.clickAndHold(source);
		act.dragAndDrop(source, target).perform();
		String droppedText = target.getText();
		System.out.println("After drop, target text is: " + droppedText);

	}
}
