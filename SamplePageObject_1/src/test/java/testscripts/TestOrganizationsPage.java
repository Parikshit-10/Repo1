package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;
import webpages.VtigerOrganizationsPage;


	public class TestOrganizationsPage extends SeleniumUtility{
		VtigerLoginPage getVtigerLoginPage=null;
		VtigerHomePage getVtigerHomePage=null;
		VtigerOrganizationsPage getVtigerOrganizationsPage=null;
		@BeforeTest
		public void prerequisite() {
			WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
			getVtigerLoginPage=new VtigerLoginPage(driver);
			getVtigerHomePage=new VtigerHomePage(driver);
			getVtigerOrganizationsPage=new VtigerOrganizationsPage(driver);
			getVtigerLoginPage.loginInVtiger("admin", "Test@123");
			getVtigerHomePage.navigateToOrganizationsPage();
		}

		@Test
		public void testOrganizationCreation() {
			
			getVtigerOrganizationsPage.createNewOrganization("Champak Industries", "www.champakindustries.com", "9876542536");
			Assert.assertTrue(getVtigerOrganizationsPage.checkOrganizationCreation(),"Organization not created");
		}
		
		@Test
		public void testOrganizationDeletion() {
			getVtigerOrganizationsPage.deleteCreatedOrganization();
			Assert.assertTrue(getVtigerOrganizationsPage.checkOrganizationCreation(),"Created Leads is not created");
		}
		
		@AfterTest
		public void tearDown() {
			cleanUp();
		}
	}
