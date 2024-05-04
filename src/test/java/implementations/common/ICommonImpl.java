package implementations.common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import interfaces.ICommonPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class ICommonImpl implements ICommonPage {
	
	public void validateOnTheOpenApp (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/continue_button")));
		MobileElement btnContinue = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		Assert.assertTrue(btnContinue.isDisplayed());
		System.out.println("Se valida que nos encontremos en la app");
	}
	public void acceptTyC (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement btnContinue = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		btnContinue.click();
		System.out.println("Clic en el boton de continuar");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		MobileElement btnOK = driver.findElement(By.id("android:id/button1"));
		btnOK.click();
		System.out.println("Clic en el boton de ok");
	}



}
