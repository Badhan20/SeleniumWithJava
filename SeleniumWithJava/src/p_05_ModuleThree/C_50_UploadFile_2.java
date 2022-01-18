package p_05_ModuleThree;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_50_UploadFile_2 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\TestUploadTextDocument.html");

		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		WebElement message =driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		
		String messageText = message.getText();
		
		if(messageText.equals("File Uploaded!")) {
			System.out.println("Congratulations! Test case passed.");
		}
		else {
			System.out.println("Sorry! Something went wrong.");
		}
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
