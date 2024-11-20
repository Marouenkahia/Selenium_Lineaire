package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");

		WebElement menuList = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(menuList).perform();

		WebElement subsublist = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		actions.moveToElement(subsublist).perform();

	}

}
