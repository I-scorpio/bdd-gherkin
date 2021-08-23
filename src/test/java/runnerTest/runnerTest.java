package runnerTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/QAassessment.feature", glue ={"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty"})

public class runnerTest {

}
