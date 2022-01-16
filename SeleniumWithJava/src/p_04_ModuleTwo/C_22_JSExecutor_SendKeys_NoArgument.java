package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_22_JSExecutor_SendKeys_NoArgument {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);

		js.executeScript("document.getElementById('login-username').setAttribute('value', 'malam@yahoo.com')");

		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Stay signed in']"));

		js.executeScript("arguments[0].click()", checkbox);
		
		Thread.sleep(3000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();



	}

}
