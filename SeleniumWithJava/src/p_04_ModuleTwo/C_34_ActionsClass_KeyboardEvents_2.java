package p_04_ModuleTwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_34_ActionsClass_KeyboardEvents_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");

		Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB).perform();

		act.pause(Duration.ofSeconds(2))
		.sendKeys("1234")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.build()
		.perform();

		System.out.println("Congratulations! Test case passed.");


		driver.close();

	}

}
