package p_05_ModuleThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_38_HandleAlertPrompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.id("promtButton")).click();

		driver.switchTo().alert();
		
		String alertText=driver.switchTo().alert().getText();
		
		System.out.println("Alert text is: " + alertText);
		
		Thread.sleep(2000);

		driver.switchTo().alert().sendKeys("Test User");

		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		WebElement insertedTextOnAlert = driver.findElement(By.xpath("//span[@id='promptResult']"));
		
		String insertedTextOnWindow = insertedTextOnAlert.getText();
		
		if(insertedTextOnWindow.equals("You entered Test User")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			System.out.println("Sorry! Something went wrong.");
		}

		
		driver.close();
	}

}
