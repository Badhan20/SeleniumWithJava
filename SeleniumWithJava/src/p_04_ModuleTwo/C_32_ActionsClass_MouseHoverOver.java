package p_04_ModuleTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_32_ActionsClass_MouseHoverOver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Automation Tools']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		List <WebElement> anchors= driver.findElements(By.xpath("//div[@class='dropdown']//a"));
		
		int totalAnchors = anchors.size();
		
		for(int i=0; i<totalAnchors; i++) {
			WebElement links= anchors.get(i);
			
			String LinkName = links.getText();
			
			System.out.println(LinkName);
			
			if(LinkName.equalsIgnoreCase("Appium")) {
				links.click();
				break;
			}
		}
		
		
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
