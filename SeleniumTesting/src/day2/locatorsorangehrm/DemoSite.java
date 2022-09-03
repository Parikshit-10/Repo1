package day2.locatorsorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSite {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver",
				 "D:\\workspace\\SeleniumTesting\\Executables\\geckodriver.exe");
					WebDriver driver = new FirefoxDriver();
					driver.get("https://demosite.executeautomation.com/Login.html");
					String pageTitle = driver.getTitle();
					System.out.println("Page Title is: "+pageTitle);
					System.out.println(pageTitle.length());
					String ExpectedTitle = "Execute Automation";
					System.out.println("Page title Validation: "+pageTitle.equals(ExpectedTitle));
					String Pagesource = driver.getPageSource();
					System.out.println("Page source length: "+Pagesource.length());
					
					String pageUrl=driver.getCurrentUrl();
					System.out.println("Page Url is: "+pageUrl);
					String expectedURL="https://demosite.executeautomation.com/Login.html";
					System.out.println("Url validation status: "+pageUrl.contains(expectedURL));
					WebElement usernameField = driver.findElement(By.name("UserName"));
					usernameField.sendKeys("execution");
					WebElement passwordField = driver.findElement(By.name("Password"));
					passwordField.sendKeys("admin");
					WebElement loginButton = driver.findElement(By.name("Login"));
					loginButton.click();
					driver.findElement(By.linkText("Login.html")).click();
					
				}

}
