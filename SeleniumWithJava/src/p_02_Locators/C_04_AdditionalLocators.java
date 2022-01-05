package p_02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_04_AdditionalLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		//Linked Text is the Exact Text related to the hyperlink
		//LinkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		/* How By class works internally
		 
		 By forpass = By.linkText("Forgot your password?");
		 
		 driver.findElement(forpass).click();
		 
		 */

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		//PartialLinked Text is the partial Text related to the hyperlink
		//PartialLinked
		driver.findElement(By.partialLinkText("password?")).click();
		
		Thread.sleep(2000);

		driver.close();


	}

}
