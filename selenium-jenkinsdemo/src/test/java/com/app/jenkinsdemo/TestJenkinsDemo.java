package com.app.jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJenkinsDemo {
	
	@Test
	public void GetTitle()      //called as a Test Method
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
	}

}
