package week6.day1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void initial() {
  WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement eleDrag = driver.findElement(By.id("draggable"));
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(eleDrag, 50, 80).perform();
  }
	/*public void Annot() {
	  System.out.println("I am learning Annotations");
  }*/
  /*public void Annot1() {
	  System.out.println("Details of Annotations");
  }*/

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Executing before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Executing after method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Executing before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Executing after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Executing before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executing after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Executing before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Executing after suite");
  }

}
