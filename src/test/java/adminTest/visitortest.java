package adminTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hms.base.testbase;
import hms.pages.LoginPage;
import hms.pages.frontofficepage;
import hms.pages.visitorpage;
import hms.utillty.ReadExcel;

public class visitortest extends testbase {
	
	LoginPage obj;
	frontofficepage objfro;
	visitorpage objvis;
	
	public visitortest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void setup()
	{
		initilization();
		obj=new LoginPage();
		obj.Login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));		
		objfro=new frontofficepage();
		objfro.clickonfroffice();
		objfro.clickonvisitorbook();
		objvis=new visitorpage();	
		
	}
	
	@DataProvider
	public Object[][] getvisdata()
	{
		Object[][]vistestdata=ReadExcel.getTestData("testdata");
		return vistestdata;
		
	}
	
	@Test(dataProvider="getvisdata")
	
	public void addvisitor(String datatest[])
	{
		String expectedvistitle="Visitor List";
		String actulvistitle=objvis.getvistitle();
		Assert.assertEquals(actulvistitle, expectedvistitle);
		
		objvis.clickonvisitorbut();
		
		String expectedaddvititle="Add Visitor";
		String actualaddvititle=objvis.getscreentitle();
		Assert.assertEquals(actualaddvititle, expectedaddvititle);
		
		objvis.addvisitordetails(datatest);
		
	}
	

}
