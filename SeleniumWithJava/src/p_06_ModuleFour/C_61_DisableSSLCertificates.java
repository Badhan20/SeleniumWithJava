package p_06_ModuleFour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_61_DisableSSLCertificates {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
				
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://cacert.com");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}