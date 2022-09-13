package day7.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidation {

	public static void main(String[] args) throws InterruptedException {
		 
			System.setProperty("webdriver.chrome.driver",
					"D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://demo.actitime.com/login.do");
		    
		    driver.findElement(By.id("username")).sendKeys("admin");
		    driver.findElement(By.name("pwd")).sendKeys("manager");
		    driver.findElement(By.id("loginButton")).click();
		    driver.findElement(By.id("container_tasks")).click();

		    String TaskPage =driver.getTitle();
		    System.out.println("TaskPageTitle is: "+TaskPage);
			System.out.println(TaskPage.length());
			String ExpectedTaskPage = "actiTIME - Task List";
			System.out.println("TaskPage Validation: "+TaskPage.equals(ExpectedTaskPage));
		    driver.findElement(By.cssSelector(".addNewButton")).click();
		    driver.findElement(By.cssSelector(".createNewTasks")).click();
		    Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".customerSelector .selectedItem")).click();
		    driver.findElement(By.cssSelector(".scrollableDropdownView>.scrollableContainer >.contentWrapper>.searchItemList .itemRow:nth-of-type(4)")).click();

		    
		    driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
			
			driver.findElement(By.cssSelector(".projectSelector .searchItemList>.itemRow:nth-of-type(5)")).click();
			
			driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing15");
		    driver.findElement(By.cssSelector(".basicLightboxFooter .components_button.withPlusIcon")).click();
		    driver.findElement(By.xpath("//tr[td[div[div[div[div[text()='Testing15']]]]]]/td[1]/div/div")).click();
		    driver.findElement(By.cssSelector(".buttonsContainer>.submitBtn.withIcon>.buttonIcon']")).click();

		    
	}
}