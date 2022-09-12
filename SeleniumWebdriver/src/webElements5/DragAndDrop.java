package webElements5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver_win32//chromedriver.exe ");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		

        WebElement source1=driver.findElement(By.id("box6"));
        WebElement target1=driver.findElement(By.id("box106"));
		Actions act =new Actions(driver);
        act.dragAndDrop(source1, target1).build().perform();
        Thread.sleep(5000);
        
        WebElement source2=driver.findElement(By.id("box3"));
        WebElement target2=driver.findElement(By.id("box103"));
	
        act.dragAndDrop(source2, target2).build().perform();
        Thread.sleep(5000);
      
        driver.quit();
	}
	

}
