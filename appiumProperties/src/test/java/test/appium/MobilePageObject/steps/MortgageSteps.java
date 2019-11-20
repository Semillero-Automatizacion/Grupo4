package test.appium.MobilePageObject.steps;

import test.appium.MobilePageObject.pageObjects.MortgagePageObjects;

public class MortgageSteps {
	
	MortgagePageObjects mortgagePo;
	
	public void formulario1(String nom, String ape, int ed, String d1, String d2, String pais) throws InterruptedException
	{
		mortgagePo.irAlFormulario1();
		mortgagePo.llenarNombre(nom);
		mortgagePo.llenarApellido(ape);
		mortgagePo.llenarEdad(ed);
		mortgagePo.llenarDir1(d1);
		mortgagePo.llenarDir2(d2);
		mortgagePo.llenarPais(pais);
	}
	
}
