package com.frameworks.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.frameworks.pageobjects.Loginpage;
import com.frameworks.utilities.XLUtils;



public class Testcase_login1 extends Baseclass {
	
	
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException, IOException {
		
		driver.get(Baseurl);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		
		Loginpage lp=new Loginpage(driver);
				
		lp.setusername(username);
		logger.info("username given");
		lp.setpassword(password);
		logger.info("password given");
		lp.clicklogin();
		logger.info("login succesfully");
		
		Thread.sleep(3000);

	}
		
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path="C://Users//admin//Downloads//Part6-Adding+DataDrivenTestcase//Part6-Adding DataDrivenTestcase//testData//LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		
		return logindata;
		
	}
	
	
}

