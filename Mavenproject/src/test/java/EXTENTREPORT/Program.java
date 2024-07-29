package EXTENTREPORT;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {
	@Test
public void report()
{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//String screen_shot = driver.getScreenshotAs(OutputType.BASE64);
		String screen_shot1 = driver.getScreenshotAs(OutputType.BASE64);
ExtentSparkReporter esp=new ExtentSparkReporter("ExtentReport//AttachReport.html");
ExtentReports es=new ExtentReports();
es.attachReporter(esp);
ExtentTest test = es.createTest("Program");
test.log(Status.INFO, "Test case attached with extent  report");
//test.addScreenCaptureFromBase64String(screen_shot);
test.addScreenCaptureFromPath(screen_shot1);
es.flush();
	

}

}