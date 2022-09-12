package com.frameworks.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Addcustomer_pageobject {
	
	
	
	WebDriver ldriver;
	 public Addcustomer_pageobject(WebDriver rdriver){
		 
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
		 
	 }
	 
	 @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	 WebElement customer;
	 
	 @FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
	 WebElement cus;
	 
	 @FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	 WebElement lnkaddcustomer;
	 
	 @FindBy(xpath="//*[@id=\"Email\"]")
	 WebElement txtemail;
	 
	 @FindBy(id="Password")
	 WebElement txtpassword;
	 
	 @FindBy(id="FirstName")
	 WebElement txtfirstname;
	 
	 @FindBy(id="LastName")
	 WebElement txtlastname;
	 
	 @FindBy(xpath="//*[@id=\"Gender_Female\"]")
	 WebElement gendFemale;
	 
	 
	 @FindBy(xpath="//*[@id=\"Gender_Male\"]")
	 WebElement gendmale;
	 

	 
	 
	 public void customerselection()
	 {
		 customer.click();
		 cus.click();
	 }
	 
	 public void addcustomer()
	 {
		 lnkaddcustomer.click();
	 }
	 
	 public void setemail(String email)
	 {
		 txtemail.sendKeys(email);
	 }
	 public void setpassword(String password)
	 {
		 txtemail.sendKeys(password);
	 }
	 
	 public void setfirstname(String firstname)
	 {
		 txtfirstname.sendKeys(firstname);
	 }
	 public void setlastname(String lastname)
	 {
		 txtlastname.sendKeys(lastname);
	 }
	 public void setgender(String gender)
	 {
		 if(gender=="Female")
		 {
		 gendFemale.click();
	 }
		 else if(gender=="Male")
		 {
			 gendmale.click();
		 }
	 }
	
	
	

}
