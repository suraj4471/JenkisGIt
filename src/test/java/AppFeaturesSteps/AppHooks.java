package AppFeaturesSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QaPckege.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	WebDriver driver;
	Driverfactory  df;
	
	@Before
	public void LunchBrowser() throws IOException
	
	{
		
		Properties prop= new Properties();
		String path = System.getProperty("user.dir")+"//src//test//resources//config.properties";
		FileInputStream files= new FileInputStream(path);
		prop.load(files);
		String browserName = prop.getProperty("browser");
		
	//	String mavenBrowserName=System.getProperty("clibrowser");
		//this use for cmd mvn test -Dclibrowser=Firefox (this is  type for cmd) 
		
		
 df= new Driverfactory();
	 driver = df.initBrowser(browserName);
	driver.manage().window().maximize();
	}
	
	
	@After(order=2)
	public void faildTestCase(Scenario scenario)
	{
		boolean isScenarioFailed = scenario.isFailed();
		
		if(isScenarioFailed) {
			
			String scenarioName=scenario.getName();
			String name = scenarioName.replace(" ", "");
			 byte[] source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 
			 scenario.attach(source,"image/png", name);
		}
	}
	
@After(order=1)
public void CloseBrowser()
{
	driver.close();
}

	

}
