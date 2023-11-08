package AppFeaturesSteps;

import Pages.SearchPage;
import QaPckege.Driverfactory;
import io.cucumber.java.en.When;

public class SearchPageSteps {
	
	SearchPage searchpage= new SearchPage(Driverfactory.getDriver());
	@When("user enters the product name {string}")
	public void user_enters_the_product_name(String ProdName) {
	
		searchpage.searchProduct(ProdName);
	}

	@When("Click on search button")
	public void click_on_search_button() {
	   searchpage.ClickBt();
	}


	

}
