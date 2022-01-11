package p_03_BasicModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_09_GetAllValuesFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.globalsqa.com/demo-site/select-dropdown-menu/";

		driver.get(baseURL);

		driver.manage().window().maximize();

		Select selMul = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));

		List <WebElement> allOptions = selMul.getOptions();
		
		/*int TotalOptions = allOptions.size();
		
		for (int i=0; i<TotalOptions; i++) {
			
			WebElement option= allOptions.get(i);
			String CountryName = option.getText();
			
			System.out.println("Values of country are: "+CountryName);
		}*/
		
		for(WebElement CountryName: allOptions) {
			
			String Names=CountryName.getText();
			
			System.out.println("Values of country are: "+Names);
		}
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();
		
	}

}