package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.testbase;

public class outptpage extends testbase {
	
	@FindBy(css="ul.sidebar-menu>li:nth-child(2)")WebElement optag;
	@FindBy(css="h3.box-title")WebElement optitle;
	@FindBy(css="div.box-tools>a")WebElement addpt;
	
	
	public outptpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void opdoutpt()
	{
		optag.click();
	}

	public String opdouttitle()
	{
		return optitle.getText();
	}
	
	public void addpatiet()
	{
		addpt.click();
	}
}
