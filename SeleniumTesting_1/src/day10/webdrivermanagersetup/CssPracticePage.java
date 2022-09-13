package day10.webdrivermanagersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssPracticePage {
	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://courses.letskodeit.com/practice");
    WebElement RadioButtonExample = driver.findElement(By.cssSelector(".left-align>fieldset>legend"));
    System.out.println("Font color: "+ RadioButtonExample.getCssValue("color"));
    System.out.println("Font size: "+ RadioButtonExample.getCssValue("Font-size"));
    System.out.println("Background-color: "+ RadioButtonExample.getCssValue("background"));
    WebElement OpenWindow = driver.findElement(By.id("openwindow"));
    System.out.println("Font color: "+OpenWindow.getCssValue("color"));
    System.out.println("Font-size: "+OpenWindow.getCssValue("font-size"));
    System.out.println("Background-color: "+OpenWindow.getCssValue("background-color"));

}
}
