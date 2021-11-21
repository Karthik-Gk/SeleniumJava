package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driver.Driver;

public final class LoginPageTest extends BaseTest{

	@Test
	public void test1() 
	{
		Driver.driver.findElement(By.name("q")).sendKeys("Testing",Keys.ENTER);
	}

	@Test
	public void test2() 
	{
		Driver.driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}
}
