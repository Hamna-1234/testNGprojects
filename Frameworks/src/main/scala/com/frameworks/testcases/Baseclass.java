package com.frameworks.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.frameworks.utilities.Readconfig;

public class Baseclass  {
	Readconfig readconfig =new Readconfig();
	public String Baseurl=readconfig.getApplicationURL();
	public String username=readconfig.getUseremail();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
	logger=logger.getLogger("Frameworks");
	PropertyConfigurator.configure("log4j.properties");
	
		if (br.equals("chrome")) {
		// opens the browser
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		
	
		
		
	      }
	}
	
	@AfterClass
	public void logout1()
	{
		driver.quit();
	}
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

	
	
	
	
}
