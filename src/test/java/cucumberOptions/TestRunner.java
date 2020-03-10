package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//feature file
//step defination

	
	//Create a package -->Cucumber option, create class test runner
	//To trigger this we need to use 
	
	//if you have multiple feature file then give full path
	//step defination 
	//glue is the paramater to define step defination file
	//Cucumber and step defination should have same parent
	//no multple step defination for single jhekin kine 
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/feature/Login.feature",
								glue = "stepDefination")
	public class TestRunner extends AbstractTestNGCucumberTests{

}
