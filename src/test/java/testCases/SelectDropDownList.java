package testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));

		Select dropDownList = new Select(selectMenu);

		// Select by index
		// dropDownList.selectByIndex(3);

		// Select by value
		dropDownList.selectByValue("2");

		// Select by visible text
		// dropDownList.selectByVisibleText("Blue");

		// driver.quit();

	}

}
