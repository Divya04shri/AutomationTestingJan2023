package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{
	//driver.findElement(By.xpath()).sendKeys();
	//to initialize webElement
public LoginPage()
{
	PageFactory.initElements(driver, this);
}

//webElements repository
@FindBy(name="username")
WebElement usernameTxtBox;

@FindBy(name="password")
WebElement passwordTxtBox;

@FindBy(xpath="//input[@type='submit']")
WebElement loginBtn;

@FindBy(xpath="(//mg[@class='img-responsive'])[1]")
WebElement logo;

@FindBy(linkText="Sign Up")
WebElement signUpLink;
//action
public HomePages login()
   {
	usernameTxtBox.sendKeys(prop.getProperty("username"));
	passwordTxtBox.sendKeys(prop.getProperty("password"));
	loginBtn.click();
	HomePages object=new HomePages();
	return object;
    }
    public boolean logoStatus()
    { 
    boolean status=logo.isDisplayed();
    return status;
    }
    public boolean linkStatus()
    {
    	boolean status=signUpLink.isDisplayed();
    	return status;
    }
    
}

