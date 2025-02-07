package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thanos_StepDefinition_Hooks {
	

@Given("^Thanos has infinity stones$")
public void thanos_has_infinity_stones() throws Throwable {
    System.out.println("Thanos has infinity stones");
}

@When("^thanos snap his fingers$")
public void thanos_snap_his_fingers() throws Throwable {
   System.out.println("thanos snap his fingers");
}

@Then("^Half of the living things died$")
public void half_of_the_living_things_died() throws Throwable {
System.out.println("Half of the living things died");
}

}
