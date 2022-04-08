package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features="src/test/resources",
		  glue = {"login","create","edit","steps"},
		  plugin= {"html:target/Cucumber-reports.html"}
		  //tags= "@FirstTest"
		)
public class MyRunner extends AbstractTestNGCucumberTests {
	
	

}
