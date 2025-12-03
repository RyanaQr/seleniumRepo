package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleGmail {
	
	@Given("a person is logged into Gmail")
	public void a_person_is_logged_into_gmail() {
	    System.out.println("a person is logged into Gmail");
	}

	@When("the person clicks on the compose button")
	public void the_person_clicks_on_the_compose_button() {
	    System.out.println("the person clicks on the compose button");
	}

	@And("a new mail dialog box is open")
	public void a_new_mail_dialog_box_is_open() {
	    System.out.println("a new mail dialog box is open");
	}

	@And("the person composes a new email")
	public void the_person_composes_a_new_email() {
	    System.out.println("the person composes a new email");
	}

	@And("the person clicks on the down arrow button next to the send button")
	public void the_person_clicks_on_the_down_arrow_button_next_to_the_send_button() {
	    System.out.println("the person clicks on the down arrow button next to the send button");
	}

	@And("the person selects a date and time to schedule the email for sending")
	public void the_person_selects_a_date_and_time_to_schedule_the_email_for_sending() {
	    System.out.println("the person selects a date and time to schedule the email for sending");
	}

	@Then("the email is scheduled for sending")
	public void the_email_is_scheduled_for_sending() {
	    System.out.println("the email is scheduled for sending");
	}

}
