package implementations.helpers;

import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
	
	public static AppiumDriver<MobileElement> driver;
	public static WebDriverWait wait;
	
	String PROJECT_ROOT = System.getProperty("user.dir");
    String ANDROID_APK_PATH = "/src/test/resources/ContactManager.apk";
    
    public void inicializar() throws MalformedURLException {
    	
    	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 7a API 33 android V13");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("app", new File(PROJECT_ROOT + ANDROID_APK_PATH).getAbsolutePath());
        caps.setCapability("appPackage", "com.example.android.contactmanager");
        caps.setCapability("appActivity", "com.example.android.contactmanager.ContactManager");
        //caps.setCapability("noReset", true);
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), caps);
        wait = new WebDriverWait(driver,40);
	}
	
	public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
	 	
	public WebDriverWait getDriverWait() {
		return wait;
	}
	
}
