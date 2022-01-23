package p_09_ModuleSeven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_85_HeadlessBrowserTesting {

	public static void main(String[] args) throws IOException, InterruptedException{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
		
		WebElement header = driver.findElement(By.xpath("//h3[normalize-space()='Checkboxes']"));
		
		String headerText = header.getText();
		
		if(headerText.equals("Checkboxes")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			
			System.out.println("Sorry! Something went wrong.");
		}
		
		Thread.sleep(2000);

		driver.close();
	}

}
