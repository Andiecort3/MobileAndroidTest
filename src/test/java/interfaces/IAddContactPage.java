package interfaces;

import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public interface IAddContactPage {
	
	public void validateFormSection (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void enterName (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void enterContactNumber (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void selectTypeContactNumber (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void enterContactEmail (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void selectTypeContactEmail (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void saveContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
}
