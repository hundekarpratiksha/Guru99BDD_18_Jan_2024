package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"AllFeatureFile"},
		glue= {"StepDefination"},
		monochrome= true,
		dryRun = false
		)


public class RunnerTest extends AbstractTestNGCucumberTests {

}
