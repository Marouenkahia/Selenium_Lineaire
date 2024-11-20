package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengeZied {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		WebElement firstnumb = driver.findElement(By.xpath("//input[@ng-model='first']"));
		firstnumb.sendKeys("10");
		
		WebElement secondnumb = driver.findElement(By.xpath("//input[@ng-model='second']"));
		secondnumb.sendKeys("20");
		
		WebElement goBtn = driver.findElement(By.xpath("//button[@id='gobutton']"));
		goBtn.click();
		
		String strFirst = firstnumb.getAttribute("value");
		int firstNumber = Integer.parseInt(strFirst);
		
		String strSecond = secondnumb.getAttribute("value");
		int secondNumber = Integer.parseInt(strSecond);
		
		int z = firstNumber + secondNumber;
		 
        System.out.println(z);
        
        String resultnumb = driver.findElement(By.xpath("//td[normalize-space()='30']")).getText();
		
        int res = Integer.parseInt(resultnumb);
		
		System.out.println(res);		
		
		if(z == res) {
			System.out.println("Test ok");
		}else {
			System.out.println("Test Ko");
		}
	}

}
