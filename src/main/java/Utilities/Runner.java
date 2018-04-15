package Utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
		                   "json:target/cucumber-reports/CucumberTestReport.json"},
               features = {"src/test/resources/"},
               glue ={"Utilities" , "Tests"})
public class Runner
{

}
