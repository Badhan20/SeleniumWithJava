package p_04_ModuleTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_19_HandleDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BADHAN\\git\\SeleniumWithJava\\SeleniumWithJava\\Drivers\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2021/08");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		//Table Headers

		System.out.println("===============================");

		List <WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='customers']//th"));

		int totalHeader = tableHeader.size();

		System.out.println("Total Header is: "+totalHeader);

		for(int i=0; i<totalHeader; i++) {
			WebElement headervalues= tableHeader.get(i);

			String headerNames = headervalues.getText();

			System.out.println("Header Names are: "+headerNames);

		}

		if(totalHeader==5) {
			System.out.println("Header count is okay.");
		}

		else {
			System.out.println("Header count is not okay!");
		}

		System.out.println("===============================");


		//Table Headers

		List <WebElement> tableRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		int totalRows = tableRows.size();

		System.out.println("Total Rows is: "+totalRows);

		for(int i=0; i<totalRows; i++) {
			WebElement rowvalues= tableRows.get(i);

			String rowNames = rowvalues.getText();

			System.out.println("Rows Names are: "+rowNames);

		}

		System.out.println("===============================");

		//Table Data

		List <WebElement> tableData = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		int totalData = tableData.size();

		System.out.println("Total Rows is: "+totalData);

		for(int i=0; i<totalData; i++) {
			WebElement datavalues= tableData.get(i);

			String dataNames = datavalues.getText();

			System.out.println("Data are: "+dataNames);

		}

		System.out.println("===============================");

		//Particular Table Data and Actions

		List <WebElement> CountryColumn= driver.findElements(By.xpath("//table[@id='customers']//tr//td[4]"));

		int totalCountry = CountryColumn.size();

		System.out.println("Total Country is: "+totalCountry);

		for(int i=0; i<totalCountry; i++) {
			WebElement countryValues = CountryColumn.get(i);

			String countryName = countryValues.getText();

			System.out.println("Country Values are: "+countryName);

			if(countryName.equals("UK")) {
				driver.findElement(By.xpath("//td[text()='UK']//preceding-sibling::td/input")).click();

				Thread.sleep(3000);

				driver.findElement(By.xpath("//td[text()='UK']//following-sibling::td[1]/a")).click();

				Thread.sleep(3000);

				driver.navigate().back();
				
				Thread.sleep(3000);
			}


		}

		System.out.println("===============================");
		
		System.out.println("Congratulations! Test case passed.");

		driver.close();

	}

}
