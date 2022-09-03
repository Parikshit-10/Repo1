package day1.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {

		 String currentWorkingDir = System.getProperty("user.dir");
		 String firefoxExePath = currentWorkingDir+ "\\Executables\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",firefoxExePath);
		 
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 
			String pageTitle = driver.getTitle();


			System.out.println("Page title is: " + pageTitle);
			System.out.println("Page title length: " + pageTitle.length());
			String expectedTitle = "Facebook – log in or sign up";
			System.out.println("Title validation status: " + pageTitle.equals(expectedTitle));

			String pageUrl = driver.getCurrentUrl();
			System.out.println("Page Url is: " + pageUrl);
			String expectedURL = "https://www.facebook.com/";
			System.out.println("Url validation status: " + pageUrl.contains(expectedURL));

			String pageSource = driver.getPageSource();
			System.out.println("Page Source: " + pageSource);
			System.out.println("Page Source length: " + pageSource.length());

		 driver.close();
		 
	}
}
