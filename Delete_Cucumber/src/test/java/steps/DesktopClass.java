package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DesktopClass {
	
	public DesktopClass() {
		System.out.println("DesktopClass________________________*********************************************");
	}
	
	@Before
	public void init(Scenario s) {
		System.out.println("************** INIT ************"  + s.getName());
	}
	
	@After
	public void quite(Scenario s) {
		System.out.println("************** QUITE ************"+ s.getName());
	}

	@And("It should be a {string} system")
	public void it_should_be_a_desktop_system(String system) {
		System.out.println("It should be a "+system+" system");
	}

	@When("I select monitor size as {int} inch")
	public void i_select_monitor_size_as_inch(Integer int1) {
		System.out.println("I select monitor size as "+int1+" inch");
	}

	@And("Create a Corban finished")
	public void create_a_corban_finished() {
		System.out.println("Create a Corban finished");
	}

	@And("I select Hard disk size {int} TB")
	public void i_select_hard_disk_size_tb(int size) {
		System.out.println("I select Hard disk size "+size+ " TB");
	}
}
