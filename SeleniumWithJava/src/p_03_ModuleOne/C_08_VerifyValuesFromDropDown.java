package p_03_ModuleOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_08_VerifyValuesFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "http://output.jsbin.com/osebed/2";

		driver.get(baseURL);

		driver.manage().window().maximize();

		Select selMul = new Select(driver.findElement(By.id("fruits")));

		selMul.selectByIndex(0);
		
		selMul.selectByValue("apple");
		
		selMul.selectByVisibleText("Orange");
		
		List<WebElement> SelectedValues= selMul.getAllSelectedOptions();
		
		int TotalSelected = SelectedValues.size();
		
		for(int i=0; i<TotalSelected; i++) {
			
			WebElement values = SelectedValues.get(i);
			
			String selectedNames = values.getAttribute("value");
			
			System.out.println("Selected Values are: "+selectedNames);
		}
		
		System.out.println("Congratulations! Test Passed.");

		driver.close();
	}

}