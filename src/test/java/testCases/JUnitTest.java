package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitTest {

	public WebDriver driver;

	@Before
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "https://www.saucedemo.com/";
		driver.get(url);

	}

	@Test
	public void login_ValidCredential() {

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		username.clear();
		username.sendKeys("standard_user");
		password.clear();
		password.sendKeys("secret_sauce");

		btnLogin.click();
	}

	@Test
	public void login_InalidCredential() {

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));
		username.clear();
		username.sendKeys("Hedia");
		password.clear();
		password.sendKeys("secret_Hedia");

		btnLogin.click();
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}