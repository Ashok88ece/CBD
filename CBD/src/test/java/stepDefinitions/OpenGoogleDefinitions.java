package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;

	@Given("^User is enetering IPIGS\\.in$")
	public void user_is_enetering_IPIGS_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	    
	}

	@When("^User is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	   
	}

	@When("^enter the return key$")
	public void enter_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status = driver.findElement(By.partialLinkText("ipigs")).isDisplayed();
		if (status) {
			System.out.println("Return Displayed");
		}
		else {
			System.out.println("Results Failed");
		}
	    
	}


}
