package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_28_ActionsClass_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://api.jquery.com/dblclick/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe")));

		Thread.sleep(5000);

		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//span[normalize-space()='Double click the block']//parent::body/div"))).perform();
		
		Thread.sleep(5000);
		
		act.doubleClick(driver.findElement(By.xpath("//span[normalize-space()='Double click the block']//parent::body/div"))).perform();
		
		Thread.sleep(5000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
