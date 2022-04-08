package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import car.CarClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommanClass {
	
	public WebDriver dr;
	
	CarClass car;
	public CommanClass(CarClass car) {
		this.car=car;
		System.out.println("Comman Class Constructer Called..");		
	}
	
	@Given("I want to buy a {string}")
	public void i_want_to_buy_a_pc(String item) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Lenovo\\Software\\Browser_exe\\chromedriver.exe");
	    //dr=new ChromeDriver();
		//dr.manage().window().maximize();
	    System.out.println("I want to buy a "+item);
	}

	@And("^PC must be (.*) company$")
	public void pc_must_be_dell_company(String companyName) {
	    System.out.println("PC must be "+companyName+" company");
		dr.get("https://google.com/");
	}

}
