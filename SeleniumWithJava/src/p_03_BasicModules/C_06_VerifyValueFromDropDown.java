package p_03_BasicModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_06_VerifyValueFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.globalsqa.com/demo-site/select-dropdown-menu/";

		driver.get(baseURL);

		driver.manage().window().maximize();

		Select selectbyValue = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));

		selectbyValue.selectByValue("BGD");

		WebElement selectedValue= selectbyValue.getFirstSelectedOption();
		
		String selectedValuesText = selectedValue.getText();
		
		System.out.println(selectedValuesText);
		
		if(selectedValuesText.equalsIgnoreCase("Bangladesh")) {
			
			System.out.println("Congratulations! Test Passed.");
		}
		
		else {
			System.out.println("Test Failed.");
		}
		
		driver.close();
	}

}
