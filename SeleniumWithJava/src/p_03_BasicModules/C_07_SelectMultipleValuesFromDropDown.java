package p_03_BasicModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_07_SelectMultipleValuesFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "http://output.jsbin.com/osebed/2";

		driver.get(baseURL);

		driver.manage().window().maximize();

		Select selMul = new Select(driver.findElement(By.id("fruits")));

		selMul.selectByIndex(0);
		
		selMul.selectByValue("apple");
		
		selMul.selectByVisibleText("Orange");
		
		System.out.println("Congratulations! Test Passed.");

		driver.close();
	}

}