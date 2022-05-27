package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.MyAcc_Regor;

public class MyAcc_Reguse 
{
	
	public Action aDriver;
	public WebDriver driver;
	
	public MyAcc_Reguse()
	{
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	// Registration process
			public void Register(String Firstname, String Lastname, String Email, String Phone, String Pwd, String ConfirmPwd) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in Opencart site");
				
				aDriver.navigateToApplication("http://demo.opencart.com/");
				
				aDriver.click(MyAcc_Regor.myacc, "My Account Link");
				aDriver.click(MyAcc_Regor.lnkRegister, "Register link");
				
				aDriver.type(MyAcc_Regor.fname,  Firstname, "FirstName text box");
				aDriver.type(MyAcc_Regor.lname, Lastname, "LastName text box");
				aDriver.type(MyAcc_Regor.email, Email, "Email text box");
				aDriver.type(MyAcc_Regor.phone, Phone, "Telephone text box");
				aDriver.click(MyAcc_Regor.radiobtn, "Radio button Subscribe");
				aDriver.type(MyAcc_Regor.Pwd, Pwd, "password text box");
				aDriver.type(MyAcc_Regor.Cnfpwd, ConfirmPwd, "confirm password text box");
				aDriver.click(MyAcc_Regor.chkbox, "Privacy Checkbox");
				aDriver.click(MyAcc_Regor.regcontinuebtn, "Continue button");
				aDriver.click(MyAcc_Regor.regcontinueBtn, "Continue Button");
			}

}

