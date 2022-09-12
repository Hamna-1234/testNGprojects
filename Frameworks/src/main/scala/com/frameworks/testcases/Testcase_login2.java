package com.frameworks.testcases;

import org.testng.annotations.Test;

import com.frameworks.pageobjects.Addcustomer_pageobject;
import com.frameworks.pageobjects.Loginpage;

public class Testcase_login2 extends Baseclass {
	@Test
	public void login1() throws InterruptedException
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
	
	Addcustomer_pageobject addcust=new Addcustomer_pageobject(driver);
	
	addcust.customerselection();
	addcust.addcustomer();
	
	
	String email = randomestring() + "@gmail.com";
	addcust.setemail(email);
	
	addcust.setpassword("test123");
	
	addcust.setfirstname("nihaz");
	addcust.setlastname("abdul");
	addcust.setgender("Male");

	
	
	
	
}
}