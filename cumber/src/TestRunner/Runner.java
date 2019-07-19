package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;	


//@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\shailesh.jadhav\\eclipse-workspace\\BDD\\features\\MyTest.feature",glue={"StepDefinition"})	
public class Runner {

}
