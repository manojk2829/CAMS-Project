package login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login {
	
	@Given("I login {string}")
    public void login_cms(String appliucation_name) {
    	System.out.println("I login "+appliucation_name);
    }
    
    @And("Click Manage Brand link")
    public void click_manage_brand_link() {
    	System.out.println("Click Manage Brand link");
    }
    @And("Open Brand Creation Page")
    public void openBrandPage() {
    	System.out.println("Open Brand Creation Page");
    }

}
