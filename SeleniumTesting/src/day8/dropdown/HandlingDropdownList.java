package day8.dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingDropdownList {


	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
    		"D:\\workspace\\SeleniumTesting\\Executables\\chromedriver.exe");	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("http://demo.automationtesting.in/Register.html");
    WebElement skillDropdown = driver.findElement(By.id("Skills"));
    Select selectSkill = new Select(skillDropdown);
    System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
    //WebElement selectedOption = selectSkill.getFirstSelectedOption();
   // String selectedOptionName=selectedOption.getText();
   // System.out.println("Already selected option name: "+selectedOptionName);
    //or
    System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
    List<WebElement> options = selectSkill.getOptions();
    System.out.println("Option count is: "+options.size());
    List<String> actualList = new ArrayList<String>();
    for(int i=0; i<options.size(); i++){
    	actualList.add(options.get(i).getText());   
    	}
    System.out.println("ActualList: "+actualList);
    List<String> dupList = new ArrayList<String>();
    dupList.addAll(actualList);
    
       Collections.sort(dupList);
       System.out.println("After sorting option");
      System.out.println("After sorting duplist: "+dupList);
       System.out.println(dupList.equals(actualList));
      
       selectSkill.selectByIndex(4);
       System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
                       //or
       selectSkill.selectByValue("Backup Management");
       System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
                                            //or;
       selectSkill.selectByVisibleText("Analytics");
       System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
       
       WebElement yearDropdown = driver.findElement(By.id("yearbox"));   
       Select selectYear = new Select(yearDropdown);
       System.out.println("Is dropdown is allowing you to select multiple option: "+selectYear.isMultiple());
       
       
       System.out.println("Already selected option name: "+selectYear.getFirstSelectedOption().getText());
       List<WebElement> options1 = selectYear.getOptions();
       System.out.println("Option count is: "+options1.size());
       List<String> actualList1 = new ArrayList<String>();
       for(int i=0; i<options.size(); i++){
       	actualList1.add(options.get(i).getText());   
       	}
       System.out.println("ActualList: "+actualList1);
       List<String> dupList1 = new ArrayList<String>();
       dupList1.addAll(actualList1);
       
          Collections.sort(dupList1);
          System.out.println("After sorting option");
         System.out.println("After sorting duplist1: "+dupList1);
          System.out.println(dupList1.equals(actualList1));
          
          
          WebElement monthDropdown = driver.findElement(By.className("form-control"));
          Select selectMonth = new Select(monthDropdown);
          System.out.println("Is dropdown is allowing you to select multiple option: "+selectMonth.isMultiple());
          //WebElement selectedOption = selectSkill.getFirstSelectedOption();
         // String selectedOptionName=selectedOption.getText();
         // System.out.println("Already selected option name: "+selectedOptionName);
          //or
          System.out.println("Already selected option name: "+selectMonth.getFirstSelectedOption().getText());
          List<WebElement> options2 = selectMonth.getOptions();
          System.out.println("Optin count is: "+options2.size());
          List<String> actualList2 = new ArrayList<String>();
          for(int i=0; i<options2.size(); i++){
          	actualList2.add(options2.get(i).getText());   
          	}
          System.out.println("ActualList: "+actualList2);
          List<String> dupList2 = new ArrayList<String>();
          dupList2.addAll(actualList2);
          
          
             System.out.println(dupList2.equals(actualList2));
             
             WebElement dayDropdown = driver.findElement(By.id("daybox"));
             Select selectDay = new Select(dayDropdown);
             System.out.println("Is dropdown is allowing you to select multiple option: "+selectDay.isMultiple());
             //WebElement selectedOption = selectSkill.getFirstSelectedOption();
            // String selectedOptionName=selectedOption.getText();
            // System.out.println("Already selected option name: "+selectedOptionName);
             //or
             System.out.println("Already selected option name: "+selectDay.getFirstSelectedOption().getText());
             List<WebElement> options3 = selectDay.getOptions();
             System.out.println("Option count is: "+options3.size());
             List<String> actualList3 = new ArrayList<String>();
             for(int i=0; i<options3.size(); i++){
             	actualList3.add(options3.get(i).getText());   
             	}
             System.out.println("ActualList: "+actualList3);
             List<String> dupList3 = new ArrayList<String>();
             dupList3.addAll(actualList3);
             
                Collections.sort(dupList3);
                System.out.println("After sorting option");
               System.out.println("After sorting duplist: "+dupList3);
                System.out.println(dupList3.equals(actualList3));
             
             
       
             
}
}