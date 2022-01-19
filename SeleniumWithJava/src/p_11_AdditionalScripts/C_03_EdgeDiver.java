package p_11_AdditionalScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C_03_EdgeDiver {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();

	}

}
