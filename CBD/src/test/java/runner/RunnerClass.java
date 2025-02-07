package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/OpenGoogle.feature",glue="stepDefinitons",
		
			//dryRun=false,
			//monochrome=true,
            strict =true,
			format= {"html:report/WebReport","json:report/jsonreport.json"})
			//tags= {"@Hooks"}
			
public class RunnerClass {
	
	//It should combines feature file & step definition
	//Runner Define

}
