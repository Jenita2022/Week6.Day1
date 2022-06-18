package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AUI_SelectMultipleDropdown extends ParentClass{
	
	@Test
	public void slcMultiple() {
		driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
		WebElement optionSelenium = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
		WebElement optionAppium = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Appium']"));
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(optionSelenium)
		.click(optionAppium)
		.keyUp(Keys.CONTROL)
		.perform();

	}

}
