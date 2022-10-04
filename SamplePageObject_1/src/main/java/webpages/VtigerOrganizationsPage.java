package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerOrganizationsPage extends SeleniumUtility{


		WebDriver driver;
		public VtigerOrganizationsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="Accounts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addOrganization;
	
	@FindBy(id="Accounts_editView_fieldName_accountname")
	private WebElement orgNameInputFieldForOrganization;
	
	@FindBy(id="Accounts_editView_fieldName_website")
	private WebElement webNameInputFieldForOrganization;
	
	@FindBy(id="Accounts_editView_fieldName_phone")
	private WebElement contactNumberOfOrganization;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButtonForOrganization;
	
	@FindBy(xpath="//h4[text()=' Organizations ']")
	private WebElement OrganizationHeaderLink;
	
	@FindBy(xpath="//a[contains(text(),'Champak Industries')]")
	private WebElement newlyCreatedOrganizationName;
	
	@FindBy(xpath="//tr[td[span[span[a[contains(text(),'Champak Industries')]]]]]/td[1]//input")
	private WebElement newlyCreatedOrganizationCheckbox;
	
	@FindBy(id="Accounts_listView_massAction_LBL_DELETE")
	private WebElement deleteOrganizationLink;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	
	public void createNewOrganization(String orgname,String webname,String number) {
		clickOnElement(addOrganization);
		typeInput(orgNameInputFieldForOrganization, orgname);
		typeInput(webNameInputFieldForOrganization, webname);
		typeInput(contactNumberOfOrganization,number);
		clickOnElement(saveButtonForOrganization);
		clickOnElement(OrganizationHeaderLink);
	}
	public void deleteCreatedOrganization() {
		clickOnElement(newlyCreatedOrganizationCheckbox);
		clickOnElement(deleteOrganizationLink);
		clickOnElement(yesButtonOnConfirmPopup);

		
	}
	public boolean checkOrganizationCreation() {
		return isElementExist(newlyCreatedOrganizationName);
	}
}

