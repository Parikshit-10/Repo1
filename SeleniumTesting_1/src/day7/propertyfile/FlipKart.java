package day7.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
    String chromeExePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",chromeExePath);
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    String pageTitle=driver.getTitle();		
	System.out.println("Page title is: "+pageTitle);
	System.out.println("Page title length: "+pageTitle.length());
	String expectedTitle="Flipkart";
	System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));

	List<WebElement> optionname=driver.findElements(By.cssSelector("div._37M3Pb div>a"));
	List<WebElement> optioncount=driver.findElements(By.cssSelector("div._37M3Pb div>a"));
    System.out.println("options count: " +optioncount.size());

	for(int i=0;i<optionname.size();i++) {
		System.out.println(optionname.get(i).getText());
	}
	
	}
}
