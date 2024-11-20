package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

		driver.findElement(By.id("onclick")).click();
		String text = driver.findElement(By.xpath("//p[@id='onclickstatus']")).getText();

		Assert.assertEquals(text, "Event Triggered");

	}

}
