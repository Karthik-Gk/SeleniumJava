package constants;

public final class FrameworkConstants 
{
	
	private FrameworkConstants()
	{
		
	}
	
	private static final String CHROMEDRIVERPATH = "/Users/karthik/eclipse-workspace/SeleniumAutomationFramework/src/test/resources/Executables/chromedriver";

	public static String getChromeDriverPath() 
	{
		return CHROMEDRIVERPATH;
	}
 
}
