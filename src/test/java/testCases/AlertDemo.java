package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		// To perform scroll on application using selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000)", "");

		WebElement btnClickMe = driver.findElement(By.id("alertButton"));

		btnClickMe.click();

		// Accept Alert
		driver.switchTo().alert().accept();

		String titlePage = driver.getTitle();

		System.out.println("Page title :" + titlePage);

		// driver.quit();

	}

}
