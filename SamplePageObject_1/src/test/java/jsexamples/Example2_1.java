package jsexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example2_1 extends SeleniumUtility {
  @Test
  public void testCase1() {
WebDriver driver = setUp("chrome","https://demo.actitime.com/login.do");	  
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('username').value='admin'");
	  js.executeScript("document.getElementsByName('pwd')[0].value='manager'");

	  
	  WebElement element = driver.findElement(By.id("loginButton"));
	  js.executeScript("arguments [0].click();",element);
  }
}