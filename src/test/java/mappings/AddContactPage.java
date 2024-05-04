package mappings;

import java.net.MalformedURLException;



import org.openqa.selenium.support.ui.WebDriverWait;

import implementations.helpers.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import interfaces.IAddContactPage;
import implementations.bussines.IAddContactPageImpl;

public class AddContactPage {

	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;
	
	Hooks hooks = new Hooks();
	IAddContactPage contactPage = new IAddContactPageImpl();
	
	
	
	@BeforeStep
	public void getingDrivers() throws MalformedURLException {
 
		driver = (AppiumDriver<MobileElement>) hooks.getDriver();
		wait = hooks.getDriverWait();
		
    }
	
	@Given("^add to contact name$")
	public void addToContactName() throws Throwable{
		contactPage.validateFormSection(driver, wait);
		contactPage.enterName(driver, wait);
		
		
	}
	
	@Given("^add to contact phone$")
	public void addToContactPhone() throws Throwable{
		contactPage.enterContactNumber(driver, wait);

	}
	
	@Given("^select option celular$")
	public void selectOptionCelular() throws Throwable{
		contactPage.selectTypeContactNumber(driver, wait);

	}
	
	@Given("^add to contact email$")
	public void addToContactEmail() throws Throwable{
		contactPage.enterContactEmail(driver, wait);
	}
	
	@Given("^select option work$")
	public void selectOptionWork() throws Throwable{
		contactPage.selectTypeContactEmail(driver, wait);
	}
	
	@When("^click to save$")
	public void clickToSave() throws Throwable{
		contactPage.saveContact(driver, wait);
	}
	
}
