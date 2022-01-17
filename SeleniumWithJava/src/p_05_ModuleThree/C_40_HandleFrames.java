package p_05_ModuleThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_40_HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://the-internet.herokuapp.com/iframe");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.switchTo().frame("mce_0_ifr");

		WebElement textBox= driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
		
		Thread.sleep(2000);
		
		textBox.clear();
		
		Thread.sleep(2000);
		
		textBox.sendKeys("Test Content.");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Elemental Selenium']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();
	}

}
