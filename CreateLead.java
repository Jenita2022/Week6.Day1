package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseForAll{
	@Test
	public void CLead(){
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("VkramCo");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VvkramCo");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("ikram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("SQuality");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("SThis is my first testing selenium script");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("vvip@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("7777777777");

		WebElement eleState= driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select state = new Select(eleState);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
	}

}
