package p_09_ModuleSeven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class C_86_HeadlessBrowser_PhantomJS {

	public static void main(String[] args) throws InterruptedException{

		File src = new File("F:\\Software Testing\\Selenium\\Necessary Files\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
			
		WebDriver driver = new PhantomJSDriver();
			
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
		
		WebElement header = driver.findElement(By.xpath("//h3[normalize-space()='Checkboxes']"));
		
		String headerText = header.getText();
		
		if(headerText.equals("Checkboxes")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		
		else {
			
			System.out.println("Sorry! Something went wrong.");
		}
		
		Thread.sleep(2000);

		driver.close();
	}

}
