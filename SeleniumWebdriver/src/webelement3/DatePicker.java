package webelement3;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String month="December";
		String date ="20";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		driver.switchTo().frame(0);
		
		
		//SelectCurrentDate();
		SelectFutureDate(date,month);
		
	}
		/* public static void SelectCurrentDate()
		{
			
			Calendar cal=Calendar.getInstance();
			int d=cal.get(Calendar.DATE);
			String date =String.valueOf(d);
		    System.out.println(date);
			driver.findElement(By.linkText(date)).click();
			
		
		}*/
	
	   static void SelectFutureDate(String d,String m) {
		   
		   Calendar cal =Calendar.getInstance();
		   int month =cal.get(Calendar.MONTH)+1;
		   System.out.println(month);
		   
		   for(int i=month;i>=1;i++)
		   {
			   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();//next arrow
			   String mon =driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			   System.out.println(mon);
			   if(mon.equals(m))
			   {
				  
				   driver.findElement(By.linkText(mon)).click();
				   break;
				   
			   }
			   
		   }
		   
	   }

		
	


	
}

	


