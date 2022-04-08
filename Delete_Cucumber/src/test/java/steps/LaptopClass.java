package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopClass {

	@And("It should be a {string}")
	public void it_should_be_a_laptop(String system) {
		System.out.println("It should be a "+system);
	}

	@When("I select screen size as {int} inch")
	public void i_select_screen_size_as_inch(int screensize) {
		System.out.println("I select screen size as "+screensize+" inch");
	}

	@And("a {string} finished")
	public void a_silver_finished(String color) {
		System.out.println("a "+color+" finished");
	}

	@And("^I select Hard disk size (//d+) TB$")
	public void hard_disk_size(int size) {
		System.out.println("I select Hard disk size "+size+" TB");
	}

	@And("Ram must be {int} GB")
	public void ram_size(int ramSize) {
		System.out.println("Ram must be "+ramSize+" GB");
	}	
	
	@Then("Price must be less then {double}")
	public void laptop_price(double price) {
		System.out.println("Laptop Price must be less then "+ price);
	}

}
