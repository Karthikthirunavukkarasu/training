package hms.utillty;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import hms.base.testbase;

public class commonutility extends testbase{
	
	//mouse movement
	public static void mousemovement(WebElement el)
	{
         Actions act=new Actions(driver);
		act.click(el).build().perform();
	}

	//file upload
	
	public static void fileupload(String loc)
	{
		StringSelection sel=new StringSelection(loc);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot rb;
		try {
			Thread.sleep(4000);
			rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//screenshot
	public static void takescreenshot()
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"./screenshots/"+System.currentTimeMillis()+".png");
		 
		try {
			FileHandler.copy(source, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
