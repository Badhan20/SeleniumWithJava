package p_05_ModuleThree;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class C_47_TakeScreenshot_1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@gmail.com");

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(source, new File ("./Screenshots/facebook.png"));
		
		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
