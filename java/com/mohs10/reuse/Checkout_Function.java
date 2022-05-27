package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.or.Checkoutpage;

public class Checkout_Function {
	public Action aDriver;
	public WebDriver Driver;

	
	public Checkout_Function()
	{
		aDriver = new Action();
		Driver = com.mohs10.base.StartBrowser.driver;
		
	}
	
	public void Tablets() throws Exception{
		com.mohs10.base.StartBrowser.childTest=com.mohs10.base.StartBrowser.parentTest.createNode("Choose a product");
		aDriver.navigateToApplication("https://demo.opencart.com/");
		aDriver.click(Checkoutpage.lnkTblets, "Tablets link");
		aDriver.click(Checkoutpage.imgprdct,"product image");
	    aDriver.click(Checkoutpage.btnAddtocart, "Add to cart");
	    aDriver.click(Checkoutpage.btnItem, "View item");
	    aDriver.click(Checkoutpage.txtCart, "View cart");
	    aDriver.click(Checkoutpage.btnChckout, "Checkout");
	}

}
