package app.com.Redbus.HomepageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app.com.Redbus.Base;
import app.com.Redbus.Homepage.HomePage;

public class HomePageTest extends Base {
	
	HomePage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		hp.gettitle();
	}
	

	@Test(priority='2')
	public void testsource()
	{
		hp.clickonsource(); 
		hp.gettitle();  
	}

	@Test(priority='3')
	public void testdestination()
	{
		hp.clickondestination(); 
		hp.gettitle(); 
	}
	
	
	@Test(priority='4')
	public void testdate() throws InterruptedException
	{
		hp.clickondate();
		hp.gettitle();
	}
	
	@Test(priority='5')
	public void testsearch() 
	{
		hp.clickonsearch();
		hp.gettitle();
	}
	
}


