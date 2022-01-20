package p_06_ModuleFour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_63_ValidateTooltip_jQuery {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//input[@id='age']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(button).perform();
		
		Thread.sleep(2000);
		
		//To inspect bootstrap tool, go to source and click fn+f8 to capture the locator
		
		WebElement tootTip = driver.findElement(By.xpath("//div[@class='ui-tooltip-content' and text()='We ask for your age only for statistical purposes.'][1]"));
		
		String tooltipText = tootTip.getText();
		
		if(tooltipText.equals("We ask for your age only for statistical purposes.")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else
		{
			System.out.println("Sorry! Something went wrong.");
		}
		
		driver.close();

	}

}