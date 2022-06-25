	package adminTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hms.base.testbase;
import hms.pages.LoginPage;

public class logintest extends testbase {
	
	LoginPage obj;
	//to access other package classes
	public logintest()
	{
		super();
	}
	//to access test base codes and create object
	@BeforeTest
	public void setup()
	{
		initilization();
		obj=new LoginPage();
	}
	
	@Test
	public void adminlogintest()
	{
		String Expectedpagetitle="Smart Hospital : Hospital Management System";
		String Actualpagetitle=obj.getpagetitle();
		Assert.assertEquals(Expectedpagetitle, Actualpagetitle);
		
		Assert.assertTrue(obj.logodisplay());
		
		String Expectedadmintitle="Admin Login";
		String Actualadmintitle=obj.logintitle();
		Assert.assertEquals(Actualadmintitle, Expectedadmintitle);
		
		obj.Login(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		
		obj.profile();
		
		String Expectedprofname="Super Admin";
		String Actualprofname=obj.profname();
		Assert.assertEquals(Actualprofname, Expectedprofname);
		
		obj.logoutbtn();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		
	}
	

}
