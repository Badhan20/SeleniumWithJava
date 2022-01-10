package p_03_BasicModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_03_ClickOnImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL= "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@aria-label='Facebook']//*[name()='svg']")).click();
		
		String title= driver.getTitle();
		
		if(title.equalsIgnoreCase("Facebook – log in or sign up")) {
			
			System.out.println("Congratulations! Redirected to the home page successfully.");
		}
		
		else {
			System.out.println("Sorry! Not redirected.");
		}
		
		driver.close();

	}

}
