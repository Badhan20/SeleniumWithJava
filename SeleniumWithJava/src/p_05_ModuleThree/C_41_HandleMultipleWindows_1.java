package p_05_ModuleThree;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_41_HandleMultipleWindows_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent window ID is: "+parentWindow);
		
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		Set <String> allWindows=driver.getWindowHandles();
		
		int TotalWindow=allWindows.size();
		
		System.out.println("Total windows count is: "+TotalWindow);
		
		for(String childWindow:allWindows) {
			
			if(!parentWindow.equals(childWindow)) {
				
				Thread.sleep(2000);
				
				driver.switchTo().window(childWindow);
				
				Thread.sleep(2000);
				
				driver.close();
			}
			
			
		}
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("Congratulations! Test case passed.");
		
		Thread.sleep(2000);
		
		driver.close();

		
	}

}
