package driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.FrameworkConstants;

public class Driver {

	public static WebDriver driver;

	public static void initDriver() 
	{
		if(Objects.isNull(driver)) //To check if previous driver is open or not and will execute if nothing is open, Also can use driver==null
		{
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			driver = new ChromeDriver();
			driver.get("https://google.com");	
		}
	}

	public static void quitDriver()
	{
		if(Objects.nonNull(driver)) //To check if previous driver is closed or not
		{
			driver.quit();
			driver = null;  //Assigning it to null so that initDriver can start correctly
		}
	} 

}
