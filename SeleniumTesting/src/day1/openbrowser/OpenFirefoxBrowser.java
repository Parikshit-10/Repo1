package day1.openbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {

		

			System.setProperty("webdriver.gecko.driver",
					"D:\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\SeleniumTesting\\Executables\\geckodriver.exe");
			FirefoxDriver fdriver = new FirefoxDriver();
			fdriver.get("https://www.google.com");
		}
	}