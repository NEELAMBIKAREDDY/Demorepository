package pom.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Utilitymethods;

public class BasePage extends Utilitymethods {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
