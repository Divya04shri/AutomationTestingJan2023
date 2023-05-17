package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContact extends TestBase
{
	public NewContact()
	{
		PageFactory.initElements(driver,this);
	}
	//webelements repository
	@FindBy(id="first_name")
	WebElement firstName;
	@FindBy(id="surname")
	WebElement lastname;
	@FindBy(id="mobile")
	WebElement mobileno;
	@FindBy(name="address")
	WebElement address;
	@FindBy(xpath="//form[@id='contactForm']/descendant::input[@value='Save']")
	WebElement saveBtn;
	//Actions
public void createNewContact(String FN,String LN,String MN,String ADD)
{
	firstName.sendKeys(FN);
	lastname.sendKeys(LN);
	mobileno.sendKeys(MN);
	address.sendKeys(ADD);
	saveBtn.click();
}	

}
