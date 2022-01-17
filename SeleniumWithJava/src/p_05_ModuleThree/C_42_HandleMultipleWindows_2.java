package p_05_ModuleThree;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_42_HandleMultipleWindows_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window ID is: "+parentWindow);
		
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		Set <String> allWindows=driver.getWindowHandles();
		
		int TotalWindow=allWindows.size();
		
		System.out.println("Total windows count is: "+TotalWindow);
		
		for(String childWindow:allWindows) {
			
			if(!parentWindow.equals(childWindow)) {
				
				Thread.sleep(2000);
				
				driver.switchTo().window(childWindow);
				
				WebElement header= driver.findElement(By.xpath("//h3[normalize-space()='New Window']"));
				
				String headerText = header.getText();
											
				Thread.sleep(2000);
				
				if(headerText.equals("New Window")) {
					driver.close();
					Thread.sleep(2000);
				}
				
			}
			
		}
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("Congratulations! Test case passed.");
		
		Thread.sleep(2000);
		
		driver.close();

		
	}

}
