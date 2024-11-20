package testCases;

import java.io.File;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		// Get Element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();

		Assert.assertEquals("#007bff", actualColor);

	}

}
