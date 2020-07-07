package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//AddCustomer.feature",
                  glue="com.telecom.stepdefinition",
                  dryRun=false,
                  plugin="html:target//Cucumber-html-reports",
                  monochrome=true)


public class TestRunner {

	
	
}
