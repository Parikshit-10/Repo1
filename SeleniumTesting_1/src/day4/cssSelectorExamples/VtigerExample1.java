package day4.cssSelectorExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerExample1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",
    	"D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
    String pageTitle = driver.getTitle();
    System.out.println("pageTitle is: "+pageTitle);
    System.out.println(pageTitle.length());
    String ExpectedTitle = "vtiger";
    System.out.println("Page Title Validation: "+pageTitle.equals(ExpectedTitle));
	String pageUrl=driver.getCurrentUrl();
    System.out.println("Page Url is: "+pageUrl);
	String expectedURL="https://demo.vtiger.com/vtigercrm/index.php";
	System.out.println("Url validation status: "+pageUrl.contains(expectedURL));
    WebElement username= driver.findElement(By.id("username"));
    username.clear();		
    username.sendKeys("admin");
    WebElement password = driver.findElement(By.name("password"));
    password.clear();
    password.sendKeys("Test@123");
    WebElement SignButton = driver.findElement(By.className("button"));
    SignButton.click();
    Thread.sleep(2000);
    String PageTitle = driver.getCurrentUrl();
    System.out.println("Home pageTitle validation: "+pageUrl.equals("https://demo.vtiger.com/vtigercrm/index.php"));
    
    driver.close();
	}

}
