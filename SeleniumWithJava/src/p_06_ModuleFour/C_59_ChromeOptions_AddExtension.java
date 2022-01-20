package p_06_ModuleFour;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_59_ChromeOptions_AddExtension {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		options.addExtensions(new File ("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Extensions\\cfhdojbkjhnklbpkdaibdccddilifddb-3.12-Crx4Chrome.com.crx"));
	
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}