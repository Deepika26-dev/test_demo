package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.MyAcc_Regor;

public class MyAcc_ChangePass
{
	
	public Action aDriver;
	public WebDriver driver;
	
	public MyAcc_ChangePass()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	//Change Password LHS Link
	public void ChangePwdLhs(String email, String loginpwd, String resetpassword, String cnfpassword) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Change password LHS link to Opencart site");
		
		aDriver.navigateToApplication("http://demo.opencart.com/");
		
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.login, "Login Link");
		aDriver.type(MyAcc_Regor.logemail, email, "Login Email Address");
		aDriver.type(MyAcc_Regor.logpwd, loginpwd, "Login with Valid Password");
		aDriver.click(MyAcc_Regor.loginbtn, "Login Button");
		
		aDriver.click(MyAcc_Regor.chgpasslhslink, "MyAccount Change Password LHS Link");
		
		aDriver.type(MyAcc_Regor.resetpasstextbox, resetpassword,"Reset Password Text Box" );
		aDriver.type(MyAcc_Regor.cnfpasstextbox, cnfpassword,"Confirm Password Text Box" );
		aDriver.click(MyAcc_Regor.chgpassconbtn, "Change password Continue Button");
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.logout, "Logout Link");
		aDriver.click(MyAcc_Regor.logoutconbtn, "Logout continue btn");
	}
	
	//Change Password RHS Link
	public void ChangePwdRhs(String email, String loginpwd, String resetpassword, String cnfpassword) throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Change password LHS link to Opencart site");
		
		aDriver.navigateToApplication("http://demo.opencart.com/");
		
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.login, "Login Link");
		aDriver.type(MyAcc_Regor.logemail, email, "Login Email Address");
		aDriver.type(MyAcc_Regor.logpwd, loginpwd, "Login with Valid Password");
		aDriver.click(MyAcc_Regor.loginbtn, "Login Button");
		
		aDriver.click(MyAcc_Regor.chgpassrhslink, "Change Password RHS Link");
		
		aDriver.type(MyAcc_Regor.resetpasstextbox, resetpassword,"Reset Password Text Box" );
		aDriver.type(MyAcc_Regor.cnfpasstextbox, cnfpassword,"Confirm Password Text Box" );
		aDriver.click(MyAcc_Regor.chgpassconbtn, "Change password Continue Button");
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.logout, "Logout Link");
		aDriver.click(MyAcc_Regor.logoutconbtn, "Logout continue btn");
	}
	
	//Change Password SiteMap Link
	public void ChangePwdSite(String email, String loginpwd, String resetpassword, String cnfpassword) throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Change password LHS link to Opencart site");
		
		aDriver.navigateToApplication("http://demo.opencart.com/");
		
		aDriver.click(MyAcc_Regor.SiteMaplink, "SiteMap Link");
		aDriver.click(MyAcc_Regor.Sitechngpasslink, "SiteMap Change Password Link");
		
		aDriver.type(MyAcc_Regor.logemail, email, "Login Email Address");
		aDriver.type(MyAcc_Regor.logpwd, loginpwd, "Login with Valid Password");
		aDriver.click(MyAcc_Regor.loginbtn, "Login Button");
		
		aDriver.type(MyAcc_Regor.resetpasstextbox, resetpassword,"Reset Password Text Box" );
		aDriver.type(MyAcc_Regor.cnfpasstextbox, cnfpassword,"Confirm Password Text Box" );
		aDriver.click(MyAcc_Regor.chgpassconbtn, "Change password Continue Button");
		aDriver.click(MyAcc_Regor.myacc, "My Account Link");
		aDriver.click(MyAcc_Regor.logout, "Logout Link");
		aDriver.click(MyAcc_Regor.logoutconbtn, "Logout continue btn");
	}

}



















