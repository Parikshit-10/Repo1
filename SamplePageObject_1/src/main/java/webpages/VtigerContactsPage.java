package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;



	public class VtigerContactsPage extends SeleniumUtility{
		WebDriver driver;
		public VtigerContactsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
		private WebElement addContact;
		
		@FindBy(xpath="//span[text()='None']")
		private WebElement salotaionForContact;
		
		@FindBy(xpath="//div[@id='select2-drop']/ul/li[2]")
		private WebElement selectSalotationTypeForContact;
		
		@FindBy(id="Contacts_editView_fieldName_firstname")
		private WebElement firstNameInputFieldForContact;
		
		@FindBy(id="Contacts_editView_fieldName_lastname")
		private WebElement lastNameInputFieldForContact;
		
		@FindBy(id="Contacts_editView_fieldName_mobile")
		private WebElement contactNumberOfContact;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveButtonForContact;
		
		@FindBy(xpath="//h4[text()=' Contacts ']")
		private WebElement ContactHeaderLink;
		
		@FindBy(xpath="//a[contains(text(),'Champak')]")
		private WebElement newlyCreatedContactName;
		
		@FindBy(xpath="//tr[td[span[span[a[contains(text(),'ChampakI')]]]]]/td[1]//input")
		private WebElement newlyCreatedContactCheckbox;
		
		@FindBy(id="Contacts_listView_massAction_LBL_DELETE")
		private WebElement deleteContactLink;
		
		@FindBy(xpath="//button[@data-bb-handler='confirm']")
		private WebElement yesButtonOnConfirmPopup;
		
		public void createNewContact(String fname,String lname,String number) {
			clickOnElement(addContact);
			clickOnElement(salotaionForContact);
			clickOnElement(selectSalotationTypeForContact);
			typeInput(firstNameInputFieldForContact, fname);
			typeInput(lastNameInputFieldForContact, lname);
			typeInput(contactNumberOfContact, number);
			clickOnElement(saveButtonForContact);
			clickOnElement(ContactHeaderLink);
		}
			public void deleteCreatedContact() {
			clickOnElement(newlyCreatedContactCheckbox);
			clickOnElement(deleteContactLink);
			clickOnElement(yesButtonOnConfirmPopup);
			
		}
		
			public boolean checkContactCreation() {
				return isElementExist(newlyCreatedContactName);
			}
		}
