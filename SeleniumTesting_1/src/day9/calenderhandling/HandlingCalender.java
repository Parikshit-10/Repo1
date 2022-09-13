package day9.calenderhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver",
		   "D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.get("https://www.redbus.in/");
   driver.findElement(By.cssSelector(".db")).sendKeys("Pune");
   driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']")).sendKeys("Goa");
   driver.findElement(By.cssSelector("#onward_cal")).click();
   driver.findElement(By.cssSelector(".next")).click();

   driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-of-type(4)>td:nth-of-type(5)")).click();
   driver.findElement(By.id("search_btn")).click();


   
	}

}
