package p_08_ModuleSix;

import p_00_libraries.C_05_EncodeAndDecodeUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_75_EncodePassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		password.sendKeys(C_05_EncodeAndDecodeUtility.decodePassword("YWRtaW4xMjM="));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(2000);
				
		WebElement dashboard = driver.findElement(By.cssSelector("div[class='head'] h1"));
		
		String dashboardText = dashboard.getText();
		
		if(dashboardText.equals("Dashboard")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			
			System.out.println("Sorry! Something went wrong.");
		}
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
