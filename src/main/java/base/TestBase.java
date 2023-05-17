package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static void init()
{
	try
	{
		prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Eclips-workspace\\automationTestingJan23\\config.properties");
	prop.load(file);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("config file is missing");
	}
	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new ChromeDriver();
	}
	else
	{
		System.out.println("please enter valid browser name");
	}
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}
}
