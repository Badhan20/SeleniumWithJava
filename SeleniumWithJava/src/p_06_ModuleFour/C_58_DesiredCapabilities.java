package p_06_ModuleFour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class C_58_DesiredCapabilities {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		/*Desired capabilities is a predefined class in selenium. It is used to modify multiple
		properties of a webdriver. It provides key-value pair to change the properties of a we
		driver such as browser name, version, operating system etc..
		*/
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setAcceptInsecureCerts(true);
		
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(cap);

		driver.get("https://cacert.com");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}