package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		// Instantiate actions class
		Actions actions = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).perform();

		String text = driver.findElement(By.id("rightClickMessage")).getText();

		Assert.assertEquals(text, "You have done a right click");

		driver.quit();

	}

}
