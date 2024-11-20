package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

		// Switching to the frame
		driver.switchTo().frame("moneyiframe");

		WebElement option = driver.findElement(By.id("nseindex"));

		String value = option.getText();

		System.out.println("Value :" + value);

		driver.switchTo().defaultContent();

		driver.quit();

	}

}
