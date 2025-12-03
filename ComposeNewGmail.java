package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeNewGmail {
	
	@Given("a user is logged into Gmail")
	public void a_user_is_logged_into_gmail() {
	    System.out.println("a user is logged into Gmail");
	}

	@When("the user clicks on the compose button")
	public void the_user_clicks_on_the_compose_button() {
	    System.out.println("the user clicks on the compose button");
	}

	@And("a new mail dialog box is displayed")
	public void a_new_mail_dialog_box_is_displayed() {
	    System.out.println("a new mail dialog box is displayed");
	}

	@And("the user composes a new email")
	public void the_user_composes_a_new_email() {
	    System.out.println("the user composes a new email");
	}

	@And("the user clicks on the send button")
	public void the_user_composes_new_email() {
		System.out.println("the user clicks on the send button");
	}

	@Then("the email is sent")
	public void the_email_is_sent() {
	    System.out.println("the email is sent");
	}

}
