package p_07_ModuleFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import p_00_libraries.C_03_CompareAscendingOrder;

public class C_72_VerifyAscendingOrderofDropDownValues2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

		driver.manage().window().maximize();
		
		C_03_CompareAscendingOrder.CompareOrder(driver, "//select[@id='tools']");

		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
