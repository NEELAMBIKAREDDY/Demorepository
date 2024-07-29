package Test_Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.ReadExcel;
import pom.script.BasePage;
import pom.script.RegisterPage;

public class Register_Test extends Base_Test {



@DataProvider(name="data")
public static  Object[][] Excel() throws EncryptedDocumentException, IOException
{
	return ReadExcel.fetchexcel();
	
}

@Test(dataProvider = "data")
public void testcase(String Firstname,String Lastname,String Email,String password,String confirmpassword)
{
	driver.get("https://demowebshop.tricentis.com/");
	RegisterPage r=new RegisterPage(driver);
	r.getFirstName().sendKeys(Firstname);
	r.getLastName().sendKeys(Lastname);
	r.getEmail().sendKeys(Email);
	r.getPassword().sendKeys(password);
	r.getConfirmPassword().sendKeys(confirmpassword);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
