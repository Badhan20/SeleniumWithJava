package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_27_ActionsClass_RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
		
		driver.switchTo().alert();
		
		System.out.println("Alert text is: "+driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
