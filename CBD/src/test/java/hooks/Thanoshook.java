package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Thanoshook {
	 
	@Before
	public void beforesnapping() {
		
		System.out.println("Thanos Collecting Infinity stones");
		
	}

	@After
	public void aftersnapping() {
		System.out.println("Thanos Taking Rest");
	}
}
