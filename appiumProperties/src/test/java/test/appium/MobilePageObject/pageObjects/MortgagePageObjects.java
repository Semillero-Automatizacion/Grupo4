package test.appium.MobilePageObject.pageObjects;

import org.openqa.selenium.WebDriver;

import test.appium.MobilePageObject.Utility;
import static org.junit.Assert.assertTrue;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.annotations.findby.By;

public class MortgagePageObjects extends MobilePageObject{

	Utility utilidades;
	
	public MortgagePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String btnMortgage="com.experitest.ExperiBank:id/mortageRequestButton";
	String txtNombre="com.experitest.ExperiBank:id/nameTextField";
	String txtApellido="com.experitest.ExperiBank:id/lastNameTextField";
	String txtEdad="com.experitest.ExperiBank:id/ageTextField";
	String txtDir1="com.experitest.ExperiBank:id/addressOneTextField";
	String txtDir2="com.experitest.ExperiBank:id/addressTwoTextField";
	
	public void irAlFormulario1()
	{
		utilidades.darClick(btnMortgage);
	}
	
	public void llenarNombre(String nom)
	{
		utilidades.espera1(txtNombre);
		utilidades.escribir(txtNombre, nom);
//		element(By.id(path)).sendKeys(content);
	}

	public void llenarApellido(String ape)
	{
		utilidades.escribir(txtApellido, ape);
	}
	
	public void llenarEdad(int ed)
	{
		utilidades.escribir(txtEdad, Integer.toString(ed));
	}
	
	public void llenarDir1(String d1)
	{
		utilidades.escribir(txtDir1, d1);
	}
	
	public void llenarDir2(String d2)
	{
		utilidades.escribir(txtDir2, d2);
	}
	
	public void llenarPais(String pais)
	{
		utilidades.darClick("com.experitest.ExperiBank:id/countryButton");
		int i=1;
		String pathAEvaluar="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView["+i+"]";
		utilidades.espera2(pathAEvaluar);
		while(!utilidades.contenido(pathAEvaluar).contentEquals(pais))
		{
			utilidades.swipe("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]",pathAEvaluar);
			i++;
			pathAEvaluar="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView["+i+"]";
		}
		utilidades.darClickX("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[11]");
	}


}
