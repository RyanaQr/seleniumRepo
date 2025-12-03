package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step-browser is open");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
	//	System.out.println("Page Title: " + driver.getTitle());
		//driver.quit();
		
	}

	@When("the user is on the google search page")
	public void the_user_is_on_the_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step-user is on the google search page");
	}

	@And("the user enters a text in the search box")
	public void the_user_enters_a_text_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step- the user enters a text in the search box");
	}

	@And("the user hits enter")
	public void the_user_hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step - the user hits enter");
	}

	@Then("the user should be navigated to search result")
	public void the_user_should_be_navigated_to_search_result() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step - the user should be navigated to search result");
	}




}
