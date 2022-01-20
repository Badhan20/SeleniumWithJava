package p_07_ModuleFive;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_64_ValidateBrokenLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		List <WebElement> links = driver.findElements(By.xpath("//a"));

		int totalLinks = links.size();

		for (int i=0; i<totalLinks; i++) {

			WebElement link= links.get(i);

			String linkURL = link.getAttribute("href");

			ValidateBrokenLink(linkURL);
		}

		System.out.println("Congratulations! Test case passed.");
		
		Thread.sleep(3000);
		
		driver.close();


	}

	public static void ValidateBrokenLink(String urlLink) throws InterruptedException {

		try {
			URL url = new URL(urlLink);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setConnectTimeout(3000);

			connection.connect();

			if(connection.getResponseCode()==200) {

				System.out.println(urlLink+" - "+connection.getResponseMessage());
			}

			if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {

				System.out.println(urlLink+" - "+connection.getResponseMessage()+ " - "+HttpURLConnection.HTTP_NOT_FOUND);
			}

		} 

		catch (Exception e) {

			System.out.println("Exception catched during link validation is: "+e.getMessage());
		}

	}

}