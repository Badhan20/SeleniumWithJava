package p_03_ModuleOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_02_RadioButtonCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL= "https://demo.guru99.com/test/radio.html";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
		
		radioButton.click();
		
		System.out.println("First Option is clicked for radio button.");
		
		WebElement checkbox = driver.findElement(By.id("vfb-6-1"));
		
		checkbox.click();
		
		if (checkbox.isSelected()) {
			System.out.println("Checkbox toggle is ON.");
		}
		
		else {
			System.out.println("Checkbox toogle is OFF.");
		}
		
		
		System.out.println("Congratulations! Test Passed.");
		
		driver.close();

	}

}
