package implementations.bussines;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import interfaces.IHomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import implementations.helpers.CustomKeywords;

public class IHomePageImpl implements IHomePage {
	
	CustomKeywords keywordHelper = new CustomKeywords();
	
	public void enterFormAddContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.android.contactmanager:id/addContactButton")));
		MobileElement btnAddContacts = driver.findElement(By.id("com.example.android.contactmanager:id/addContactButton"));
		btnAddContacts.click();
		System.out.println("Clic en el boton de agregar contactos");
	}
	public void validateTheSavedContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"false\" and @text=\"Irving Gonzalez\"]")));
		MobileElement labelContactName = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"false\" and @text=\"Irving Gonzalez\"]"));
		Assert.assertTrue(labelContactName.isDisplayed());
		System.out.println("Se valida que se agrego el contacto");
	}
	public void clickToInvisibleContactOption (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.android.contactmanager:id/showInvisible")));
		MobileElement invisibleContactCheckBox = driver.findElement(By.id("com.example.android.contactmanager:id/showInvisible")); 
		invisibleContactCheckBox.click();
		System.out.println("Se selecciona el checkbox solo contactos invisibles");
	}
	public void validateContactsAreNotSeen (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"false\" and @text=\"Irving Gonzalez\"]")));
		Boolean labelContactName = keywordHelper.isElementPresent(driver, MobileBy.xpath("//android.widget.TextView[@content-desc=\"false\" and @text=\"Irving Gonzalez\"]"));
		Assert.assertFalse(labelContactName);
		System.out.println("Se valida que se agrego el contacto");
	}

}
