package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDef {
	
	WebDriver driver;

	@Given("^User login to HRM$")
	public void user_login_to_HRM() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enter login credentials$")
	public void user_enter_login_credentials(DataTable dataTable) throws Throwable {
		
		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^Clicked Login Button$")
	public void clicked_Login_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	/*
	 * @Then("^Landing page is HOME$") public void landing_page_is_HOME() throws
	 * Throwable {
	 * 
	 * }
	 */



}
