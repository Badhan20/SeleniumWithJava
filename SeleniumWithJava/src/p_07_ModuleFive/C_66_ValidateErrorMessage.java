package p_07_ModuleFive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_66_ValidateErrorMessage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&hl=en-GB");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("button[type='button'] span[class='VfPpkd-vQzf8d']")).click();
		
		WebElement error = driver.findElement(By.cssSelector(".o6cuMc"));
		
		String errorText = error.getText();
		
		if(errorText.equals("Enter an email or phone number")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			
			System.out.println("Sorry! Something went wrong.");
		}
		
		Thread.sleep(2000);
		
		driver.close();

	}

}