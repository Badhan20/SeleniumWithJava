package p_02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_01_DirectLocators_01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		//findElement is a method, By is a class, id is a method which takes string argument
		//id
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		Thread.sleep(3000);
		//name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		Thread.sleep(3000);
		
		driver.close();


	}

}
