package day7.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPageInitiation {


	public static void main(String[] args) {
		 String chromeExePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",chromeExePath);
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		    String pageUrl = driver.getCurrentUrl();
		    System.out.println("Page Url is: " +pageUrl);
         String expectedURL="https://www.gsmarena.com/";
         System.out.println("Url Validation Status: "+pageUrl.contains(expectedURL));
      
      List<WebElement> paginationLinks = driver.findElements(By.cssSelector(".nav-pages>a"));
      if (paginationLinks.size()>0) {
    	  System.out.println("Pagination exists");
      }else {
    	  System.out.println("Pagination not exists");
      }
      for(WebElement element: paginationLinks) {
    	  System.out.println(element.getText());
      }
      List<WebElement> phoneName = driver.findElements(By.cssSelector("ul>li>a>strong>span"));
System.out.println("phoneNamesize: "+phoneName.size());      
      for(int i=0; i<phoneName.size(); i++) {
    	  System.out.println(phoneName.get(i).getText());
      }
      driver.navigate().forward();
      driver.navigate().to("url");
	}
	
	}
