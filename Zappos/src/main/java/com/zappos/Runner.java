package com.zappos;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(   dryRun = false,
					strict = true,
					monochrome = true,
					features = "src/test/resources",
					glue = "com.zappos.steps",
					plugin={
							 "pretty",
							 "html:target/test-report",
							 "json:target/test-report.json",
							 "json:target/cucumber-report.json",
							 "junit:target/test-report.xml"
							 }
					)


public class Runner {

}
