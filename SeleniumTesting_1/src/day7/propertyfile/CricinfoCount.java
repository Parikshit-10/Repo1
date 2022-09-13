package day7.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoCount {

	public static void main(String[] args) {
		 String chromeExePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",chromeExePath);
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://www.espncricinfo.com/live-cricket-score");
		    String pageUrl = driver.getCurrentUrl();
		    System.out.println("Page Url is: " +pageUrl);
            String expectedURL="https://www.espncricinfo.com/live-cricket-score";
            System.out.println("Url Validation Status: "+pageUrl.contains(expectedURL));
            List<WebElement> optionname=driver.findElements(By.cssSelector("div.ds-popper-wrapper>a"));
            List<WebElement> optioncount=driver.findElements(By.cssSelector("div.ds-popper-wrapper>a"));
           System.out.println("Option Count: "+ optioncount.size());
            for(int i=0;i<optionname.size();i++) { 
            	System.out.println(optionname.get(i).getText());
            }
	}
}