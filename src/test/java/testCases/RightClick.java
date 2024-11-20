package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

		WebElement btnRigthClick = driver.findElement(By.id("oncontextmenu"));

		Actions actions = new Actions(driver);
		actions.contextClick(btnRigthClick).perform();

		String textRightClick = driver.findElement(By.id("oncontextmenustatus")).getText();

		Assert.assertEquals(textRightClick, "Event Triggered");

	}

}
