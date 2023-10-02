package seleniumDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maxamize the window
		
		driver.manage().deleteAllCookies(); // delete the cookies of the browser
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		// javascriptexecutor is interface in selenium 
		//it is used to execute is script through selenium webdriver
		//javascript is a programming language which is used to interact with html pages
		//ans selenium uses javascriptexcutor to perform this interaction with webpages
		//ith has 2 methods --> executeScript() and ExecuteAsyncScript()
		//using these methods selenium will execute the script on the selected window
		
		// here js is reference object to javascriptExceutor
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('datepicker').value='11/12/2024'");
		
		
	}

}
