package AppFeaturesSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\HP\\eclipse-workspace\\ATTSeleniumProject\\src\\test\\resources\\AppFeature"},
		glue= {"AppFeaturesSteps"},
		plugin= {"pretty", "html:target/cucumber-report/amzonreport.html",
				"json:target/cucumber-report.json"},
		tags= "@smoke"
		
		
		
		)

public class AmzonRunnerTest extends AbstractTestNGCucumberTests  {

}
