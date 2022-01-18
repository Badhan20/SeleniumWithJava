package p_00_libraries;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class C_01_ScreenShotsUtility{
	
	public static void takeScreenshots (WebDriver driver, String ImageName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileHandler.copy(source, new File ("./Screenshots/"+ImageName+".png"));
			
		} 
		catch (Exception e) {
			
			System.out.println("Exception catched during taking screenshot: "+e.getMessage());
		}
		
	}
	
}
