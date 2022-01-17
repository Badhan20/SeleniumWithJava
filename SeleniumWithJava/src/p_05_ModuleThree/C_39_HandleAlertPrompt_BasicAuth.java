package p_05_ModuleThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_39_HandleAlertPrompt_BasicAuth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement message= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"));

		String actualText = message.getText();

		if(actualText.equals("Congratulations! You must have the proper credentials.")) {
			System.out.println("Congratulations! Test case passed.");
		}

		else {
			System.out.println("Sorry! Something went wrong.");
		}

		driver.close();
	}

}
