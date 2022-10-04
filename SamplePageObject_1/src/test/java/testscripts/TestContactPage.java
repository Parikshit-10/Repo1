package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerContactsPage;
import webpages.VtigerHomePage;
import webpages.VtigerContactsPage;
import webpages.VtigerLoginPage;

public class TestContactPage extends SeleniumUtility{
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerContactsPage getVtigerContactsPage=null;
	@BeforeTest
	public void prerequisite() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerContactsPage=new VtigerContactsPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToContactsPage();
	}

	@Test
	public void testContactCreation() {
		
		getVtigerContactsPage.createNewContact("Champak", "Patil", "9876542536");
		Assert.assertTrue(getVtigerContactsPage.checkContactCreation(),"Contacts not created");
	}
	
	@Test
	public void testContactDeletion() {
		getVtigerContactsPage.deleteCreatedContact();
		Assert.assertTrue(getVtigerContactsPage.checkContactCreation(),"Contacts not created");
	}

	
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
}