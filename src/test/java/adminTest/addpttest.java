package adminTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hms.base.testbase;
import hms.pages.LoginPage;
import hms.pages.addptpage;
import hms.pages.outptpage;

public class addpttest extends testbase {
	
	LoginPage obj;
	outptpage optobj;
	addptpage addobj;
	
	
	public addpttest()
	{
		super();
		
	}
	
	@BeforeTest
	public void setup()
	{
		initilization();
		obj=new LoginPage();
		obj.Login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		optobj=new outptpage();
		optobj.opdoutpt();
		optobj.addpatiet();
		addobj=new addptpage();
		
	}
	
	@Test
	public void addpatienttest()
	{
		String expectedaptitle="Add Patient";
		String actualaptitle=addobj.addpttitle();
		Assert.assertEquals(actualaptitle, expectedaptitle);
		
		addobj.addptdetail();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
