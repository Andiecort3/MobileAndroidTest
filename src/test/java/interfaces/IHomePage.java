package interfaces;

import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public interface IHomePage {
	
	public void enterFormAddContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void validateTheSavedContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void clickToInvisibleContactOption (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void validateContactsAreNotSeen (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
}
