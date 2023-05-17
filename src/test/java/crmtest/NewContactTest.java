package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePages;
import crmpages.LoginPage;
import crmpages.NewContact;
import utility.ReadData;

public class NewContactTest extends TestBase
{
	NewContact newContactPage;
	HomePages homepage;
	@BeforeMethod
	public void initialization()
	{
	TestBase.init();
	LoginPage loginpage=new LoginPage();
	homepage=loginpage.login();
	newContactPage= homepage.NewContact();
	}
	@DataProvider(name="ContactData")
	public String[][] passData()
	{
		return ReadData.testdata();
	}
	@Test(dataProvider="ContactData")
	public void validateCreateContact(String FirstName,String LastName,String MobileNo,String Address)
	{
		
		newContactPage.createNewContact(FirstName,LastName,MobileNo,Address);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
