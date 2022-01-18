package p_05_ModuleThree;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_45_RobotClass_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Disappearing Elements']")).click();

		Robot rt = new Robot();
		
		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		System.out.println("Home Link is marked!");

		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		System.out.println("About Link is marked!");
		
		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		System.out.println("Contact Us Link is marked!");
		
		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		System.out.println("Portfolio Us Link is marked!");
		
		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);

		System.out.println("Elemental Selenium Link is marked!");
		
		rt.mouseMove(30, 100);
		
		Thread.sleep(2000);

		System.out.println("No linke is marked!");

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
