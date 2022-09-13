package day3.seleniumtimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageVerify {

 public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver",
	"D:\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\SeleniumTesting\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
			String pageTitle=driver.getTitle();		
			System.out.println("Page title is: "+pageTitle);
			System.out.println("Page title length: "+pageTitle.length());
			String expectedTitle="OrangeHRM";
			System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
			String pageUrl=driver.getCurrentUrl();
			System.out.println("Page Url is: "+pageUrl);
			String expectedURL="https://opensource-demo.orangehrmlive.com/";
			System.out.println("Url validation status: "+pageUrl.contains(expectedURL));
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			String homePageUrl=driver.getCurrentUrl();
			System.out.println("Home validation status: "+homePageUrl.contains("dashboard"));
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
		}
	}