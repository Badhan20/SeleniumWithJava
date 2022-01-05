package p_02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_02_DirectLocators_02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		//Class Name can be unique or multiple elements have same class name
		//ClassName
		driver.findElement(By.className("inputtext")).sendKeys("Software Testing Material");

		Thread.sleep(2000);
		
		driver.close();
	}

}
