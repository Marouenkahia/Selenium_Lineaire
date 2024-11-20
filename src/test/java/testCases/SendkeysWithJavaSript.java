package testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendkeysWithJavaSript {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

		WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement currentAdress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement permanentAdress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='Marouen'", fullName);
		js.executeScript("arguments[0].value='Marouen@gmail.com'", email);
		js.executeScript("arguments[0].value='Tunisia'", currentAdress);
		js.executeScript("arguments[0].value='France'", permanentAdress);
		js.executeScript("arguments[0].click()", btnSubmit);

	}

}
