package p_04_ModuleTwo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_24_JSExecutor_ScrollDown_ScrollUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scroll(0,600)");

		Thread.sleep(3000);

		js.executeScript("scroll(0,-600)");

		Thread.sleep(3000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
