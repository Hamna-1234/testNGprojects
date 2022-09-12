package extendReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Loglevels {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports =new ExtentReports();
		ExtentSparkReporter sparkreporter =new ExtentSparkReporter("C:\\Excel Files\\Extendreports");
		extentReports.attachReporter(sparkreporter);
		extentReports.createTest("Test1")
		.log(Status.FAIL,"<b>failed</b>")
		.log(Status.PASS,"<b><i>passed</b></i>")
		.log(Status.INFO,"info")
		.log(Status.INFO,"<i>info</i>");
		
		
		 List<String>listdata=new ArrayList<>();
		 listdata.add("hamna");
		 listdata.add("nihaz");
		 listdata.add("heyza");
		 
		 Map<Integer,String>mapdata=new HashMap<>();
		 mapdata.put(101,"hamna");
		 mapdata.put(102,"nihaz");
		 mapdata.put(103,"heyza");
		 
		extentReports.createTest("list based tesxt")
		.info(MarkupHelper.createOrderedList(listdata));
		extentReports.createTest("hashmap based tesxt")
		.info(MarkupHelper.createOrderedList(mapdata));
		extentReports.createTest("highlight based tesxt")
		.info(MarkupHelper.createLabel("this is a highlighted message",ExtentColor.RED));
		
		
		

		
		
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("C:\\Excel Files\\Extendreports\\index.html").toURI());


	}

}
