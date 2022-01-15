package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_15_HandleStaticCalender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

		
	}

}
