package day2.locatorsorangehrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTechlistic {
	public static void main(String[] args) throws InterruptedException {
		String driverExePath=".\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com");
		String expTitle="https://www.techlistic.com/";
		String actualTitle=driver.getTitle();
		System.out.println("Title Validation: "+actualTitle.contains(expTitle));
		
		driver.findElement(By.cssSelector("ul[class='tabs'] li[class='overflowable-item']>a[href='https://www.techlistic.com/p/java.html']")).click();
		Thread.sleep(10000);
		String javaexpTitle="https://www.techlistic.com/p/java.html";
		String javaTitle=driver.getTitle();
		System.out.println("Java Title Page Validation :"+javaTitle.contains(javaexpTitle));
		
		driver.navigate().back();
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(10000);
		String seleniumexpTitle="https://www.techlistic.com/p/selenium-tutorials.html";
		String seleniumTitle=driver.getTitle();
		System.out.println("Selenium Title Page Validation :"+seleniumTitle.contains(seleniumexpTitle));
		
		driver.close();
			
}
}

