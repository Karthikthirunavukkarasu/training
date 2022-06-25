package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.testbase;
import hms.utillty.commonutility;
import hms.utillty.datepicker;

public class visitorpage extends testbase {
	
	@FindBy(css="h3.box-title")WebElement vistitle;
	@FindBy(css="div.box-tools>a")WebElement addvisbtn;
	@FindBy(xpath="//h4[text()=' Add Visitor']")WebElement screentitle;
	@FindBy(css="form#formadd select[name='purpose']")WebElement purpose;
	@FindBy(css="form#formadd input[name='name']")WebElement Name;
	@FindBy(css="form#formadd input[name='contact']")WebElement phno;
	@FindBy(css="form#formadd input[name='id_proof']")WebElement idp;
	@FindBy(css="form#formadd input[name='pepples']")WebElement nopers;
	@FindBy(css="form#formadd input[name='date']")WebElement datep;
	@FindBy(css="form#formadd input[name='time']")WebElement intime;
	@FindBy(css="form#formadd input[name='out_time']")WebElement outtime;
	@FindBy(css="form#formadd textarea[name='note']")WebElement notes;
	@FindBy(css="form#formadd input[name='file']")WebElement fileup;
	@FindBy(css="form#formadd button[type='submit']")WebElement submit;
	

	public visitorpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getvistitle()
	{
		return vistitle.getText();
		
	}
	
	public void clickonvisitorbut()
	{
		addvisbtn.click();
	}
	
	public String getscreentitle()
	{
		waitforElement(screentitle);
		return screentitle.getText();
		
	}
	
	public void addvisitordetails(String data[])
	{
		Select drp=new Select(purpose);
		drp.selectByVisibleText(data[0]);	
		Name.sendKeys(data[1]);
		phno.sendKeys(data[2]);
		idp.sendKeys(data[3]);
		nopers.sendKeys(data[5]);
		datep.click();
		datepicker dat=new datepicker();
		dat.datpicker(data[4]);
		notes.sendKeys(data[6]);
		commonutility.mousemovement(fileup);
		commonutility.fileupload(data[7]);
		
	}
	
	
}
