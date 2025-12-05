Package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarredMailGmail {
	WebDriver driver = new ChromeDriver();
	private final String GMAIL_URL = "https://mail.google.com/";
	String username = "ryanaquadirDS@gmail.com";
	String password = "OnAdayLike2day!";

    private GmailInboxPage inboxPage;
    private String emailSubject;
	
    @Given("the user is logged into the gmail application")
    public void the_user_logged_into_gmail_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Use the Inbox URL directly to bypass login for demonstration
        driver.get("https://mail.google.com/mail/u/0/#inbox"); 
        
        inboxPage = new GmailInboxPage(driver);
        inboxPage.verifyUserIsLoggedIn();
    }

    @When("the user marks an email with a star")
    public void the_user_marks_an_email_with_star() {
        emailSubject = inboxPage.markFirstEmailWithStar();
    }

    @Then("the email should be visible in the starred mail section")
    public void email_visible_in_starred_mail_section() {
        inboxPage.navigateToStarredMail();
        inboxPage.verifyEmailInStarredMail(emailSubject);

    }

    @And("the email should remain accessible from the inbox")
    public void the_email_remain_accessible_from_inbox() {
        inboxPage.verifyEmailRemainsInInbox(emailSubject);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("\nBrowser closed and driver terminated.");
        }
    }

}