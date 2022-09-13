package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidation {

	public static void main(String[] args) throws InterruptedException {
		 String chromeExePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",chromeExePath);
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://www.facebook.com/");
		    String pageUrl = driver.getCurrentUrl();
		    System.out.println("Page Url is: " +pageUrl);
            String expectedURL="https://www.facebook.com/";
            System.out.println("Url Validation Status: "+pageUrl.contains(expectedURL));
            WebElement CreateAccount = driver.findElement(By.cssSelector("#u_0_0_Yl"));
            CreateAccount.click();
            Thread.sleep(2000);
            
	}

}
