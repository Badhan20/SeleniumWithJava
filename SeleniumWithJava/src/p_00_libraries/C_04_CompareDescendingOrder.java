package p_00_libraries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C_04_CompareDescendingOrder{

	public static void CompareOrder(WebDriver driver, String xpath) {
		List<String> actualList = new ArrayList<String>();

		Select sel = new Select(driver.findElement(By.xpath(xpath)));

		List <WebElement> dropdownOptions = sel.getOptions();

		for(WebElement options:dropdownOptions) {

			String values = options.getText();
			actualList.add(values);
		}

		List<String> tempList = new ArrayList<String>();

		tempList.addAll(actualList);
		
		Collections.sort(tempList, Collections.reverseOrder());
		
		if(tempList.equals(actualList)) {
			
			System.out.println("The drop-down is sorted in ascending order.");
		}
		
		else {
			
			System.out.println("The drop-down is not sorted in ascending order.");
		}

	}

}
