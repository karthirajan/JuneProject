package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		
		ca.launch("http://www.demo.guru99.com/telecom/");
		
		System.out.println("executed before every scenario");

	}
	
	
	
	@After
	public void afterScenario() {
		
		driver.close();
		System.out.println("executed after every scenario");

	}

}
