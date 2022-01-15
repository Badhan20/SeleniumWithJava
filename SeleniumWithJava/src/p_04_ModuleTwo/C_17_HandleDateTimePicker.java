package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_17_HandleDateTimePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("01252022");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='bdaytime']")).sendKeys("0405AM");
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();
		
	}

}
