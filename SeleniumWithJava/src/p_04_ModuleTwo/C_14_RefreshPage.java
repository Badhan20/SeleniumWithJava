package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_14_RefreshPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.guru99.com");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//b[text()='Testing']"));

		String text= element.getText();

		if(text.equals("TESTING")) {
			System.out.println("Congratulations! Test Passed.");
		}

		else {
			System.out.println("Sorry! Something went wrong.");
		}

		Thread.sleep(3000);

		driver.navigate().refresh();

		/*
		 Some other ways to refresh the page are:

		  Get method: 		driver.get(driver.getCurrentUrl());
		  Navigate method: 	driver.navigate().to(GetCurrentUrl());
		  Using F5 Key:		driver. findElement(By.id("id")).sendKeys(Keys.F5);
		  Using ASCII Code:	driver. findElement(By.id("id")).sendKeys(“\uE035”);
		  
		 */


		Thread.sleep(3000);

		driver.close();
	}

}
