package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.testbase;
import hms.utillty.datepicker;

public class addptpage extends testbase{
	
	@FindBy(css="h4.box-title")WebElement adpttitle;
	@FindBy(css="form#formadd input[id='name']")WebElement ptname;
	@FindBy(css="form#formadd input[name='guardian_name']")WebElement guardname;
	@FindBy(css="form#formadd select[name='gender']")WebElement gender;
	@FindBy(css="form#formadd select[name='marital_status']")WebElement mrgsts;
	@FindBy(css="form#formadd input[name='contact']")WebElement contect;
	@FindBy(css="form#formadd input[name='email']")WebElement email;
	@FindBy(css="form#formadd input[name='address']")WebElement address;
	@FindBy(css="form#formadd input[name='age']")WebElement age;
	@FindBy(css="form#formadd input[name='month']")WebElement month;
	@FindBy(css="form#formadd select[name='blood_group']")WebElement blood;
	@FindBy(css="form#formadd input[name='height']")WebElement height;
	@FindBy(css="form#formadd input[name='weight']")WebElement weight;
	@FindBy(css="form#formadd input[name='bp']")WebElement bp;
	@FindBy(css="form#formadd textarea[name='symptoms']")WebElement symptoms;
	@FindBy(css="form#formadd textarea[name='known_allergies']")WebElement known_allergies;
	@FindBy(css="form#formadd textarea[name='note']")WebElement note;
	@FindBy(css="form#formadd input[name='appointment_date']")WebElement date;
	@FindBy(css="form#formadd input[name='case']")WebElement casedet;
	@FindBy(css="form#formadd select[name='casualty']")WebElement casualty;
	@FindBy(css="form#formadd select[name='old_patient']")WebElement old;
	@FindBy(css="form#formadd select[name='organisation']")WebElement organisation;
	@FindBy(css="form#formadd input[name='refference']")WebElement refference;
	@FindBy(css="form#formadd select[name='consultant_doctor']")WebElement doct;
	@FindBy(css="form#formadd input[name='amount']")WebElement amount;
	@FindBy(css="form#formadd select[name='payment_mode']")WebElement payment;
	
	
	
	public addptpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String addpttitle()
	{
		return adpttitle.getText();
		
	}
	
	public void addptdetail()
	{
		ptname.sendKeys("ram");
		guardname.sendKeys("raja");
		Select drp=new Select(gender);
		drp.selectByValue("Male");
		Select drp1=new Select(mrgsts);
		drp1.selectByValue("Single");
		contect.sendKeys("9090909090");
		email.sendKeys("gmail.com");
		address.sendKeys("cbe");
		age.sendKeys("28");
		month.sendKeys("12");
		Select drp2=new Select(blood);
		drp2.selectByValue("A-");
		height.sendKeys("5.10");
		weight.sendKeys("85");
		bp.sendKeys("100");
		symptoms.sendKeys("headache");
		known_allergies.sendKeys("alleries");
		note.sendKeys("thankyou");
		//date.click();
		//datepicker datepic=new datepicker();
		//datepic.datpicker("07/07/2042");
		casedet.sendKeys("details");
		Select drp3=new Select(casualty);
		drp3.selectByValue("Yes");
		Select drp4=new Select(old);
		drp4.selectByValue("Yes");
		Select drp5=new Select(organisation);
		drp5.selectByVisibleText("ramdoss");
		refference.sendKeys("kt");
		Select drp6=new Select(doct);
		drp6.selectByVisibleText("guru");
		amount.sendKeys("2000");
		Select drp7=new Select(payment);
		drp7.selectByValue("Other");
		
		
		
		
		
	}
	
	}
