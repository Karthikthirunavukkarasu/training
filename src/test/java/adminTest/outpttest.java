package adminTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hms.base.testbase;
import hms.pages.LoginPage;
import hms.pages.outptpage;

public class outpttest extends testbase{

	LoginPage obj;
	outptpage optobj;
	
	public outpttest()
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
		
	}
	
	@Test
	public void opttest()
	{
		optobj.opdoutpt();
		
		String expectedoptitile="OPD Patient";
		String actulopttitle=optobj.opdouttitle();
		Assert.assertEquals(actulopttitle, expectedoptitile);
		
		optobj.addpatiet();
	}
}
