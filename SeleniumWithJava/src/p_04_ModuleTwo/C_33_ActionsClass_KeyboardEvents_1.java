package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_33_ActionsClass_KeyboardEvents_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/key_presses");

		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(text.equals("You entered: TAB")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			System.out.println("Sorry! Something went wrong.");
		}

		driver.close();

	}

}
