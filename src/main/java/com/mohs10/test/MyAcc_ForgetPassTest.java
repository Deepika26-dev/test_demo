package com.mohs10.test;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.MyAcc_ForgetPass;

public class MyAcc_ForgetPassTest extends StartBrowser
{
	@Test
	public void ForgetPass() throws Exception  
	{
		MyAcc_ForgetPass fp = new MyAcc_ForgetPass();
		fp.ForgetPwd("mohs10123@gmail.com");
		
	}

}
