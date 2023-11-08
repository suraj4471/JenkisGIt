package AppFeaturesSteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import QaPckege.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	HomePage  homepage= new HomePage(Driverfactory.getDriver());
	@Given("user at the landing page")
	public void user_at_the_landing_page() {
		WebDriver driver = Driverfactory.getDriver();
		driver.get("https://www.amazon.in");
		
	   
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String Titlestring) {
	
		String title = homepage.TitleOfPage();
		boolean isPresent = title.contains(Titlestring);
		Assert.assertTrue(isPresent);
	
	}

	

	@Then("Cart icon  should get dispalay")
	public void cart_icon_should_get_dispalay() {
		boolean isDisplay = homepage.VerifyCart();
		Assert.assertTrue(isDisplay);
	    
	}

	@When("user should be click on Outdoor and sportsToy")
	public void user_should_be_click_on_outdoor_and_sports_toy() {
	    homepage.enterToOutdoorSports();
	}

	

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		homepage.goToSigninPage();
		
	   
	}

	@When("user enters username {string}")
	public void user_enters_username(String name) {
		homepage.enterUsername(name);
	   
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
	homepage.enterPassword(pwd);
	}





}
