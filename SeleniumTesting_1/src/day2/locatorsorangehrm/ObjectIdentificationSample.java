

package day2.locatorsorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username=driver.findElement(By.id("username"));
		/**
		 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
		 * Operation: type  ----------> sendKeys();
		 * 			 click  ----------> click();
		 * 			existing delete---> clear()
		 */
		username.clear();
		username.sendKeys("admin");
		//identify password field
		WebElement pwd=driver.findElement(By.name("password"));
		//perform required operation
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		//identify password field
		WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
		//perform required operation
		submitBtn.click();
	}

}