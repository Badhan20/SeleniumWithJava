package p_03_ModuleOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_05_SelectValueFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://www.globalsqa.com/demo-site/select-dropdown-menu/";

		driver.get(baseURL);

		driver.manage().window().maximize();

		Select selectbyValue = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));

		selectbyValue.selectByValue("BGD");

		Select selectbyVisibleText = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));

		selectbyVisibleText.selectByVisibleText("Brazil");
		
		System.out.println("Congratulations! Test Passed.");
		
		driver.close();
	}

}
