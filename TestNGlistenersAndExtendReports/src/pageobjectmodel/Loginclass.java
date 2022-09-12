package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {
	WebDriver localdriver;

	Loginclass(WebDriver remotedriver){
		
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver,this);
	}
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
		WebElement txtusername;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
		WebElement txtpassword;
		
		@FindBy(xpath="//*[@id='/app/']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		WebElement btnclick;
		
		
		public void username(String uname)
		{
			txtusername.sendKeys(uname);
		}
		
		public void password(String upass)
		{
			txtpassword.sendKeys(upass);
		}
		
		public void button()
		{
			btnclick.click();
		}

	
	
	

}
