package p_04_ModuleTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_16_HandleDynamicCalender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.plus2net.com/jquery/msg-demo/date-picker-range.php");

		driver.manage().window().maximize();
				
		driver.findElement(By.cssSelector("#date_picker1")).click();
		
		Thread.sleep(3000);
		
		List <WebElement> dates =driver.findElements(By.xpath("//tbody/tr[4]/td"));
		
		int TotalDates=dates.size();
		
		for(int i=0; i<TotalDates; i++) {
			WebElement individualDate = dates.get(i);
			
			String dateName = individualDate.getText();
			
			System.out.println(dateName);
			
			if(dateName.equals("21")) {
				individualDate.click();
				break;
			}
		}
		
		System.out.println("Congratulations! Test case passed.");
		
		driver.close();
		
	}

}
