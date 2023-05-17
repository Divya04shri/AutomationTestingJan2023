package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	@BeforeMethod
public void initialization()
{
	init();
	loginpage=new LoginPage();
}
	@Test
	
	public void validateLoginTest()
	{
		loginpage.login();
	}
	@Test
	public void validateLogoTest()
	{
		boolean actualstatus=loginpage.logoStatus();
		Assert.assertEquals(actualstatus, true);
	}
	@Test
	
	public void validatelinksTest()
	{
		boolean actualstatus=loginpage.linkStatus();
		Assert.assertTrue(actualstatus);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
