package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.testbase;

public class frontofficepage extends testbase{
	
	
	@FindBy(css="ul.sidebar-menu>li")WebElement froffice;
	@FindBy(css="h3.box-title")WebElement fpagtit;
	@FindBy(css="div.box-tools>a:nth-child(2)")WebElement visbook;
	
	public frontofficepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonfroffice()
	{
		froffice.click();
	}
	
	public String getfrpagetitle()
	{
		return fpagtit.getText();
	}
	
	public void clickonvisitorbook()
	{
		visbook.click();
	}

}
