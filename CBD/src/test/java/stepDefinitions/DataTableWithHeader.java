package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeader {
	WebDriver driver;
	@Given("^This User login to HRM$")
	public void this_User_login_to_HRM() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("^This User enter login credentials$")
	public void this_User_enter_login_credentials(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List <Map<String,String >>Keypair = dataTable.asMaps(String.class, String.class);
		String username = Keypair.get(0).get("Username");
		String password = Keypair.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^This User Clicked Login Button$")
	public void this_User_Clicked_Login_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

}
