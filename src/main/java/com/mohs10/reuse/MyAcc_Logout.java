package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.MyAcc_Regor;

public class MyAcc_Logout 
{
	
	public Action aDriver;
	public WebDriver driver;
	
	public MyAcc_Logout()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	//Login and Logout
	public void Logout(String email, String pwd) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Logout to Opencart site");
		
		aDriver.navigateToApplication("http://demo.opencart.com/");
		
		//First Login
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.login, "Login Link");
		aDriver.type(MyAcc_Regor.logemail, email, "Login Email");
		aDriver.type(MyAcc_Regor.logpwd, pwd, "Login Password");
		aDriver.click(MyAcc_Regor.loginbtn, "Login Button");
		
		//Then Logout
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.logout, "Logout link");
		aDriver.click(MyAcc_Regor.logoutconbtn, "Logout Continue button");
		
	}

}
