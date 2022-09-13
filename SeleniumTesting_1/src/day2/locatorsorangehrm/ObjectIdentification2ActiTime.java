package day2.locatorsorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification2ActiTime {

public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver",
    "D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String pageTitle = driver.getTitle();
	System.out.println("Page Title is: "+pageTitle);
	System.out.println(pageTitle.length());
	String ExpectedTitle = "actiTIME - Login";
	System.out.println("Page title Validation: "+pageTitle.equals(ExpectedTitle));
	String Pagesource = driver.getPageSource();
	System.out.println("Page source length: "+Pagesource.length());
	WebElement usernameField = driver.findElement(By.id("username"));
	usernameField.sendKeys("admin");
	WebElement passwordField = driver.findElement(By.name("pwd"));
	passwordField.sendKeys("manager");
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	loginButton.click();
}

}