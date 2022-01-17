package p_05_ModuleThree;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_44_HandleMultipleWindows_Tabs {

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

		ArrayList<String> tabs = new ArrayList<>(allWindows);

		driver.switchTo().window(tabs.get(2));

		driver.findElement(By.cssSelector("#btn2")).click();

		WebElement header= driver.findElement(By.cssSelector("div[class='container center'] h2"));

		String headerText = header.getText();

		if(headerText.equals("Register")) {
			driver.close();
		}

		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(1));

		Thread.sleep(2000);

		driver.close();

		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));

		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
