package jsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example3_1 extends SeleniumUtility {
  @Test
  public void testCase1(){
	  WebDriver driver = setUp("chrome","https://www.flipkart.com/");
	  driver.findElement(By.xpath("//body")).click();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollby(0,2500)");
	  js.executeScript("window.scrollby(0,-2500)");
   //Horizontal Scrolling
	  //js.executeScript("window.scrollby(500,0)";)
  }
}
