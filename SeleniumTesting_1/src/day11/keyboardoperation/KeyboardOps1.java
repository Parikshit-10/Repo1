package day11.keyboardoperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyboardOps1 {

	public static void main(String[] args) throws InterruptedException {


		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
		//in first name field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
					.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
		
	
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Pune,Katraj,Santoshnagar",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parikshit24@",Keys.TAB);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9845475773",Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		WebElement LanguagesDropdown = driver.findElement(By.xpath("//select[@id='msdd']"));
        Select languages = new Select(LanguagesDropdown);
        System.out.println("Is dropdown is allowing you to select multiple option: "+languages.isMultiple());                            
        List<WebElement> options = languages.getOptions();
        System.out.println("Option count is: "+options.size());
        for(int i=0; i<options.size(); i++) {
        	System.out.println("Option "+i+": "+options.get(i).getText());
        	languages.selectByIndex(0);
        	languages.selectByIndex(2);
        	languages.selectByIndex(8);

        }
        
}
}