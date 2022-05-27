package com.mohs10.test;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.MyAcc_Logout;

public class MyAcc_LogoutTest extends StartBrowser
{
	@Test
	public void Logout() throws Exception  
	{
		MyAcc_Logout lg = new MyAcc_Logout();
		lg.Logout("mohs10123@gmail.com", "Password");
		
	}

}
