package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePages;
import crmpages.LoginPage;

public class HomePageTest extends TestBase {
	HomePages homePage;
	@BeforeMethod
	public void initialization()
	{
		init();
		LoginPage loginPage=new LoginPage();
		homePage=loginPage.login();
	}
  @Test
  public void validateUserTest() 
  {
	  homePage.userCheck();
  }
  @Test
  public void validateLogoutTest()
  {
	  homePage.logout();
  }
  @Test
  public void validateHomePageLogoTest()
  {
	  homePage.logoCheck();
  }
  @Test
  public void validateRedirectionOfCreateContactTest()
  {
	  homePage.NewContact();
  }
  @Test
  public void validateRedirectionOfCreateCompanyTest()
  {
	  homePage.createCompany();
  }
  @Test
  public void validateRedirectionOfCreateDealTest()
  {
	  homePage.createDeal();
  }
  @Test
  public void validateRedirectionOfCreateTaskTest()
  {
	  homePage.createTask();
  }
  @AfterMethod
  public void tearDown()
	{
		driver.close();
	}
}
