package p_08_ModuleSix;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.zxing.NotFoundException;

public class C_78_AutomateComplexSVGGraph {

	public static void main(String[] args) throws InterruptedException, IOException, NotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://emicalculator.net/");
		
		Thread.sleep(3000);

		driver.manage().window().maximize();
		
		String verticalXPath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		
		String textXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		List <WebElement> barsList = driver.findElements(By.xpath(verticalXPath));
						
		Actions act = new Actions(driver);

		for(WebElement e: barsList) {
			
			act.moveToElement(e).perform();
			
			Thread.sleep(500);
			
			WebElement Text =  driver.findElement(By.xpath(textXpath));
			
			String visibleText = Text.getText();
			
			System.out.println("Bar values are= "+visibleText);
		}

		//System.out.println("Congratulations! Test case passed.");

	}

}
