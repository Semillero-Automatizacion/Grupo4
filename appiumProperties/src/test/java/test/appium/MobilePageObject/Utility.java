package test.appium.MobilePageObject;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.windows.WindowsDriver;
import test.appium.MobilePageObject.pageObjects.MobilePageObject;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

public class Utility extends MobilePageObject{
	
	

	public Utility(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void escribir(String path, String content)
	{
		element(By.id(path)).sendKeys(content);	
	}
	
	public void darClick(String path)
	{
		element(By.id(path)).click();
	}
	
	public void darClickX(String path)
	{
		element(By.xpath(path)).click();
	}
	
	public void limpiar(String path)
	{
		element(By.id(path)).clear();
	}
	
	public void selectores(String path, String content)
	{
		new Select(element(By.id(path))).selectByVisibleText(content);
	}
	
	public String correoRandom()
	{
		String nuevoCorreo = RandomStringUtils.randomAlphabetic(6)+"@buuenas.com";
		return nuevoCorreo;
	}
	
	public void espera1(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
	}
	
	public void espera2(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((xpath))));
	}
	
	public boolean esVisible(String xpath)
	{
		return element(By.id(xpath)).isVisible();
	}
	
	public String recortar(String cadena,int inicio, int fin)
	{
		String texto = new String();
		texto = cadena.substring(inicio, fin);
		return texto;
	}
	
	public String contenido(String xpath)
	{
		String content = element(By.xpath(xpath)).getText();
		return content;
	}
	
	public void swipe(String xpathO,String xpathD)
	{
		WebDriver facade = getDriver();
		WebDriver driver = ((WebDriverFacade)facade).getProxiedDriver();
		TouchAction ta = new TouchAction((PerformsTouchActions) driver);
		MobileElement CoorO = (MobileElement) driver.findElement(By.xpath(xpathO));
		Point locationO = CoorO.getLocation();
		MobileElement CoorD = (MobileElement) driver.findElement(By.xpath(xpathD));
		Point locationD = CoorD.getLocation();
		PointOption LocO = new PointOption();
		LocO.withCoordinates(locationO.x, locationO.y);
		PointOption LocD = new PointOption();
		LocD.withCoordinates(locationD.x, locationD.y);
//		PointOption LocD = (PointOption) element(By.xpath(xpathD)).getCoordinates();		
		ta.press(LocD).waitAction().moveTo(LocO).release().perform();
		//new TouchAction((MobileDriver) getDriver()).press(locationD.x,locationD.y).waitAction().moveTo(locationO.x,locationO.y).release().perform();
	}
	
}
