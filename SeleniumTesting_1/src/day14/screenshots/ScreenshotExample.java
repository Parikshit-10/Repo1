package day14.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.digest.SHA1;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.DateUtility;
import utilities.SeleniumUtility;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException{
		SeleniumUtility s1 = new SeleniumUtility();



			WebDriver driver =s1.setUp("chrome", "https://www.google.com");
			
         //TakesScreenshot ts=(TakesScreenshot)driver;		
		//	File screenShot=ts.getScreenshotAs(OutputType.FILE);
			
		//FileUtils.copyFile(screenShot, new File(".\\Screenshots\\GoogleSearchPage.png"));
						//or
			
			String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddMMyyyyHHmmss", 0);
			String fileName=".\\Screenshots\\GoogleSearchPage"+date+".png";
			s1.takeScreenshot(fileName);
		
	}

}
