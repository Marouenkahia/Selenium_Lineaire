package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		String title = driver.getTitle();
		int lengthTitle = title.length();
		System.out.println("The title is :" + title);
		System.out.println("The length title is :" + lengthTitle);

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(URL)) {
			System.out.println("Verification successful - The correct URL is opened ");
		} else {
			System.out.println("Verification failed - incorrect URL is opened ");
		}

		System.out.println(actualUrl);
		System.out.println(URL);

		String pageSource = driver.getPageSource();
		int lengthPageSource = pageSource.length();
		System.out.println("Length page is :" + lengthPageSource);
		driver.quit();
	}

}
