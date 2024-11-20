package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");

		WebElement upLoadFile = driver.findElement(By.id("uploadfile_0"));
		upLoadFile.sendKeys("C:\\Users\\DELL\\Desktop\\FormationSelenium\\image.jpg");

	}

}
