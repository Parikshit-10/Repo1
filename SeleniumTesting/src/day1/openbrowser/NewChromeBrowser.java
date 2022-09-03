package day1.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewChromeBrowser {

	public static void main(String[] args) {

    String currentWorkingDir = System.getProperty("user.dir");
    String ChromeExePath = currentWorkingDir +"\\Executables\\Chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",ChromeExePath);
    
    WebDriver driver = new ChromeDriver();
     
    driver.get("https://demo.actitime.com/");
    
    String actulTitle = driver.getTitle();
    String expectedTitle = "actiTIME - Login";
    System.out.println("Actual Google page title is: "+actulTitle);
    System.out.println("Expected Google page title is: "+expectedTitle);
    System.out.println("Google title validation: "+actulTitle.equals(expectedTitle));
    
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = ("https://demo.actitime.com/");
    System.out.println("Actual google page URL is: "+actualUrl);
    System.out.println("expected google page URL is:"+expectedUrl);
    System.out.println("Google url validation: "+actualUrl.contains(expectedUrl));
    
    
    String pageSource = driver.getPageSource();
    System.out.println("Page source code content length: "+pageSource.length());
    
    driver.close();
    
    
		
	}

}
