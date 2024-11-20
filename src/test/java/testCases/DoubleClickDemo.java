package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

		
		WebElement btnDoubleClick = driver.findElement(By.id("ondoubleclick"));

		Actions actions = new Actions(driver);
		actions.doubleClick(btnDoubleClick).perform();

		String textDoubleClick = driver.findElement(By.id("ondoubleclickstatus")).getText();

		Assert.assertEquals(textDoubleClick, "Event Triggered");

	}

}
