package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleStepDefinition extends SeleniumUtility {
	@Given("^User has already on google search page$")
    public void user_has_already_on_google_search_page() { //throws Throwable {
        //throw new PendingException();
    }

    @When("^user types (.+) in search input field and press enter key$")
    public void user_types_in_search_input_field_and_press_enter_key(String texttobesearched) { //throws Throwable {
       // throw new PendingException();
    }

    @Then("^User should able to get result page with title having (.+)$")
    public void user_should_able_to_get_result_page_with_title_having(String texttobesearched) {// throws Throwable {
       // throw new PendingException();
    }

}


	 
