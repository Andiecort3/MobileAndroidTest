package interfaces;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public interface ICommonPage {
	public void validateOnTheOpenApp (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
	public void acceptTyC (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException;
}
