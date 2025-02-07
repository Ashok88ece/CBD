package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExample {
	
	WebDriver driver;
	@Given("^Ashok login to HRM$")
	public void ashok_login_to_HRM() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Ashok Enter \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void ashok_Enter_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	
	 @When("^Ashok Clicked Login Button$") 
	 public void ashok_Clicked_Login_Button() throws Throwable 
	 { 
		 // Write code here that turns	 * the phrase above into concrete actions
	 driver.findElement(By.id("btnLogin")).click(); }
	 



}
