package p_05_ModuleThree;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_49_UploadFile_AutoIT {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement btn=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click()", btn);

		Runtime.getRuntime().exec("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\AutoIT\\UploadScript.exe");

		driver.findElement(By.xpath("//input[@id='terms']")).click();

		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

		Thread.sleep(3000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
