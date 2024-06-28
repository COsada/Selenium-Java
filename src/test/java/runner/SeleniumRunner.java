package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/selenium.feature",
		glue = {"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-Report", "json:target/report.json"})

public class SeleniumRunner {

}
