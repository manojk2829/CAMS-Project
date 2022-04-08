package create;

import car.CarClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrandCreation {
	CarClass car;
	public BrandCreation(CarClass car) {
		System.out.println(" -------- BrandCreation Constructer Calling ---------");
	    this.car=car;
	}
	
    @When("Enter all Mandatory Field")
    public void enterMandatory_field() {
    	System.out.println(car.cName="SaritaCar");
    	System.out.println("Enter all Mandatory Field");
    }
    @And("Enter all Mandatory Brand Properties")
    public void brandProperties() {
    	System.out.println("Enter all Mandatory Brand Properties");
    }
    @And("Click on Submit Button")
    public void click_submit_btn() {
    	System.out.println("Click on Submit Button");
    }
    @Then("I validate Brand Created")
    public void validate_brand() {
    	car.cName="Mar..................................s";
    	System.out.println(car.cName);
    	System.out.println("I validate Brand Created");
    }

}
