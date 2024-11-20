package testCases;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// Clear and fill username
		WebElement username = driver.findElement(By.name("user-name"));
		username.clear();
		username.sendKeys("standard_user");

		// Clear and fill password
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("secret_sauce");

		// Configure Fluent Wait
		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) // Fréquence de vérification
				.ignoring(NoSuchElementException.class); // Ignorer les exceptions spécifiques

		// Use Fluent Wait to wait until the element is clickable
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id("login-button"));
			}

		});

		// Interact with the element
		element.click();

	}

}
