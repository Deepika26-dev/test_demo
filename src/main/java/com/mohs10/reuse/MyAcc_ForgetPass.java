package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.MyAcc_Regor;

public class MyAcc_ForgetPass 
{
	public Action aDriver;
	public WebDriver driver;
	
	public MyAcc_ForgetPass()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	//Forget Password
	public void ForgetPwd(String email) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Forget password link to Opencart site");
		
		aDriver.navigateToApplication("http://demo.opencart.com/");
		
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.login, "Login Link");
		aDriver.click(MyAcc_Regor.forgetpwd, "Forget Password Link");
		aDriver.type(MyAcc_Regor.forgetEmail, email, "Email Address");
		aDriver.click(MyAcc_Regor.forgetconbtn, "Forget Continue Button");
		
	}

}
