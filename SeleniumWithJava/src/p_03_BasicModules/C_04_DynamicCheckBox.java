package p_03_BasicModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_04_DynamicCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html";

		driver.get(baseURL);

		driver.manage().window().maximize();

		List <WebElement> CheckBoxs = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));

		int TotalCheckbox = CheckBoxs.size();

		for(int i=0; i<TotalCheckbox; i++) {

			WebElement SingleCheckbox = CheckBoxs.get(i);

			String ValueOfCehckbox = SingleCheckbox.getAttribute("id");

			System.out.println("Values of Checkboxes are: "+ValueOfCehckbox);

			if(ValueOfCehckbox.equals("code")) {

				SingleCheckbox.click();

			}
		}

		System.out.println("Checkbox is clicked.");

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
