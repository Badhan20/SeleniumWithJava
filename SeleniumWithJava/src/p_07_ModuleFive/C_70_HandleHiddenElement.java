package p_07_ModuleFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_70_HandleHiddenElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();
		
		List <WebElement> radioButtons = driver.findElements(By.xpath("//input[@id='male']"));
		
		int totalRadioButtons = radioButtons.size();
		
		for(int i=0; i<totalRadioButtons; i++) {
			
			WebElement button = radioButtons.get(i);
			
			double xCordinate = button.getLocation().getX();
			
			double yCordinate = button.getLocation().getY();
			
			if(xCordinate!=0 && yCordinate!=0) {
				
				Thread.sleep(2000);
				
				button.click();
				
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();
		
	}

}
