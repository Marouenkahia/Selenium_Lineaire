package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSwagLabsOnFirefox {

	public static void main(String[] args) {

		// Open chrome Browser
		WebDriver driver = new FirefoxDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Maximize browser
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		// Open URL application
		driver.get("https://www.saucedemo.com/");

		// Fill username
		WebElement username = driver.findElement(By.name("user-name"));
		username.clear();
		username.sendKeys("standard_user");

		// Fill password
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("secret_sauce");

		// Click on login button
		// WebElement loginBtn = driver.findElement(By.id("login-button"));
		// loginBtn.click();

		// Click on login button using explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
		loginBtn.click();

		// Validation enter home page
		String textProduct = driver.findElement(By.xpath("//span[@data-test='title']")).getText();

		// Validation enter to home page ko
		Assert.assertEquals(textProduct, "Product");

		// Validation enter to home page ok
		// Assert.assertEquals(textProduct, "Products");

		// kill session
		driver.quit();

	}

}
