
package day1.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("https://www.google.com");
	}
}