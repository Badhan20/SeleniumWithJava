package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_23_JSExecutor_SendKeys_WithArgument {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("login-username"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);

		js.executeScript("arguments[0].value='malam@yahoo.com'", username);

		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Stay signed in']"));

		js.executeScript("arguments[0].click()", checkbox);
		
		Thread.sleep(3000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
