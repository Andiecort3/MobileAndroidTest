package mappings;

import java.net.MalformedURLException;
import org.openqa.selenium.support.ui.WebDriverWait;
import implementations.helpers.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import interfaces.ICommonPage;
import implementations.common.ICommonImpl;
import interfaces.IHomePage;
import implementations.bussines.IHomePageImpl;

public class HomePage {
	
	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;
	
	Hooks hooks = new Hooks();
	ICommonPage common = new ICommonImpl();  
	IHomePage homePage = new IHomePageImpl();
	
	@Before
    public void setUp() throws MalformedURLException {
		hooks.inicializar();
		driver = (AppiumDriver<MobileElement>) hooks.getDriver();
		wait = hooks.getDriverWait();
    }
	
	@After
    public void CloseSesion() {
		driver.quit();
    }
	
	@Given("^we are inside the app$")
	public void weareInsideTheApp() throws Throwable{
		common.validateOnTheOpenApp(driver, wait);
		common.acceptTyC(driver, wait);
		
	}
	
	@Given("^click to add contact button$")
	public void clickToAddContactButton() throws Throwable{
		homePage.enterFormAddContact(driver, wait);
		
	}
	
	@Then("^the saved contact is displayed$")
	public void theSavedContactIsDisplayed() throws Throwable{
		homePage.validateTheSavedContact(driver, wait);
		
	}
	
    @When("^click to invisible contacts option$")
    public void clickToInvisibleContactsOption() throws Throwable{
    	homePage.clickToInvisibleContactOption(driver, wait);
 
    }
    
    @Then("^contacts are not seen$") 
    public void contactsAreNotSeen () throws Throwable {
    	homePage.validateContactsAreNotSeen(driver, wait);
    	
    }
	
}
