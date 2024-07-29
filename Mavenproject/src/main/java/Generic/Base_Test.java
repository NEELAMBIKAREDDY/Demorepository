package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends Utilitymethods {
	@BeforeSuite
	 public void beforesuite()
	 {
		System.out.println("connection to the server");
	 }

	@BeforeTest
	 public void beforetest()
	 {
		System.out.println("connection to the database");
	 }
	@BeforeClass
	 public void browse()
	 {
	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	 }
	@AfterClass
	 public void closebrowse()
	 {
		driver.quit();
	 }
	@AfterTest
	 public void aftertest()
	 {
		System.out.println("disconnect to the database");
	 }
	
	@AfterSuite
	 public void Aftersuite()
	 {
		System.out.println("disconnect to the server");
	 }



}
