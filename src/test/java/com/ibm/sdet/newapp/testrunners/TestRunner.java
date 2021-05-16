package com.ibm.sdet.newapp.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/ibm/sdet/newapp/features",
		glue = {"com.ibm.sdet.newapp.stepdefinitions", "com.ibm.sdet.newapp.hooks"},
		dryRun = true,
		monochrome = true,
		plugin = {"pretty","junit:target/reports/test_report.xml", 
				  "json:target/reports/test_report.json",
				  "html:target/reports/test_report.html"}
		)
		
public class TestRunner {

}
