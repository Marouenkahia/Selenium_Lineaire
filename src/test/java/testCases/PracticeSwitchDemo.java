package testCases;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeSwitchDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		// 1st button
		WebElement newWindow = driver.findElement(By.id("tabButton"));
		newWindow.click();

		Set<String> handles = driver.getWindowHandles();

		// Pass a window handle to other window
		for (String handle : handles) {
			driver.switchTo().window(handle);
		}

		System.out.println("URL of the window: " + driver.getCurrentUrl());

		driver.close();

	}

}
