package StepDefinitions;

import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Createaccount;
import pages.Loginpage;
public class StepDefinition {
	
	Loginpage loginpage=new Loginpage(DriverFactory.driver);
	Createaccount account=new Createaccount(DriverFactory.driver);
	
	@Given("user launches Shopwitheg")
	public void user_launches_shopwitheg() {
	   
		DriverFactory.driver.get("https://stg.shopwitheg.com/");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage.clickloginButton();
	    
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		loginpage.enterEmail();
		loginpage.password();
	    
	}

	@Then("user is successfully logggedin")
	public void user_is_successfully_logggedin() {
		loginpage.clicksignin();
	   
	}





@When("user clicks on createaccount button")
public void user_clicks_on_createaccount_button() {
	
	account.createaccount();
}
	
	@When("user enters firstname  with lessthan 2 characters")
	public void user_enters_firstname_with_lessthan_2_characters() {
	    account.enterfirstname();
	    account.clickaccount();
	 
	}


@Then("validate the error message")
public void validate_the_error_message() {
    
	account.errorvalidation();
	
}
}


	