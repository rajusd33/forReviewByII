package com.zappos.baseScript;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(   dryRun = false,
					strict = true,
					monochrome = true,
					features = "src/test/resources",
					glue = "com.zappos.baseScript",
					plugin={
							"pretty",
							}
					)


public class Runner {

}
