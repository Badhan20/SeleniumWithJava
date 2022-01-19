package p_06_ModuleFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_56_ExplicitWait {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
		
		Boolean status = element.isDisplayed();
		
		if(status) {
			
			System.out.println("Congratulations! Test case passed.");
		}

		else {
			
			System.out.println("Sorry! Element not displayed.");
		}
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
