package p_05_ModuleThree;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_52_DownloadFile_Firefox {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='pptxUploadTest.pptx']")).click();

		Thread.sleep(2000);

		Robot rt = new Robot();

		rt.keyPress(KeyEvent.VK_DOWN);

		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_TAB);

		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
