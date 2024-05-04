package implementations.helpers;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CustomKeywords {
	
	public  boolean isElementPresent(AppiumDriver<MobileElement> driver, By by) {
		try {
			driver.findElement(by);
			return true;
		}catch (org.openqa.selenium.NoSuchElementException e){
			return false;
			
		}
	}

}
