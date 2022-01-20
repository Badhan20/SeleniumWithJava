package p_06_ModuleFour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_62_ValidateTooltip_Bootstrap {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Hover over me']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(button).perform();
		
		Thread.sleep(2000);
		
		//To inspect bootstrap tool, go to source and click fn+f8 to capture the locator
		
		WebElement tootTip = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		
		String tooltipText = tootTip.getText();
		
		if(tooltipText.equals("Hooray!")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else
		{
			System.out.println("Sorry! Something went wrong.");
		}
		
		driver.close();

	}

}