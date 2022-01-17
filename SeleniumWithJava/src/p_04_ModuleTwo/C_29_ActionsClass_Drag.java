package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_29_ActionsClass_Drag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/draggable/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 114, 110).perform();
		
		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
