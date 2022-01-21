package p_07_ModuleFive;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_65_ValidateBrokenImages {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.theworldsworstwebsiteever.com/");

		driver.manage().window().maximize();

		List <WebElement> Images= driver.findElements(By.xpath("//img"));

		int totalImages = Images.size();

		for(int i=0; i<totalImages; i++) {

			WebElement image = Images.get(i);

			String imageSource = image.getAttribute("src");

			validateBrokenImages(imageSource);
		}

		System.out.println("Congratulations! Test case passed.");

		Thread.sleep(3000);

		driver.close();

	}

	public static void validateBrokenImages(String imageName) {

		try {

			URL url = new URL(imageName);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setConnectTimeout(3000);

			connection.connect();

			if(connection.getResponseCode()==200) {

				System.out.println(imageName + " - "+connection.getResponseMessage());
			}

			else {

				System.out.println(imageName + " - "+connection.getResponseMessage());
			}
		} 

		catch (Exception e) {

			System.out.println("Exceptions catched during the broken images validation is: "+e.getMessage());
		}
	}

}