package sikuliuploadanddownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		//Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("i am trying to download file");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		Thread.sleep(5000);
		if (isFileExist("C://Users/admin/Downloads/info.txt"))
		{
			System.out.println("file exists");
			 
		}
		else
		{
			System.out.println("file  not exists");
			 
		}
		
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("trying to download pdf file");
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		Thread.sleep(5000);
		 if (isFileExist("C://Users/admin/Downloads/info.pdf")) {
			 System.out.println("file exists");
			 
			 
		 }
		 else
		 {
			 System.out.println("file not exists");
		 }

	}
	
	static boolean isFileExist(String path)
	{
		File f =new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
