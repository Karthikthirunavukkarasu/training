package adminTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hms.base.testbase;
import hms.pages.LoginPage;
import hms.pages.frontofficepage;

public class frontofficetest extends testbase{
	
	LoginPage obj;
	frontofficepage objfro;
	
	public frontofficetest()
	{
		super();
	}
	
	@BeforeTest
	
	public void setup()
	{
		initilization();
		obj=new LoginPage();
		obj.Login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		objfro=new frontofficepage();
		
	}
	
	@Test
	
	public void frofficetest()
	{
		objfro.clickonfroffice();
		
		String expectedfrpgtitle="Appointment Details";
		String actualfrpgtitle=objfro.getfrpagetitle();
		Assert.assertEquals(actualfrpgtitle, expectedfrpgtitle);
		
		objfro.clickonvisitorbook();
		
		
	}
	
	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}

}
