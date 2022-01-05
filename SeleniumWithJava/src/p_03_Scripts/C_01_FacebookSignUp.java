package p_03_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_01_FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));

		Thread.sleep(2000);

		element.sendKeys("First Name");

		Thread.sleep(2000);

		driver.findElement(By.name("lastname")).sendKeys("Last Name");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_email__")).sendKeys("testemail@domain.com");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testemail@domain.com");

		Thread.sleep(2000);

		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");

		Select sel1 = new Select(driver.findElement(By.name("birthday_day")));

		Thread.sleep(2000);

		sel1.selectByVisibleText("20");

		Select sel2= new Select(driver.findElement(By.name("birthday_month")));

		Thread.sleep(2000);

		sel2.selectByVisibleText("Jun");

		Select sel3= new Select(driver.findElement(By.name("birthday_year")));

		Thread.sleep(2000);

		sel3.selectByVisibleText("1998");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("websubmit")).click();
		
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"reg_error_inner\"]")));
		
		System.out.println("Error message is: "+element2.getText());
		
		Thread.sleep(2000);
		
		driver.close();
		
		System.out.println("Test PASSED!");
		
	}

}
