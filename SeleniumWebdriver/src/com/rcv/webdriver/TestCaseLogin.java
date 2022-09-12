package com.rcv.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseLogin {

	public static void main(String[] args) {
		//open browser inside brackets we have key and value,value is location and key is which driver 
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
//make an object of chromedriver so we can access all methods and classes of chrome
		ChromeDriver driver =new ChromeDriver();

		//open url provide url in bracket
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//when page is open we have to find the username element as their are many elements including pictures are element so right click inspect then html code is shown so from that html attributes or java locators choose
		//whenever find element store it to variable which is of webelement type
		WebElement Usernametxt =driver.findElement(By.id("txtUsername"));
		
		Usernametxt.sendKeys("Admin");
		//in single line 
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin);
		//enter password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//submit or login
		
		driver.findElement(By.name("Submit")).click();
		
		//capture the title
		String act_title =driver.getTitle();
		String exp_title ="orangeHRM";
		
		if (act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
			
		}
		
		driver.close();
		driver.quit();
	}
	

}
