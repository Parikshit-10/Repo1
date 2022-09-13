package day10.webdrivermanagersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValueValidation {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement SignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("Font color: "+SignInButton.getCssValue("color"));
		System.out.println("Font Size: "+SignInButton.getCssValue("Font Size"));
		System.out.println("background color: "+SignInButton.getCssValue("background-image"));
		WebElement forgotPasswordLink = driver.findElement(By.cssSelector(".forgotPasswordLink"));
		System.out.println("Forgot password text color: "+forgotPasswordLink.getCssValue("color"));

	}
}
