package day3.seleniumtimes;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {


	public static void main(String[] args) {
	    String chromeExePath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",chromeExePath);
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	    WebElement userNameInputField=driver.findElement(By.id("txtUsername"));
	    System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
	    System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
	    String defaultValueInUserNameInputField=userNameInputField.getText();
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		WebElement passwordInputField=driver.findElement(By.name("txtPassword"));
	    System.out.println("Password is displayed or not? "+passwordInputField.isDisplayed());
	    System.out.println("Password is functional or not? "+passwordInputField.isEnabled());
	    String defaultValueInPasswordInputField=passwordInputField.getText();
		System.out.println("Default value of password input field: "+defaultValueInPasswordInputField);
		System.out.println("Default value validation for password input field status: "+defaultValueInPasswordInputField.equals("Password"));
	    WebElement loginButton=driver.findElement(By.id("btnLogin"));
	    System.out.println("loginButton is displayed or not? "+loginButton.isDisplayed());
	    System.out.println("loginButton is functional or not? "+loginButton.isEnabled());
	    String ButtonNameofloginButton=loginButton.getAttribute("value");
		System.out.println("Button Name of loginButton input field: "+defaultValueInUserNameInputField);
		System.out.println("Button Name validation for loginButton status: "+ButtonNameofloginButton.equals("LOGIN"));
		
}
}