package cnn;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cnn_main.TopLinkClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CNNClass {
	
	@Given("I open browser {string}")
	public void i_chrome_browser(String browserName) {
	   System.out.println("I open browser "+browserName);
	}

	@When("go to the site news {string}")
	public void go_to_the_cnn_news_http_www_cnn_com(String url) {
	    System.out.println("go to the news "+url);
	}
/*
	@Then("Validate Header links should be")
	public void validate_header_links_should_be(DataTable table) {
	    System.out.println("Validate Header links should be ");
	    System.out.println(table);
	    
	    System.out.println();
	    System.out.println(table.asMaps());
	    List<Map<String,String>> data=table.asMaps();
	    System.out.println();
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println("**********************");
	    
	    System.out.println(data.get(0).get("name"));
	    System.out.println(data.get(0).get("value"));
	    System.out.println(data.get(1).get("name"));
	    System.out.println(data.get(1).get("value"));
	   // System.out.println(data.get(2));
	    
	}
	*/
	
	@Then("Validate Header links should be")
	public void validate(List<TopLinkClass> all_link) {
		//Assert.assertEquals("A", "a");
		//Assert.fail("Not found");
		System.out.println("Validate Header links should be");
		System.out.println(all_link.get(0).name+"  ----  "+all_link.get(0).value);
	}
	
	@DataTableType
	public TopLinkClass entry(Map<String,String>map) {
		System.out.println("x");
		return new TopLinkClass(map.get("name"), map.get("value"));
	}
	
	

}
