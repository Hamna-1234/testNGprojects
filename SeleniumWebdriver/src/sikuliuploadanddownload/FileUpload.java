package sikuliuploadanddownload;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		//Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div/div[3]/div[2]]")).click();
		
		/*String images_filepath ="C:\\Drivers\\inputfiles\\";
		String input_filepath ="C:\\Drivers\\pictures captured";
		
		Screen s=new Screen();
		Pattern fileInputTextbox =new Pattern(images_filepath+"textbox.PNG" );
		Pattern openbutton =new Pattern(images_filepath+"open.PNG" );
		
		Thread.sleep(3000);
		
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,  input_filepath+"banana.PNG");
		s.click();*/
		
		
		

	}

}
