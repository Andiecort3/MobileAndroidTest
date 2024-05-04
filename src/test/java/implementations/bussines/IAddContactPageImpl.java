package implementations.bussines;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import interfaces.IAddContactPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IAddContactPageImpl implements IAddContactPage {

	public void validateFormSection (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		System.out.println(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.android.contactmanager:id/contactNameEditText")));
		MobileElement inputContactName = driver.findElement(By.id("com.example.android.contactmanager:id/contactNameEditText"));
		Assert.assertTrue(inputContactName.isDisplayed());
		System.out.println("Se valida que nos encontremos en el formulario");
	}
	
	public void enterName (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement inputContactName = driver.findElement(By.id("com.example.android.contactmanager:id/contactNameEditText"));
		inputContactName.sendKeys("Irving Gonzalez");
		System.out.println("Se ingreso el nombre del contacto");
	}
	
	public void enterContactNumber (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.example.android.contactmanager:id/contactPhoneEditText")));
		MobileElement inputContactPhone = driver.findElement(By.id("com.example.android.contactmanager:id/contactPhoneEditText"));
		inputContactPhone.sendKeys("1122334455");
		System.out.println("Se ingreso el numero del contacto");
		
	}
	
	public void selectTypeContactNumber (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement comboboxContactPhoneType = driver.findElement(By.id("com.example.android.contactmanager:id/contactPhoneTypeSpinner"));
		comboboxContactPhoneType.click();
		System.out.println("Clic en el combobox de Tipo de numero del contacto");
		
		Thread.sleep(2000);
		List<MobileElement> contactPhoneTypes = driver.findElements(By.className("android.widget.CheckedTextView"));
		MobileElement checkboxContactPhoneType = contactPhoneTypes.get(2);
		checkboxContactPhoneType.click();
		System.out.println("Clic en la opcion de Mobile");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Celular']")));
		MobileElement comboboxContactPhoneTypeValidation = driver.findElement(By.xpath("//android.widget.TextView[@text='Celular']"));
		Assert.assertTrue(comboboxContactPhoneTypeValidation.isDisplayed());
		System.out.println("Se valida que se selecciono la opcion de Celular");
	}
	
	public void enterContactEmail (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement inputContactEmail = driver.findElement(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
		inputContactEmail.sendKeys("prueba@test.com");
		System.out.println("Se ingreso el email del contacto");
	}
	
	public void selectTypeContactEmail (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement comboboxContactEmailType = driver.findElement(By.id("com.example.android.contactmanager:id/contactEmailTypeSpinner"));
		comboboxContactEmailType.click();
		System.out.println("Clic en el combobox de Tipo de email del contacto");
		
		Thread.sleep(2000);
		List<MobileElement> contactEmailTypes = driver.findElements(By.className("android.widget.CheckedTextView"));
		MobileElement checkboxContactEmailsType = contactEmailTypes.get(1);
		checkboxContactEmailsType.click();
		System.out.println("Clic en la opcion de Work");
		
		MobileElement comboboxContactEmailTypeValidation = driver.findElement(By.xpath("//android.widget.TextView[@text='Trabajo']"));
		Assert.assertTrue(comboboxContactEmailTypeValidation.isDisplayed());
		System.out.println("Se valida que se selecciono la opcion de Trabajo");
	}
	
	public void saveContact (AppiumDriver<MobileElement> driver, WebDriverWait wait) throws InterruptedException{
		MobileElement btnSave = driver.findElement(By.id("com.example.android.contactmanager:id/contactSaveButton"));
		btnSave.click();
		System.out.println("Clic en el boton guardar");
	}

}
