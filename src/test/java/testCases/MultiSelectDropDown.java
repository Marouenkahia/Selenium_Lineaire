package testCases;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectDropDown {

	public static void main(String[] args) {

		//Les autres dropdown List
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("D:\\Automation\\Automation Files\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//WebElement dropDownList = driver.findElement(By.xpath("//div[contains(@class, 'css-2b097c-container')]"));
		WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'css-2b097c-container') and contains(@id, 'selectOne')]")));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", option);
			
		option.click();
		

		Select s = new Select(option);
		
		if(!s.isMultiple()) {
			s.selectByIndex(0);
		}
		
		
//		int[] value = {0,1,2,3};
//
//		if (select.isMultiple()) {
//			for (int val : value) {
//				select.selectByIndex(val);
//			}
//		} 

	}

}
