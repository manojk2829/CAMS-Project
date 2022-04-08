package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources",
		//features="@rerun/failed_scenario.txt",
		glue={"login","create","edit","steps","cnn"},
		plugin={"html:target/cucumber-report.html", "rerun:rerun/failed_scenario.txt"},
		//tags="@BuyComputer and not @BuyingDesktop or @BuyingLaptop or @tagBrand and not @BrandCreate or @BrandEdit"
		//tags="@BuyComputer and not @BuyingDesktop or @BuyingLaptop or @BrandCreate or @BrandEdit"
	    //="@BuyComputer or @BrandEdit or @BrandCreate"
		
		tags="@tagBrand",		
		monochrome=true
		
		)
// OR ka matlab ye nahi ki dono me se koe ek eska matlab 2no Annotation scenarios run karna hai.
// And ke bad not lagane par turant bad wala Annotation @ nahi execute hota hai.
//OR ke turant bad aap not nahi laga sakte hai. Or ke bad Not ka koe matlab nahi hota hai. 

public class Part_3_My_Runner extends AbstractTestNGCucumberTests {

}
