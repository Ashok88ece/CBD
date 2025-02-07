package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("^User is on Login page$")
	 public void User_is_on_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@When("^the user enter the valid Username and Password$")
	public void the_user_enter_the_valid_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^then user should be navigated to Home page$")
	public void then_user_should_be_navigated_to_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status = driver.findElement(By.id("welcome")).isDisplayed();
		
		if(status) {
			System.out.println("User Navigated to Home Page");
		}
		else {
			System.out.println("Invalid User login");
		}
	    
	}


	
	

}
