package p_06_ModuleFour;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class C_57_FluentWait {

    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.google.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("q")).sendKeys("Selenium");
        
        Thread.sleep(2000);
        
       driver.findElement(By.name("btnK")).click();

        @SuppressWarnings({ "deprecation" })
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

        WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver arg0) {
            	
                WebElement linkelement = driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));

                if (linkelement.isEnabled()) {

                    System.out.println("Congratulations! Test case passed.");
                }
                
                else {
                	System.out.println("Sorry! Something went wrong.");
                }

                return linkelement;
            }
        });

        element.click();
        
        Thread.sleep(2000);
        
        driver.close();

    }

}