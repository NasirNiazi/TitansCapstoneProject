package step.Definition;

import org.junit.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail page")
	public void user_is_on_retail_page() {
	
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	   
	}

	@When("User Click on login")
	public void user_click_on_login() {
	 
	}

	@When("User enter userName {string} and password {string}")
	public void user_enter_user_name_and_password(String string, String string2) {
	 
	}

	@When("User click to login button")
	public void user_click_to_login_button() {
	  
	}

	@Then("User should be logged in to MyAccount dashbourd")
	public void user_should_be_logged_in_to_my_account_dashbourd() {

}
//
//	@When("User click on {string} link")
//	public void user_click_on_link(String string) {
//	 
//	}
//
//	@When("User fill affliate form with below information")
//	public void user_fill_affliate_form_with_below_information(DataTable dataTable) {
//	  
//	}
//
//	@When("User check on About us check box")
//	public void user_check_on_about_us_check_box() {
//	    
//	}
//
//	@When("User click on Continue button")
//	public void user_click_on_continue_button() {
//	    
//	}
//
//	@Then("User should see a seccess massege")
//	public void user_should_see_a_seccess_massege() {
//	   
//	}
//
//	@When("User click on ?Edit your affiliate informationlink")
//	public void user_click_on_edit_your_affiliate_informationlink() {
//	    
//	}
//
//	@When("user click on Bank Transfer radio button")
//	public void user_click_on_bank_transfer_radio_button() {
//	   
//	}
//
//	@When("User fill Bank information with below information|bankName|abaNumber|swiftCode|accountName|accountNumber|")
//	public void user_fill_bank_information_with_below_information_bank_name_aba_number_swift_code_account_name_account_number() {
//	
//	}
//
//	@Then("User should see a success message")
//	public void user_should_see_a_success_message() {
//	   
//	}
//
//	@When("User click on ?Edit your account information? link")
//	public void user_click_on_edit_your_account_information_link() {
//	
//	}
//
//	@When("User modify below information |firstname|lastName|email|telephone|")
//	public void user_modify_below_information_firstname_last_name_email_telephone() {
//	  
//	}
//
//	
//
//	@Then("User should see a message ?Success: Your account has been successfully updated.?")
//	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
//	
//	}
//
}
