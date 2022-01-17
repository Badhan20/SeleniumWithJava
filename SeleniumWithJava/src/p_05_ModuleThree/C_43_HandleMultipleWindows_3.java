package p_05_ModuleThree;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_43_HandleMultipleWindows_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();

		String parentWindow = driver.getWindowHandle();

		System.out.println("Parent window ID is: "+parentWindow);

		driver.findElement(By.cssSelector("button[onclick='multiwindow()']")).click();

		Set <String> allWindows=driver.getWindowHandles();

		int TotalWindow=allWindows.size();

		System.out.println("Total windows count is: "+TotalWindow);

		for(String childWindow:allWindows) {

			if(!parentWindow.equals(childWindow)) {

				Thread.sleep(2000);

				driver.switchTo().window(childWindow);

				driver.close();
				Thread.sleep(2000);
			}

		}

		driver.switchTo().window(parentWindow);

		System.out.println("Congratulations! Test case passed.");

		Thread.sleep(2000);

		driver.close();


	}

}
