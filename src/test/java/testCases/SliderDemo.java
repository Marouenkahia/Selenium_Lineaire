package testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider/");

		WebElement slider = driver.findElement(By.id("sliderContainer"));

		Actions actions = new Actions(driver);
		actions.moveToElement(slider, 45, 0).perform();
		slider.click();
	}

}
