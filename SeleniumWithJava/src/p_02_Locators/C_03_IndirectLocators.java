package p_02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_03_IndirectLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//xPath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("malam@gmail.com");
		
		//CSS
		driver.findElement(By.cssSelector("#pass")).sendKeys("Abcd1234");
		
		Thread.sleep(2000);
		
		driver.close();
		

		
	}

}
