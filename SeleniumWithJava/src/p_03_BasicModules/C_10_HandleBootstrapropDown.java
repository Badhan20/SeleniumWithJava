package p_03_BasicModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_10_HandleBootstrapropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String baseURL= "https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html";

		driver.get(baseURL);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#menu1")).click();

		List <WebElement> options= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		int totalOptions = options.size();

		for(int i=0; i<totalOptions; i++) {

			WebElement Singleoption = options.get(i);

			String names= Singleoption.getAttribute("innerHTML");

			System.out.println("Total Names are: "+names);
			
			if(names.equals("JavaScript")) {
				
				Singleoption.click();
				
				System.out.println("Congratulations! Test case passed.");
				
				break;
				
			}
		}
		
		driver.close();
	}

}