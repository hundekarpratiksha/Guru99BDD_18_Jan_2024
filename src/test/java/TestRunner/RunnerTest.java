package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"AllFeatureFile"},
		glue= {"StepDefination"},
		monochrome= true,
		dryRun = false,
		plugin= {"pretty", "com.aventstack.extentreports.cucumber.ExtentCucumberAdapter:"}
		)


public class RunnerTest extends AbstractTestNGCucumberTests {

}
