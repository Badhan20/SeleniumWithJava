package p_07_ModuleFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_71_VerifyAscendingOrderofDropDownValues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		List<String> actualList = new ArrayList<String>();

		Select sel = new Select(driver.findElement(By.xpath("//select[@id='tools']")));

		List <WebElement> dropdownOptions = sel.getOptions();

		for(WebElement options:dropdownOptions) {

			String values = options.getText();
			actualList.add(values);
		}

		List<String> tempList = new ArrayList<String>();

		tempList.addAll(actualList);
		
		Collections.sort(tempList);
		
		if(tempList.equals(actualList)) {
			
			System.out.println("The drop-down is sorted in ascending order.");
		}
		
		else {
			
			System.out.println("The drop-down is not sorted in ascending order.");
		}


		Thread.sleep(3000);
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
