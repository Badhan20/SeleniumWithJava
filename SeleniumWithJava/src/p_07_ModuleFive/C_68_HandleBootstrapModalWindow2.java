package p_07_ModuleFive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_68_HandleBootstrapModalWindow2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".btn.btn-info.btn-lg")).click();
		
		Thread.sleep(2000);
				
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abcd@gmail.com");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn.btn-default")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();

	}

}