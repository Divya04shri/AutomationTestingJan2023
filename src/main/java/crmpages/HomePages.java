package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.util;

public class HomePages extends TestBase {
// to initialize webElement
	public HomePages()
	{
		PageFactory.initElements(driver, this);
	}
	//webElement repository
	@FindBy (xpath="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement user;
	@FindBy(xpath="/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
	WebElement logoutbtn;
	@FindBy(xpath="//td[text()='CRMPRO']")
	WebElement logo;
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contacts;
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newContact;
	@FindBy(xpath="//a[test()='Companies']")
	WebElement companies;
	@FindBy(xpath="//a[test()='New Company']")
	WebElement newcompany;
	@FindBy(xpath="//a[test()='Deals']")
	WebElement deals;
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement newdeal;
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement tasks;
	@FindBy(xpath="//a[text()='New Task']")
	WebElement newtask;
	//Action
	public String userCheck()
	{
		driver.switchTo().frame("mainpanel");
		String username=user.getText();
		return username;
	}
	public void logout()
	{
		driver.switchTo().frame("mainpanel");
		logoutbtn.click();
	}
	public boolean logoCheck()
	{
		util.switchTomainPanelFrame();
		boolean status=logo.isDisplayed();
		return status;
	}
	public NewContact NewContact()
	{
		util.switchTomainPanelFrame();
		util.mouseHoverAction(contacts);
		newContact.click();
		return new NewContact();
	}
	public void createCompany()
	{
		util.switchTomainPanelFrame();
		util.mouseHoverAction(companies);;
		newcompany.click();
	}
	public void createDeal()
	{
		util.switchTomainPanelFrame();
		util.mouseHoverAction(deals);
		newdeal.click();
	}
	public void createTask()
	{
        util.switchTomainPanelFrame();
        util.mouseHoverAction(tasks);
		newtask.click();
	}
}
