package p_07_ModuleFive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_67_HandleBootstrapModalWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("abcd@gmail.com");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

	}

}