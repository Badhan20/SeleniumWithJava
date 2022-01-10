package p_10_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_02_RegistrationForm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("ABC");
		
		Thread.sleep(2000);

		driver.findElement(By.id("lastName")).sendKeys("XYZ");
		
		Thread.sleep(2000);

		driver.findElement(By.id("userEmail")).sendKeys("abcd1234@gmail.com");
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#userNumber")).sendKeys("9876543212");

		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("submit"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);

		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));

		js.executeScript("arguments[0].scrollIntoView();", element2);
		
		driver.findElement(By.xpath("//*[@id=\"close-fixedban\"]/img")).click();

		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();

		Thread.sleep(2000);
				
		driver.close();
		
		System.out.println("Test Case PASSES!");

	}

}
