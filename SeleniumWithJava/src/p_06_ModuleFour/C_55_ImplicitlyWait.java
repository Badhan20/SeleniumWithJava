package p_06_ModuleFour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_55_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Index.html");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#btn2")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement header =driver.findElement(By.xpath("//h2[normalize-space()='Register']"));
		
		String headerText = header.getText();
		
		if(headerText.equals("Register")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			
			System.out.println("Sorry! Something went wrong.");
		}

		driver.close();

	}

}
