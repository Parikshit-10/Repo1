package day4.cssSelectorExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample1 {

	public static void main(String[] args) {
		//1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter application url
		driver.get("https://demosite.executeautomation.com/Login.html");
		//2. enter username as execution
		driver.findElement(By.name("UserName")).sendKeys("execution");
		//3. enter password as admin
		driver.findElement(By.name("Password")).sendKeys("admin");
		//4. click on login button
		driver.findElement(By.name("Login")).click();
		System.out.println("Hi");
		//5. click on logout button
		
		//6. close browser
		
	}
}