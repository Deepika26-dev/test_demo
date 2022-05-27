package com.mohs10.test;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.MyAcc_Reguse;

public class MyAcc_Regtest extends StartBrowser
{
	
	@Test
	public void RegisterPageTestCase() throws Exception 
	{
			 MyAcc_Reguse  my = new MyAcc_Reguse();
			  my.Register("Mohs10", "Diamond", "mohs10123@gmail.com", "9875462130", "Password", "Password"); 
			  Thread.sleep(5000);  
	}
	

}
