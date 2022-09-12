package webElement4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesAndRows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		System.out.println(rows);
		
        int columns =driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/th")).size();
        System.out.println(columns);
        
        System.out.println("BookName"+"    "+"Author"+"    "+"subject"+"    "+"price"+"    "+"rate");
        
        for(int r=2;r<=rows;r++)
        {
        	for(int c=1;c<=columns;c++)
        	{
        		String value=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
        		System.out.print(value+"    ");
        	}
        	System.out.println();
        }
	}

}
