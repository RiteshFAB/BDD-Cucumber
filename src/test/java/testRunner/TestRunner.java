package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Facebook.feature",
glue="stepDefination",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:Reports//htmlReport.facebook.html"}




		)

public class TestRunner {

}
