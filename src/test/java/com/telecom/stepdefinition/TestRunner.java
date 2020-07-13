package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                  glue="com.telecom.stepdefinition",
                  dryRun=false,
                  plugin="html:target//Cucumber-html-reports",
                  monochrome=true,
                  tags={"@sanity,@karthi"})


public class TestRunner {

	
	
}
