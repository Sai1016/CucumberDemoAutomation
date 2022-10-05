package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="//Users//saimadhavi//QA//CucumberDemoAutomation//src//test//FeatureFile//Register.feature",
glue = {"StepDefinition"},dryRun = false,plugin ={"pretty","html:test-output"})
public class runner {
}
