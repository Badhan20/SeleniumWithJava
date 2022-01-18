package p_05_ModuleThree;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import p_00_libraries.C_01_ScreenShotsUtility;

public class C_48_TakeScreenshot_2 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		C_01_ScreenShotsUtility.takeScreenshots(driver, "getURL");

		driver.manage().window().maximize();
		
		C_01_ScreenShotsUtility.takeScreenshots(driver, "maximizeWindow");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
				
		C_01_ScreenShotsUtility.takeScreenshots(driver, "typeEmail");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@gmail.com");
		
		C_01_ScreenShotsUtility.takeScreenshots(driver, "typePassword");

		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
