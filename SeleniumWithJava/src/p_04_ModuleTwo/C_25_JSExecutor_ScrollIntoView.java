package p_04_ModuleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_25_JSExecutor_ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement invisibleText = driver.findElement(By.xpath("(//p[contains(text(),'End of content.')])[2]"));

		js.executeScript("arguments[0].scrollIntoView(true);", invisibleText);

		Thread.sleep(5000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
