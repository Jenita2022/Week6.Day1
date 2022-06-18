package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Drop extends ParentClass {
@Test
	public void drop() {
		driver.findElement(By.xpath("//h5[text()='Droppable']")).click();
		WebElement eleDrag = driver.findElement(By.id("droppable"));
		WebElement eleDrop = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleDrag, eleDrop).perform();
	}

}


