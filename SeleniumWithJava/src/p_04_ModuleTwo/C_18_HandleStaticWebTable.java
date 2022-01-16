package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_18_HandleStaticWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement TdName = driver.findElement(By.xpath("//td[normalize-space()='Google']"));

		String TdValue = TdName.getText();

		if(TdValue.equals("Google")) {
			System.out.println("Congratulations! Test case passed.");
		}

		else {
			System.out.println("Sorry! Something went wrong.");
		}

		driver.close();

	}

}
