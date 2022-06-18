package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Drag extends ParentClass  {
@Test
	public void drag() {
		// TODO Auto-generated method stub
			
		driver.findElement(By.xpath("//h5[text()='Draggable']")).click();
		WebElement eleDrag = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleDrag, 50, 80).perform();
	}

}
