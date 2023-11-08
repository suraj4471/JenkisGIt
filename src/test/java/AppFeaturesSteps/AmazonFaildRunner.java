package AppFeaturesSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features= {"C:\\Users\\HP\\eclipse-workspace\\ATTSeleniumProject\\src\\test\\resources\\AppFeature"},
		features= {"@target/failedrun.txt"},
		glue= {"AppFeaturesSteps"},
		plugin= {"pretty","rerun:target/failedrun.txt"}
		
		
		
		)

public class AmazonFaildRunner extends AbstractTestNGCucumberTests  {

}
