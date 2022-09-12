package webElements1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://goo.gl/RVdKM9");
		
		String title =driver.getTitle();
		System.out.println("Title of page is :" +title);
		
		String url =driver.getCurrentUrl();
		System.out.println(" Current URL of page is: "+url);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Hamna");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("pk");
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Thrissur");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("hjjdj987@gmail.com");
		//dropdown
		 WebElement drp=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		 Select dropdown =new Select(drp);		
		 
		 System.out.println("Number of choice :" +dropdown.getOptions().size());
		 
		 List<WebElement> options =dropdown.getOptions();
		 
		 for (WebElement e:options)
		 {
			 System.out.println(e.getText());
		 }
		 
	
		 
		 //dropdown.selectByVisibleText("Morning");
		 //dropdown.selectByIndex(2);
		 dropdown.selectByValue("Radio-2");
		 

		 WebElement rdfemale =driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label"));
		 
		 System.out.println(rdfemale.isDisplayed());
		 
		 System.out.println(rdfemale.isEnabled());
		 System.out.println(rdfemale.isSelected());
		
		//*[@id="q15"]/table/tbody/tr[1]/td/label
		 rdfemale.click();
		 
		 System.out.println(rdfemale.isSelected());
		 
		 driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td")).click();
		 
		
	    driver.findElement(By.linkText("Software Testing Tutorials")).click();
	    System.out.println(driver.getTitle());
	    driver.navigate().back(); 
	    
	    driver.findElement(By.partialLinkText("Tools Training")).click();
	    System.out.println(driver.getTitle());
	    driver.navigate().back(); 
	    
	    driver.navigate().back(); 
	    
	    
	    
	}

}
