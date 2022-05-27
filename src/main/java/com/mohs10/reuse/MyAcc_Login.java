package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.MyAcc_Regor;

public class MyAcc_Login 
{

	public Action aDriver;
	public WebDriver driver;
	
	public MyAcc_Login()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	
	//Login
			public void logIn(String email, String pwd) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Opencart site");
				
				aDriver.navigateToApplication("http://demo.opencart.com/");
				
				aDriver.click(MyAcc_Regor.myacc, "My Account Link");
				aDriver.click(MyAcc_Regor.login, "Login Link");
				aDriver.type(MyAcc_Regor.logemail, email, "Login Email");
				aDriver.type(MyAcc_Regor.logpwd, pwd, "Login Password");
				aDriver.click(MyAcc_Regor.loginbtn, "Login Button");
				
			}
			
	//Invalid Login Credentials -- Negative Testing
			public void InvalidLogIn(String email, String pwd) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Opencart site with invalid credentials");
				
				aDriver.navigateToApplication("http://demo.opencart.com/");
				
				aDriver.click(MyAcc_Regor.myacc, "My Account Link");
				aDriver.click(MyAcc_Regor.login, "Login link");
				aDriver.type(MyAcc_Regor.logemail, email, "email text box");
				aDriver.type(MyAcc_Regor.logpwd, pwd, "password text box");
				aDriver.click(MyAcc_Regor.loginbtn, "Login button");
			}

}
