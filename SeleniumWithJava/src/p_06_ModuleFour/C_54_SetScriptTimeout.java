package p_06_ModuleFour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_54_SetScriptTimeout {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/download");

		Thread.sleep(2000);
		
		String pageTitle=driver.getTitle();
		
		if(pageTitle.equals("The Internet")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else{
			
			System.out.println("Sorry! Something went wrong.");
		}
		
		driver.close();

	}

}
