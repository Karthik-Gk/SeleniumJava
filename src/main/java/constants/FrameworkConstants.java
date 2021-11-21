package constants;

public final class FrameworkConstants  //Other class cannot extend this as Final keyword is used
{
	
	private FrameworkConstants()    //Private constructor is used to neglect creating object for this class to access
	{
		
	}
	
	private static final String CHROMEDRIVERPATH = "/Users/karthik/eclipse-workspace/SeleniumAutomation/src/test/resources/Executables/chromedriver";  //Final used so Override can't happen and it always has same value

	public static String getChromeDriverPath()   //generated a Getter since CHROMEDRIVERPATH is declared as Private
	{
		return CHROMEDRIVERPATH;
	}
 
}