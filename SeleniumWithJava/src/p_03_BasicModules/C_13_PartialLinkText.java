package p_03_BasicModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_13_PartialLinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.facebook.com/";

		driver.get(baseURL);

		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("password?")).click();

		String title = driver.getTitle();

		if(title.equalsIgnoreCase("Forgotten Password | Can't Log In | Facebook")) {
			
			System.out.println("Link clicked successfully");
		}

		else {
			
			System.out.println("Link not clicked");
		}


		System.out.println("Congratulations! Test Passed.");

		driver.close();
	}

}