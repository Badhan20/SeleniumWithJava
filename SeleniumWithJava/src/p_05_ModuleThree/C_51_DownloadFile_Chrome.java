package p_05_ModuleThree;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_51_DownloadFile_Chrome {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/download");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Screenshot 2021-10-08 084505.png']")).click();

		Thread.sleep(10000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
