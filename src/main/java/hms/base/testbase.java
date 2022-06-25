package hms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hms.utillty.activitycapture;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	public static Properties prop;
	public static WebDriver driver;
	public static activitycapture acap;
	public static EventFiringWebDriver eve;
	
	
	public testbase()
	{
		try {
			FileInputStream ipconfiq=new FileInputStream("./src/main/java/hms/confiq/appconfiq.properties");
			
			prop=new Properties();
			prop.load(ipconfiq);
				
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void initilization()
	{
		String browser=prop.getProperty("BROWSER");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			if(prop.getProperty("HEADLESS").equals("true"))
			{
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--headless");
				driver=new ChromeDriver(opt);
			}else
			{
			driver=new ChromeDriver();
			}
		}else if(browser.equals("firefox"))
			
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		//basic methods
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		
		acap=new activitycapture();
		eve=new EventFiringWebDriver(driver);
		eve.register(acap);
		driver=eve;
		
		
	}
	
	public void waitforElement(WebElement el)
	{
		WebDriverWait wit=new WebDriverWait(driver, Duration.ofSeconds(40));
		wit.until(ExpectedConditions.visibilityOf(el));
		
	}
}
