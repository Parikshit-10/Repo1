package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWidgets {

	public static void main(String[] args) throws InterruptedException {
    String chromeExePath = System.getProperty("user.dir")+ "\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeExePath);
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://demo.vtiger.com/vtigercrm/index.php");
    WebElement userNameInputField =driver.findElement(By.id("username"));
    userNameInputField.clear();
    userNameInputField.sendKeys("admin");
    WebElement pwd =driver.findElement(By.name("password"));
    pwd.clear();
	pwd.sendKeys("Test@123");
    driver.findElement(By.cssSelector(".buttonBlue")).click();
    driver.findElement(By.cssSelector(".addButton")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("a[data-linkid='56']")).click();
    driver.findElement(By.cssSelector(".addButton")).click();
    
    driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
    driver.findElement(By.cssSelector(".addButton")).click();
    driver.findElement(By.cssSelector("a[data-name='LeadsBySource']")).click();
    //driver.findElement(By.cssSelector(".addButton")).click();
    driver.findElement(By.cssSelector(".userName")).click();
    driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
    Thread.sleep(5000);
    
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.findElement(By.cssSelector(".fa-remove")).click();
    driver.findElement(By.cssSelector(".confirm-box-ok")).click();
    driver.findElement(By.cssSelector(".fa-remove")).click();
    driver.findElement(By.cssSelector(".confirm-box-ok")).click();
    //driver.findElement(By.cssSelector(".userName")).click();
   // driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
	}
}
