package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import driver.Driver;

public final class HomepageTest extends BaseTest {

	@Test
	public void test3() 
	{
		Driver.driver.findElement(By.name("q")).sendKeys("Testing selenium",Keys.ENTER);

	}
}
