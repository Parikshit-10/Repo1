package day2.locatorsorangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFirefox {

	public static void main(String[] args) {

		 String currentWorkingDir = System.getProperty("user.dir");
		 String firefoxExePath = currentWorkingDir+ "\\Executables\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",firefoxExePath);
		 
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.amazon.in");
		 	
		 
			String pageTitle = driver.getTitle();


			System.out.println("Page title is: " + pageTitle);
			driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_1']")).click();//Mobile
			System.out.println("Title: "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Title: "+driver.getTitle().contains("Online Shopping site in India"));
			System.out.println("**************************************************");
			driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_4']")).click();//Books
			System.out.println("Tilte: "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Tilte: "+driver.getTitle().contains("Online Shopping site in India"));
			System.out.println("**********Programs continue**************");
			System.out.println("**************************************************");
			driver.findElement(By.cssSelector("a[data-csa-c-slot-id= 'nav_cs_5']")).click();//electronics
			System.out.println("Tilte: "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Tilte: "+driver.getTitle().contains("Online Shopping site in India"));
			System.out.println("**********Programs continue**************");
			driver.findElement(By.cssSelector("a[data-csa-c-slot-id= 'nav-link-amazonprime']")).click();//Prime
			System.out.println("Tilte: "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Tilte: "+driver.getTitle().contains("Online Shopping site in India"));
			System.out.println("**************************************************");
			driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_7']")).click();//Fashion
			System.out.println("Tilte: "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Tilte: "+driver.getTitle().contains("Online Shopping site in India"));

			
			
			

	}

}

