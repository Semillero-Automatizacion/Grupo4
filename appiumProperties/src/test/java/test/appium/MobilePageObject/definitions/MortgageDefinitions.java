package test.appium.MobilePageObject.definitions;

import java.net.MalformedURLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.appium.MobilePageObject.steps.MortgageSteps;

public class MortgageDefinitions {
	
	@Steps
	MortgageSteps mortgageStep;
	
	@When("^ingreso a la opcion Mortgage lleno el primer formulario \"([^\"]*)\"\"([^\"]*)\"(\\d+)\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresoALaOpcionMortgageLlenoElPrimerFormulario(String nombre, String apellido, int edad, String dir1, String dir2, String pais) throws InterruptedException {
	    mortgageStep.formulario1(nombre, apellido, edad, dir1, dir2, pais);
	}

	@When("^lleno el segundo formulario \"([^\"]*)\"(\\d+)\"([^\"]*)\"(\\d+)$")
	public void llenoElSegundoFormulario(String arg1, int arg2, String arg3, int arg4) {
	    
	}



}
