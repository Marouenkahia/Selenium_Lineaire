package testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTipsDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		// driver.get("https://demoqa.com/tool-tips/");
		driver.get("https://jqueryui.com/tooltip/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement tooltip = driver.findElement(By.xpath("//a[normalize-space()='Tooltips']"));
		String tooltipTtext = tooltip.getAttribute("title");
		System.out.println(tooltipTtext);

		if (tooltipTtext.equals("That's what this widget is")) {
			System.out.println("Pass : tooltip matching expected value  ");
		} else {
			System.out.println("Fail : tooltip not matching expected value  ");
		}

		driver.quit();
	}

}
