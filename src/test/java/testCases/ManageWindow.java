package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");

		// Go back
		driver.navigate().back();

		// Go forward
		driver.navigate().forward();

		// Refresh
		driver.navigate().refresh();

		driver.quit();

	}

}
