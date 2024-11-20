package testCases;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownListIndex {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement dropDownList = driver.findElement(By.id("cars"));

		Select select = new Select(dropDownList);

		// SelectByIndex
		int[] value = { 0, 1, 2, 3 };

		if (select.isMultiple()) {
			for (int val : value) {
				select.selectByIndex(val);
			}
		}

	}

}
