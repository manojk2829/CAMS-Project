package edit;

import car.CarClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrandEdit {
	
	CarClass car;
	public BrandEdit(CarClass car) {
		System.out.println(" ---------- EditBrand Constructer Calling -----------");
	    this.car=car;
	}
	
	@When("Edit all Mandatory Field")
	public void edit_all_mandatory_field() {
		car.cName="ManojCar";
		System.out.println(car.cName);
	    System.out.println("Edit all Mandatory Field");
	}

	@And("Edit all Mandatory Brand Properties")
	public void edit_all_mandatory_brand_properties() {
		 //dr.get("https://google.com/");
		 System.out.println("Edit all Mandatory Brand Properties");
	}
	
	@And("Click on update Button")
	public void click_update() {
		System.out.println("Click on update Button");
	}

	@Then("I validate Edit Feature")
	public void i_validate_edit_feature() {
		System.out.println("I validate Edit Feature");
		System.out.println(car.cName);
	}
}
