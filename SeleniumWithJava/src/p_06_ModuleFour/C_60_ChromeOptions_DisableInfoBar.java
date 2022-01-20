package p_06_ModuleFour;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_60_ChromeOptions_DisableInfoBar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		options.setExperimentalOption("useAutomationExtension", false);
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}