package com.frameworks.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.frameworks.pageobjects.Loginpage;

public class Testcase_login extends Baseclass {
	
	
	
	@Test

	public void login() throws InterruptedException, IOException
	{
		driver.get(Baseurl);
	    logger.info("url is opened");
		
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		logger.info("username given");
		lp.setpassword(password);
		logger.info("password given");
		lp.clicklogin();
		logger.info("login succesfully");
		
		Thread.sleep(3000);
		
		
		if(driver.getCurrentUrl().equals("https://admin-demo.nopcommerce.com/admin/"))
		{
			captureScreen(driver,"login");
			Assert.assertTrue(true);
			lp.logout();
		}
	}
	
	
	
}