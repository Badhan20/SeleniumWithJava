package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_20_JSExecutorClick_NoArgument {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("malam@yahoo.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('persistent').click()");
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

		

	}

}
