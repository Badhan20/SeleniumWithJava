package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_21_JSExecutorClick_WithArgument {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("malam@yahoo.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Stay signed in']"));
		
		js.executeScript("arguments[0].click()", checkbox);
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

		

	}

}
