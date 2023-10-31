package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Base.TestBase;


public class Homepage extends TestBase {
	 
	Actions a = new Actions(driver);
	//create pagefactory
	//this code will find the element using xpath and store it in the webelemnet object
	
	@FindBy(xpath= "//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath= "//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath= "//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath= "//a[text()='Desktops']")
	WebElement desktop;
	
	@FindBy(linkText= "Mac (1)")
	WebElement macdropdown;
	
	
	//create constructor of current class to initiate the elemnet
	//everey page class will have a constructor initiating the elments
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//driver.findelemment(locatore)
	// we will now write action methods,but theses methods will not be executed here
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	public void clickonMyAccount()
	{
		myaccount.click();
		
	}
	
	public void clickonLogin()
	{
		login.click();
	}
	
	public void clickonRegister()
	{
		register.click();
	}
	
	public void clickonMac() throws InterruptedException
	{
		a.moveToElement(desktop).build().perform();
		
		Thread.sleep(1500);
		
		macdropdown.click();
		
	}
	
	
	
	
	

}
