package com.mohs10.test;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.MyAcc_Login;

public class MyAcc_LoginTest extends StartBrowser
{
	
		//Testing with Valid inputs
		@Test
			  public void ValidLoginTest() throws Exception 
		{
				  MyAcc_Login lg = new MyAcc_Login();
				  lg.logIn("mohs10123@gmail.com", "Password");
				  Thread.sleep(5000);
	    }
		
		//Testing with InValid inputs -- Negative Testing	
		@Test
			  public void InvalidLogInTest() throws Exception 
		{
				  MyAcc_Login lg1 = new MyAcc_Login();
				  lg1.InvalidLogIn("Invalid@gmail.com", "Wrngpass");				  
				  Thread.sleep(5000);
	
		}
		//Add Priority to this test class because negative method is running first
}
