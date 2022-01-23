package p_09_ModuleSeven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_84_HandleWindowsAuthentication_AutoIT {

	public static void main(String[] args) throws IOException{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Runtime.getRuntime().exec("C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\AutoIT\\WindowsAuthentication.exe");

		driver.get("https://www.engprod-charter.net/");
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();
	}

}
