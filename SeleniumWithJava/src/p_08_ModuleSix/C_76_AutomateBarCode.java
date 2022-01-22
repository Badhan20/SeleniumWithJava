package p_08_ModuleSix;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class C_76_AutomateBarCode {

	public static void main(String[] args) throws InterruptedException, IOException, NotFoundException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement barCode = driver.findElement(By.cssSelector("img[src='https://3.bp.blogspot.com/-xaeByLfXiFk/XCxZ33hrgKI/AAAAAAAAPPI/5d4O-mf27lEQKtSiiBjx3UgtxSV0yJUpwCLcBGAs/s1600/barcode.gif']"));

		String barCodeSource = barCode.getAttribute("src");
		
		URL barCodeURL = new URL(barCodeSource);
		
		BufferedImage bufferImage = ImageIO.read(barCodeURL);
		
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferImage);
		
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		String txtinBarCode = result.getText();
		
		if(txtinBarCode.equals("ABC-abc-123")) {
			
			System.out.println("Congratulations! Test case passed.");
		}
		

		else {
			
			System.out.println("Sorry! Something went wrong.");
		}


		driver.close();
	}

}
