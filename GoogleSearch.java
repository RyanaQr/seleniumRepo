package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	private static final String GOOGLE_TITLE_PART = "Google";
	WebDriver driver = new ChromeDriver();

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step-browser is open");
			
	}

	@When("the user is on the google search page")
	public void the_user_is_on_the_google_search_page() {
	    driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
        boolean titleContainsGoogle = actualTitle.contains(GOOGLE_TITLE_PART);
        
        Assertions.assertThat(titleContainsGoogle);
        System.out.println("Inside step- User is on " + actualTitle + " search page");	
	//	System.out.println("Page Title: " + driver.getTitle());
		//driver.quit();
	}

	@And("the user enters a text in the search box")
	public void the_user_enters_a_text_in_the_search_box() {
	    String searchQuery = "Cucumber Java";
		WebElement searchBox = driver.findElement(By.name("q"));
		//String searchUrl = "https://www.google.com/search?q=" + searchQuery.replace(" ", "+");
        searchBox.sendKeys(searchQuery);
        System.out.println("Typed search query: " + searchQuery);
        
        try {
            Thread.sleep(3000); // Wait for the results page to load
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}

	@And("the user hits enter")
	public void the_user_hits_enter() {
	    WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.ENTER);
        System.out.println("Search submitted via ENTER key.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
		System.out.println("Inside step - the user hits enter");
	}

	@Then("the user should be navigated to search result")
	public void the_user_should_be_navigated_to_search_result() {
	    String testStatus = " ";
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
		String searchQuery = "Cucumber Java";
		String pageTitle = driver.getTitle();
        System.out.println("Current Page Title: " + pageTitle);
        
        if (pageTitle.contains(searchQuery)) {
            testStatus = "PASSED";
            System.out.println("VERIFICATION " + testStatus + ": Page title contains the search query.");
        } else {
            System.out.println("VERIFICATION FAILED: Page title does not contain the search query.");
        }
		driver.quit();
		System.out.println("Browser closed and driver process terminated successfully.");
	}
}
