package p_03_BasicModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_01_TextboxButtonClickSendKeysClear {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL= "https://demo.guru99.com/test/login.html";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.name("passwd")).sendKeys("abcd1234");
		
		driver.findElement(By.name("passwd")).clear();
		
		driver.findElement(By.name("passwd")).sendKeys("abcd1234");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement message= driver.findElement(By.xpath("//h3[text()='Successfully Logged in...']"));
		
		if(message.isDisplayed()) {
			System.out.println("Congratulations! Test Passed.");
		}
		
		driver.close();

	}

}
