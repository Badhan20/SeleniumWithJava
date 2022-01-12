package p_03_ModuleOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_03_DynamicRadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL= "https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		List <WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		int TotalButtons = radioButtons.size();
		
		for(int i=0; i<TotalButtons; i++) {
			
			WebElement singleRadio = radioButtons.get(i);
			
			String RadioButtonsValue = singleRadio.getAttribute("value");
			
			System.out.println("Values of Radio buttons are: "+RadioButtonsValue);
			
			if(RadioButtonsValue.equalsIgnoreCase("C#")) {
				singleRadio.click();
				
			}
		}
		
		System.out.println("Radio Button clicked.");
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();
				
	}

}
