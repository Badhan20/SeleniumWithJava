package p_05_ModuleThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_35_HandleAlertPopup_Accept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();

		driver.switchTo().alert();

		String alertText=driver.switchTo().alert().getText();

		System.out.println("Alert text is: " + alertText);

		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

	}

}
