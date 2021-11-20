package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class BaseTest {

	protected BaseTest() //Used Protected Access modifier as it needs to used by Child class
	{

	}



	@BeforeMethod
	public void setUp()
	{
		Driver.initDriver();
	}

	@AfterMethod
	public void TearDown()
	{
		Driver.quitDriver();
	}


}
