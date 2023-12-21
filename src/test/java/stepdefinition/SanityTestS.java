package stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import Genericlib.WebdriverCommonlib;
import PageObjectRepolib.Login;
import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@RunWith(Cucumber.class)
public class SanityTestS extends Login{


	@Given("The user is on webBrowser")
	public void the_user_is_on_web_browser() {
		openBrowser("Chrome");
		System.out.println("The user is Currently on the google WebBrowser");

	}

	@When("the user Open the Google browser")
	public void the_user_open_the_google_browser() {
		GoogleLink();
		WebdriverCommonlib.maximize();
	}

	@When("Enter the URL\"https:\\/\\/www.demoblaze.com\\/\"")
	public void enter_the_url_https_www_demoblaze_com() {
		driver.findElement(google).sendKeys("https://www.demoblaze.com");
		driver.findElement(searchBtn).click();
	}

	@Then("It should navigate to Google homepage")
	public void it_should_navigate_to_google_homepage() {
		String title = driver.getTitle();
		assert title.contains("Google");
	}

	@Then("It should generate the list of Related Sites")
	public void it_should_generate_the_list_of_related_sites() {
		Login.links();
	}

	@Given("The user is on webBrowser and giving the greetings")
	public void the_user_is_on_web_browser_and_giving_the_greetings() {
		openBrowser("Chrome");
		System.out.println("The user is Currently on the google WebBrowser");
	}

	@When("the user open google browser")
	public void the_user_open_google_browser() {
		GoogleLink();
		WebdriverCommonlib.maximize();
	}

	@When("Enter the Url")
	public void enter_the_url() {
		driver.findElement(google).sendKeys("https://www.demoblaze.com");
		driver.findElement(searchBtn).click();
	}
	

	@Then("It should display {string}")
	public void it_should_display(String string) {
		string = "Welcome to Demo_blaze";
		String Actualmessage = driver.getTitle();
		if (Actualmessage.equalsIgnoreCase(string)) {
			System.out.println("Message verification passed");
		} else {
			System.out.println("Welcome message error, message displayed is : " + Actualmessage);
		}
	}

	@Given("The URL has to be Valid and exist on browser")
	public void the_url_has_to_be_valid_and_exist_on_browser() {
		openBrowser("Chrome");
		System.out.println("The user is Currently on the google WebBrowser");
	}

	@Given("The URL has direct to sign up page")
	public void the_url_has_direct_to_sign_up_page() {
		WebdriverCommonlib.maximize();
	}

	@When("the user open the google browse")
	public void the_user_open_the_google_browse() {
		GoogleLink();
	}

	@When("enters the url")
	public void enters_the_url1() {
		driver.findElement(google).sendKeys("https://www.demoblaze.com");
		driver.findElement(searchBtn).click();
	}

	@When("click on the site link")
	public void click_on_the_site_link() {
		/*
		 * List <WebElement> links = driver.findElements(By.tagName("h3"));
		System.out.println("List of links are : " + links);
		
		String Matchinglink = "demoblaze";
		WebElement firstLink = links.get(0);

		if (firstLink.isDisplayed() && firstLink.isEnabled() && firstLink.getText().equalsIgnoreCase(Matchinglink)) {

			firstLink.click();
			System.out.println("Clicked the Demo blaze link");
		} else {
			System.out.println("The first link is not Demo blaze link");
		}
		*/

		openBaseUrl();
		
	}

	@When("click on signup")
	public void click_on_signup() {
		waittime(5);
	}

	@Then("It should navigate to Demo_blaze Homepage")
	public void it_should_navigate_to_demo_blaze_homepage() {
		String ActualTitle = driver.getTitle();
		driver.getCurrentUrl();
		String ExpectedTitle = "STORE";
		if (ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("The user is at Demo Blaze Homepage");
		} else
			System.out.println("The user is not at Demo Blaze Homepage");
	}

	@Then("it should direct to signup page")
	public void it_should_direct_to_signup_page() {
		String ExpectedMessage = "Sign up";
		WebElement message = driver.findElement(SignUpText);
		String msg = message.getText();
		if (msg.equalsIgnoreCase(ExpectedMessage)) {
			System.out.println("The user is at Signup page");
		} else {
			System.out.println("Sign up page not found");
		}

	}

	
	@Given("Name field has to be visible and editable")
	public void name_field_has_to_be_visible_and_editable() {
		the_url_has_to_be_valid_and_exist_on_browser();
		the_url_has_direct_to_sign_up_page();
	}
	
	

	@When("the user opens the browser")
	public void the_user_opens_the_browser() {
		
	}

	@When("Enters the url")
	public void enters_the_url() {
		openBaseUrl();
	}

	@When("enter valid name")
	public void enter_valid_name() {
		Login.Signup();
		SignupUsername("Edureka");
	}

	@Then("It should display the name entered")
	public void it_should_display_the_name_entered() throws Exception {
		Thread.sleep(3000);
		WebElement text = driver.findElement(SignupUser);
		String name = text.getText();
		System.out.println("Username entered is = " + name);
	}
}
