package p_10_ModuleEight;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_88_Log4j {

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("C_88_Log4j");

		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://demo.guru99.com/test/radio.html";
			
		driver.get(baseURL);
		
		logger.info("URL opened.");

		driver.manage().window().maximize();
		
		logger.info("Browser maximized.");

		WebElement radioButton = driver.findElement(By.id("vfb-7-1"));

		radioButton.click();
		
		logger.info("Radio button clicked.");

		System.out.println("First Option is clicked for radio button.");
		
		logger.info("Clicked message shown.");

		WebElement checkbox = driver.findElement(By.id("vfb-6-1"));

		checkbox.click();
		
		logger.info("Checkbox selected.");

		if (checkbox.isSelected()) {
			System.out.println("Checkbox toggle is ON.");
			
			logger.info("Toggle On is shown.");
		}

		else {
			System.out.println("Checkbox toogle is OFF.");
			
			logger.info("Toggle Off is shown.");
		}


		System.out.println("Congratulations! Test Passed.");
		
		logger.info("Pass message shown.");
		
		Thread.sleep(3000);
		
		logger.info("Wait for 3 seconds.");

		driver.close();

	}

}
