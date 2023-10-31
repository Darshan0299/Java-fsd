package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.SearchPage;

public class TestSearchPage extends TestBase {
	
	SearchPage sp;
	
	@BeforeMethod
	
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
	}
	

	
	@Test
	public void searchProduct() throws InterruptedException
	{
		sp.searchproduct();
		Thread.sleep(3000);
		sp.selectproduct();
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	

}
