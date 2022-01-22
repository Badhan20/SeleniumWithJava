package p_07_ModuleFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import p_00_libraries.C_02_ClickElementUtility;

public class C_69_HandleElementNotClickableAtPoint {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		C_02_ClickElementUtility.clickElement(driver, "//label[normalize-space()='Stay signed in']");
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

		

	}

}
