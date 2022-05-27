package com.mohs10.or;

import org.openqa.selenium.By;

public class MyAcc_Regor 
{
		//Register
		
			public static By myacc = By.xpath("//span[normalize-space()='My Account']");
			public static By lnkRegister = By.xpath("//a[normalize-space()='Register']");
			public static By fname = By.xpath("//input[@id='input-firstname']");
			public static By lname = By.xpath("//input[@id='input-lastname']");
			public static By email = By.xpath("//input[@id='input-email']");
			public static By phone = By.xpath("//input[@id='input-telephone']");
			public static By Pwd = By.xpath("//input[@id='input-password']");
			public static By Cnfpwd = By.xpath("//input[@id='input-confirm']");
			public static By radiobtn = By.xpath("//input[@value='0']");
			public static By chkbox = By.xpath("//input[@name='agree']");
			public static By regcontinuebtn = By.xpath("//input[@value='Continue']"); 
			public static By regcontinueBtn = By.xpath("//a[@class='btn btn-primary']"); 
		
		//Login 
			
			public static By login = By.xpath("//a[normalize-space()='Login']"); //My acc -- login link
			public static By logemail = By.xpath("//input[@id='input-email']"); //email textbox field
			public static By logpwd = By.xpath("//input[@id='input-password']"); // password field
			public static By loginbtn = By.xpath("//input[@value='Login']"); // Login btn
		
		//Logout
			
			public static By logout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
			public static By logoutconbtn = By.xpath("//a[@class='btn btn-primary']");			
			
		//Forgot Password
			
			public static By forgetpwd = By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']");
			public static By forgetEmail = By.xpath("//input[@id='input-email']");
			public static By forgetconbtn = By.xpath("//input[@value='Continue']");
			
		//Change Password
			
			//RHS_Link
			public static By chgpasslhslink = By.xpath("//a[normalize-space()='Change your password']");
			public static By resetpasstextbox = By.xpath("//input[@id='input-password']");
			public static By cnfpasstextbox = By.xpath("//input[@id='input-confirm']");
			public static By chgpassconbtn = By.xpath("//input[@value='Continue']");
			
			//LHS_link
			public static By chgpassrhslink = By.xpath("//a[normalize-space()='Password']");
			
			//Site_Map Link
			public static By SiteMaplink = By.xpath("//a[normalize-space()='Site Map']");
			public static By Sitechngpasslink = By.xpath("//a[normalize-space()='Password']");
			
			
	}



























