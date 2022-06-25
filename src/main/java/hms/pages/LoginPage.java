package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.testbase;

public class LoginPage extends testbase {

	@FindBy(tagName="img")WebElement Logo;
	@FindBy(css="h3.font-white")WebElement Logtit;
	@FindBy(css="input#email")WebElement usname;
	@FindBy(css="input#password")WebElement psname;
	@FindBy(css="button.btn")WebElement lobtn;
	@FindBy(css="img.topuser-image")WebElement prof;
	@FindBy(xpath="//h5[text()='Super Admin']")WebElement loname;
	@FindBy(css="di.sspass>a:nth-child(3)")WebElement logout;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getpagetitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean logodisplay()
	{
		return Logo.isDisplayed();
		
	}
	
	public String logintitle()
	{
		return Logtit.getText();
		
	}
	
	public void Login(String uname, String pname)
	{
		usname.sendKeys(uname);
		psname.sendKeys(pname);
		lobtn.click();
	}
	
	public void profile()
	{
		prof.click();
	}
	
	public String profname()
	{
		return loname.getText();
		
	}
    
	public void logoutbtn()
	{
		logout.click();
	}
}
