package paramaterisation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listenersextent implements ITestListener {
	
	
	
	public ExtentSparkReporter sparkreporter;//responsible for templates
	public ExtentReports extent;
	public ExtentTest logger;
	

	
	public void onStart(ITestContext result) {
		
		sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports\\myreport.html");
				
		try {
			sparkreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extent =new ExtentReports();
		
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("hostname", "local host");
		extent.setSystemInfo("environment","qa");
		
		sparkreporter.config().setDocumentTitle("new document");
		sparkreporter.config().setReportName("first report");
		
		
	}


	public void onTestSuccess(ITestResult result) {
	
		logger=extent.createTest(result.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
	}

	
	public void onTestFailure(ITestResult result) {
		
		logger=extent.createTest(result.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
		String screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".png";
		logger.fail("screenshot is below"+logger.addScreenCaptureFromPath(screenshotpath));
		
	
	}

	
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("test skipped");
	}

	public void onFinish(ITestResult result) throws IOException
	{
		extent.flush();
		Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\myreport.html").toURI());

	}
	
	
	
	
	
	
	
	
}
