package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefWithData {
	WebDriver driver;

@Given("^User is on the Login page$")
public void user_is_on_the_Login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^the user enter the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void the_user_enter_the_valid_credentials_and(String arg1, String arg2) throws Throwable {
	driver.findElement(By.id("txtUsername")).sendKeys(arg1);
	driver.findElement(By.id("txtPassword")).sendKeys(arg2);
    
}

@When("^clicks  the login button$")
public void clicks_the_login_button() throws Throwable {
   
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^then user should see Home page$")
public void then_user_should_see_Home_page() throws Throwable {
	boolean status = driver.findElement(By.id("welcome")).isDisplayed();
	
	if(status) {
		System.out.println("User Navigated to Home Page");
	}
	else {
		System.out.println("Invalid User login");
	}
    
    
}


}
