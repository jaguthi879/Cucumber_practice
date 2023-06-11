package Features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/Features",
                 glue="stepdefinitionfiles", 
                 monochrome=true,
                 plugin= {"pretty","html:report"},
                 dryRun= false,tags="@p100"
                 )

public class Testrunner extends AbstractTestNGCucumberTests {
	
}


