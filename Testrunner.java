package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "C:\\Users\\Kiaq_Lap_25\\eclipse-workspace\\Onepiece\\src\\test\\resourses\\FeatureFile",
    glue = "com.stepdefinition",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json"
    },
    monochrome = true,
    publish = true
)

public class TestRunner {

}
