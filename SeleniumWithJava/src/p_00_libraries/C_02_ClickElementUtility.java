package p_00_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class C_02_ClickElementUtility{

	public static void clickElement(WebDriver driver, String xpath) {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();

	}

}
