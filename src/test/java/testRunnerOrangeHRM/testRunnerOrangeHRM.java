package testRunnerOrangeHRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefile/OrangeHRMfeature.feature",glue = "stepDefinitionOrangeHRM",stepNotifications = true, 
							monochrome = true, dryRun = false,plugin = {"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
									"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
									"html:Report/sampleTest.html"})

public class testRunnerOrangeHRM {

}
