package com.mohs10.test;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.MyAcc_ChangePass;

public class MyAcc_ChangePassTest extends StartBrowser
{
	
	@Test
	public void ChangePassLhs() throws Exception  
	{
		MyAcc_ChangePass cpt = new MyAcc_ChangePass();
		cpt.ChangePwdLhs("mohs10dia@gmail.com", "password", "Password", "Password");
		Thread.sleep(3000);
		
	}

	@Test
	public void ChangePassRhs() throws Exception  
	{
		MyAcc_ChangePass cpt = new MyAcc_ChangePass();
		cpt.ChangePwdRhs("mohs10dia@gmail.com", "Password", "Mohs10@1", "Mohs10@1");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void ChangePassSiteMap() throws Exception  
	{
		MyAcc_ChangePass cpt = new MyAcc_ChangePass();
		cpt.ChangePwdSite("mohs10dia@gmail.com", "Mohs10@1", "password", "password");
		Thread.sleep(3000);
		
	}

}
