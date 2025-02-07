package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionStepDef {

	
	  @Given("^I have (\\d+) laptop$")
	  public void I_have_1_laptop(int count) {
	  System.out.println("Laptop Count"+count);
	 
	  }
 

	  @Given("^I have scored (\\d+\\.\\d+) CGPA$")
	  public void i_have_scored_CGPA(float num) throws Throwable {
		  
		System.out.println("CGPA is "+num);
	   
	}
	  
	  @Given("^\"([^\"]*)\" is elder than \"([^\"]*)\" and \"([^\"]*)\"$")
	  public void is_elder_than_and(String arg1, String arg2, String arg3) throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	     
		  System.out.println(arg1 +"is elder than "+arg2 +" and "+arg3);
	  } 
	  
}
